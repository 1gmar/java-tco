package demo.tco;

import java.math.BigInteger;

import static demo.tco.BigIntUtils.decrement;
import static demo.tco.BigIntUtils.multiply;
import static demo.tco.TailCalls.done;

public class Factorial
{
    private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number)
    {
        return number.equals(BigInteger.ONE)
            ? done(factorial)
            : () -> factorialTailRec(multiply(factorial, number), decrement(number));
    }

    public static BigInteger factorial(final BigInteger number)
    {
        return factorialTailRec(BigInteger.ONE, number).invoke();
    }
}
