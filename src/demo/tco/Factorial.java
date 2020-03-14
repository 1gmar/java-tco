package demo.tco;

import java.math.BigInteger;

import static demo.tco.TailCall.done;

public class Factorial
{
    private static TailCall<BigInteger> tailFactorial(final BigInteger factorial, final int n)
    {
        return n > 1 ? () -> tailFactorial(factorial.multiply(BigInteger.valueOf(n)), n - 1) : done(factorial);
    }

    public static BigInteger factorial(final int number)
    {
        return tailFactorial(BigInteger.ONE, number).invoke();
    }
}
