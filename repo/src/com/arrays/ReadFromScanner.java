package com.arrays;

import java.util.Scanner;

public class ReadFromScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index size:");
		int n = sc.nextInt();
		int[] size = new int[n];


//for input passing
		for (int i = 0; i < n; i++) {
			size[i] = sc.nextInt();

		}
//		for reading from scanner
		for (int num : size) {
			System.out.println(num);
		}

	}

}
