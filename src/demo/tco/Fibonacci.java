package demo.tco;

import java.math.BigInteger;

import static demo.tco.TailCalls.done;

public class Fibonacci
{
    private static TailCall<BigInteger> fibonacciTailRec(final BigInteger current, final BigInteger next, final int n)
    {
        return n > 0
            ? () -> fibonacciTailRec(next, next.add(current), n - 1)
            : done(current);
    }

    public static BigInteger fibonacci(final int n)
    {
        return fibonacciTailRec(BigInteger.ZERO, BigInteger.ONE, n).invoke();
    }
}
