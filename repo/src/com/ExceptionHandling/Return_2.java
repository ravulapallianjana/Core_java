package com.ExceptionHandling;

public class Return_2 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		System.out.println(add());
	}

	static int add() {
		try {
//			System.out.println("in try");

			return 100;
		} catch (Exception e) {
			System.out.println("in catch");
			return 200;
		} finally {
			System.out.println("in finally");
			return 300;
		}

	}

}
