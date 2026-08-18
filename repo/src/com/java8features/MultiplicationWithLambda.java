package com.java8features;

@FunctionalInterface
interface in3 {
	double multiplication(int a, int b, int c);

}

public class MultiplicationWithLambda {

	public static void main(String[] args) {
		System.out.println("main method started ");
		in3 i = (a, b, c) -> {
			double mul = a * b * c;
			return mul;
		};
		System.out.println(i.multiplication(10, 20, 30));
	}

}
