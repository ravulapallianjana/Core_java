package com.ExceptionHandling;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		try {
			int arr[] = { 10, 20, 30, 40, 50 };
			System.out.println("enter your index  num:");
			int a1 = sc.nextInt();

			System.out.println("enter your number");
			int a = sc.nextInt();

			int divide = arr[a1] / a;
			System.out.println(divide);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
