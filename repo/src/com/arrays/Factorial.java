package com.arrays;

import java.util.Scanner;

public class Factorial {

	int sum = 0;
	int result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your strong  num:");
		int n = sc.nextInt();

		int sum = 0;
		int temp=n;
		while (n > 0) {

			int r = n % 10;
			int str = fact(r);
			sum += str;
			n/=10;
		}

		

			if (temp == sum) {
				System.out.println("entered num is strong");
			} else {
				System.out.println(" entered num is not strong");
			}
		
	}

	public static int fact(int r) {
		int result = 1;
		
		while (r > 0) {

			result = result * r;
			r--;

		}
		return result;
	}

}
