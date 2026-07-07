package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMM {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		int a = 0;
		boolean status = false;
		while (!status) {
			try {
				System.out.println("in try block ");

				System.out.println("enter a value:");
				a = sc.nextInt();
				System.out.println(a);
				status = true;
			}catch (InputMismatchException i) {
				System.out.println("wrong input !!!enter only int values:");
				sc.next();
			

			}

		}
	
		sc.close();
	}
}
