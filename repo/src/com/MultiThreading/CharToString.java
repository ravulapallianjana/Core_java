package com.MultiThreading;

import java.util.Scanner;
//A company wants to encode a text message by replacing each 
//character in a string with the next alphabet (e.g., a→b, b→c, ..., z→a).
//Write a program using string operations to encode the given string.
//Input: "abc" → Output: "bcd"
//Input: "xyz" → Output: "yza"
public class CharToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string :");
		String s = sc.nextLine();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'y') {
				s1 = s1 + (char) (ch + 1);

			} else if (ch == 'z') {
				s1 = s1 + 'a';
			} else if (ch >= 'A' && ch <= 'Y') {
				s1 = s1 + (char) (ch + 1);
			} else if (ch == 'Z') {
				s1 = s1 + 'A';

			} else {
				s1 = s1 + ch;
			}

		}
		System.out.println(s1);

	}

}
