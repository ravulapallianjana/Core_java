package com.StringHandling;

//2.Write a Java program to find and print only the strings that are palindromes from a given array of strings.
//Input: ["madam", "hello", "civic"]
//Output: madam , civic

public class Palindrome {

	public static void main(String[] args) {
	String[] s= {"madam","hello","civic"};

	for(String s1:s) {
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println(s1);
		}
	}

	}

}
