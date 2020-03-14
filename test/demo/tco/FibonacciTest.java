package demo.tco;

import org.junit.Test;

import java.math.BigInteger;

import static demo.tco.Fibonacci.fibonacci;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FibonacciTest
{
    @Test
    public void test()
    {
        assertThat(fibonacci(333),
            equalTo(new BigInteger("1751455877444438095408940282208383549115781784912085789506677971125378")));
    }
}