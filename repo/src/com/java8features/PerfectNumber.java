package com.java8features;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int a = sc.nextInt();
		Runnable r = () -> {
			int sum = 0;

			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					sum += i;
				}
			}
			if (sum == a) {
				System.out.println("given number is perfect number:");
			} else {
				System.out.println("given number is not perfect :");
			}
		};
		Thread t = new Thread(r);
		t.start();

	}
}
