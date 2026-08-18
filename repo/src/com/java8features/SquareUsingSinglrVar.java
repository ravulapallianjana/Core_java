package com.java8features;

interface in4 {
	void method(int n);

	
}

public class SquareUsingSinglrVar {

	public static void main(String[] args) {

		in4 i = n -> System.out.println(n * n);

		i.method(5);
	}

}
