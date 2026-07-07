package com.Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter integers values:");
//		int add=sc.nextInt();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		boolean ispalindrome = true;

		for (int i = 0; i < ll.size()/2; i++) {
			if (!ll.get(i).equals(ll.get(ll.size() - 1 - i))) {
				ispalindrome = false;
				break;

			}
		}
			if(ispalindrome) {
				System.out.println("palindrome");
			}else {
				System.out.println("not paindrome");
			}

		}

	}


