package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentPotal {

	public static void main(String[] args) {
		System.out.println("student data....");
		Scanner sc = new Scanner(System.in);
		try {
			try {
				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException npe) {
				System.out.println("npe catch called ");
			}
			try {
				System.out.println("enter your age");
				int age = sc.nextInt();
				System.out.println(age);

			} catch (InputMismatchException ie) {
				System.out.println("ie catch called..");
			}
			try {
				System.out.println("enter yoy marks");
				int marks = sc.nextInt();
				System.out.println("enter yoy  total subjects");
				int sub = sc.nextInt();
				int total = marks / sub;
				System.out.println(total);
			} catch (ArithmeticException ae) {
				System.out.println(" ae catch called");
			}
			try {
				int arr[] = new int[3];
				arr[5] = 30;
				System.out.println(arr[5]);

			} catch (ArrayIndexOutOfBoundsException ai) {
				System.out.println("ai catch called");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally always exits");
		}
	}

}
