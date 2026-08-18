package com.java8features;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int num = sc.nextInt();
		Runnable r = () -> {
			boolean status = true;

			if (num <= 1) {
				status = false;
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						status = false;
						break;
					}
				}

			}
			if (status) {
				System.out.println(num + ":number is prime");
			} else {
				System.out.println(num + ":number is not prime");
			}
		};
		Thread t = new Thread(r);
		t.start();

	}

}
