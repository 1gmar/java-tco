package demo.tco;

import java.math.BigInteger;

public class Factorial
{
    private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number)
    {
        return number.equals(BigInteger.ONE)
            ? TailCalls.done(factorial)
            : () -> factorialTailRec(BigIntUtils.multiply(factorial, number), BigIntUtils.decrement(number));
    }

    public static BigInteger factorial(final BigInteger number)
    {
        return factorialTailRec(BigInteger.ONE, number).invoke();
    }
}
