package com.ExceptionHandling;

public class Airthametic_EX {

	public static void main(String[] args) {
		int n=10;
		try {
			System.out.println("in try block");
		System.out.println(n/0);
//		System.out.println(0/n);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			
		}
	}

}
