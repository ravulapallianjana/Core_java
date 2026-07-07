package com.StringHandling;

public class Stringprogram01 {

	public static void main(String[] args) {

		String s = "anjana";
		String s1 = "anjana";
		String s2 = new String("java");
		String s3 = new String("java");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		if (s.equals(s1) ) {
			System.out.println("string constant pool stored");
		} else {
			System.out.println("stored different object");
		}
		System.out.println("******************************");

		if (s2 .equals(s3)) {
			System.out.println("stored in heap memory");
		}
	}

}
