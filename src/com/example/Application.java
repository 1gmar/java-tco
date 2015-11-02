package com.example;

import static com.example.Factorial.factorial;
import static com.example.Fibonacci.fibonacci;

import java.math.BigInteger;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(factorial(BigInteger.valueOf(20)));
		System.out.println(fibonacci(250));
	}

}
