package demo.tco;

import java.math.BigInteger;

import static demo.tco.Factorial.factorial;
import static demo.tco.Fibonacci.fibonacci;

public class Application
{
    public static void main(final String[] args)
    {
        System.out.println(factorial(BigInteger.valueOf(20)));
        System.out.println(fibonacci(250));
    }
}
