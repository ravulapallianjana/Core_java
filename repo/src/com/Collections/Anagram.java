package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your string1");
		String s1 = sc.nextLine();// listen

		System.out.println("enter your string2");
		String s2 = sc.nextLine();// listen

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char [] s3=s1.toCharArray();
		char [] s4=s2.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		if(Arrays.equals(s3,s4)) {
			System.out.println("enter strings are anagram");
		}else {
			System.out.println("not anagram");
		}

	}

}
