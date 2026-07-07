package com.ExceptionHandling;

public class MultiCatchFinally {

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try1 ");
//			System.out.println(10 / 0);
			try {
				System.out.println("in try 2");
				System.out.println(2 * 7);

			} catch (Exception e) {
				System.out.println("in catch2");

			} finally {
				System.out.println("in finally 1");
				try {
					System.out.println("in try 2");
					System.out.println(2 * 7);

				} catch (Exception e) {
					System.out.println("in catch2");
				}
			}

//			System.out.println(10 / 0);
//			System.out.println("hello");

		} finally {
			System.out.println("always excute this block");
			System.out.println(6 / 2);

		}

	}
}
