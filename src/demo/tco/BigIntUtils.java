package demo.tco;

import java.math.BigInteger;

public class BigIntUtils
{
    public static BigInteger decrement(final BigInteger number)
    {
        return number.subtract(BigInteger.ONE);
    }

    public static BigInteger multiply(final BigInteger lhs, final BigInteger rhs)
    {
        return lhs.multiply(rhs);
    }
}
