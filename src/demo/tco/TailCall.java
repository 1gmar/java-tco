package demo.tco;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T>
{
    TailCall<T> apply();

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    default T invoke()
    {
        return Stream.iterate(this, TailCall::apply)
            .filter(Done.class::isInstance)
            .findFirst()
            .map(call -> ((Done<T>) call).result)
            .get();
    }

    static <T> Done<T> done(T result)
    {
        return new Done<>(result);
    }

    final class Done<T> implements TailCall<T>
    {
        final T result;

        private Done(final T result)
        {
            this.result = result;
        }

        @Override
        public TailCall<T> apply()
        {
            return this;
        }
    }
}
