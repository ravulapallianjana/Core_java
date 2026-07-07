package com.StringHandling;

import java.util.Scanner;

public class COUNTVCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string:");
		String s = sc.next();
		int vcount = 0;
		int ccount = 0;
		int spcount = 0;
		String s1 = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' || ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vcount++;
				} else {
					ccount++;
				}
			} else {
				spcount++;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
		System.out.println(spcount);

	}
}
