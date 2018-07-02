package demo.tco;

import java.math.BigInteger;

public class Fibonacci
{
    private static TailCall<BigInteger> fibonacciTailRec(final BigInteger current, final BigInteger next, int n)
    {
        return n > 0
            ? () -> fibonacciTailRec(next, next.add(current), n - 1)
            : TailCalls.done(current);
    }

    public static BigInteger fibonacci(final int n)
    {
        return fibonacciTailRec(BigInteger.ZERO, BigInteger.ONE, n).invoke();
    }
}
