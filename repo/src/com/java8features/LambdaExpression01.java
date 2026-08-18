package com.java8features;

@FunctionalInterface
interface in1 {
	void method1();
}

public class LambdaExpression01 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		in1 i = () -> {
			System.out.println("method one called ");
		};

		i.method1();
		System.out.println("main method ended ");
	}
}
