package com.StringHandling;

import java.util.Scanner;

public class StringReverseOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string:");
		String s=sc.next();
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
	}

}
