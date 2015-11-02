package com.example;

import static com.example.BigIntUtils.decrement;
import static com.example.BigIntUtils.multiply;
import static com.example.TailCalls.call;
import static com.example.TailCalls.done;

import java.math.BigInteger;

public class Factorial {
	
	private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number) {
		if (number.equals(BigInteger.ONE))
			return done(factorial);
		else 
			return call(() -> factorialTailRec(multiply(factorial, number), decrement(number)));
	}
	
	public static BigInteger factorial(final BigInteger number) {
		return factorialTailRec(BigInteger.ONE, number).invoke();
	}
	
}
