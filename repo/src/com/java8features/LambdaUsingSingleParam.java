package com.java8features;

@FunctionalInterface
interface in2 {
	int method2(int a, int b);

}

public class LambdaUsingSingleParam {

	public static void main(String[] args) {
		System.out.println("main method started ");
		in2 i = (a, b) -> {
			int sum = a + b;
			return sum;
		};
		System.out.println(i.method2(10, 30));
	}

}
