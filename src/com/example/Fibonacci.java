package com.example;

import static com.example.TailCalls.call;
import static com.example.TailCalls.done;

import java.math.BigInteger;

public class Fibonacci {
	
	private static TailCall<BigInteger> fibonacciTailRec(BigInteger current, BigInteger next, int n) {
		if (n > 0)
			return call(() -> fibonacciTailRec(next, next.add(current), n - 1));
		else
			return done(current);
	}
	
	public static BigInteger fibonacci(int n) {
		return fibonacciTailRec(BigInteger.ZERO, BigInteger.ONE, n).invoke();
	}
	
}
