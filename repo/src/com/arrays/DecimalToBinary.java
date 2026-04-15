package com.arrays;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 15, 8 };
		int temp;
		int r = 0;
		String rev = "  ";

		for (int num : arr) {
			temp = num;

			while (temp != 0) {
				r = temp % 2;
				temp = temp /2;

				rev = r + rev;
			}
		}
		System.out.println(" "+rev);
	}

}
