package com.arrays;

import java.util.Scanner;

public class NamesStartEnds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");
		int size = sc.nextInt();
		
		System.out.println("enter elements:");
		String[] names = new String[size];

		for (int i = 0; i < size ; i++) {

			names[i] = sc.next();

		}
		for (String str : names) {
			if (str.toLowerCase().startsWith("n") || str.toLowerCase().endsWith("a")) {
				System.out.println(str);
			}
		}

	}

}
