package com.ExceptionHandling;

public class Finally_01 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		try {
			System.out.println("in try");
			
//			System.out.println(10/0);//ArithmeticException
//			System.out.println(10.5/0);//Infinity
			System.out.println(10.0/0.0);//Infinity
			System.out.println(0.0/0.0);//NaN
			System.out.println(10/0.0);//Infinity
			System.out.println(0.0/10);//0.0
			System.out.println(10.5f/0);//Infinity
		}
		finally {
			System.out.println("always excute this block");
		}
		
	}

}
