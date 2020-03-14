package demo.tco;

import java.math.BigInteger;

import static demo.tco.TailCall.done;

public class Fibonacci
{
    private static TailCall<BigInteger> tailFibonacci(final BigInteger current, final BigInteger next, final int n)
    {
        return n > 0 ? () -> tailFibonacci(next, next.add(current), n - 1) : done(current);
    }

    public static BigInteger fibonacci(final int n)
    {
        return tailFibonacci(BigInteger.ZERO, BigInteger.ONE, n).invoke();
    }
}
