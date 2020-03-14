package demo.tco;

import org.junit.Test;

import java.math.BigInteger;

import static demo.tco.Factorial.factorial;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FactorialTest
{
    @Test
    public void test()
    {
        assertThat(factorial(50),
            equalTo(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000")));
    }
}