package com.example;

import java.math.BigInteger;

public class BigIntUtils {
	
	public static BigInteger decrement(final BigInteger number) {
		return number.subtract(BigInteger.ONE);
	}
	
	public static BigInteger multiply(final BigInteger t1, final BigInteger t2) {
		return t1.multiply(t2);
	}
}
