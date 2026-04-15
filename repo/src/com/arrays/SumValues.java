package com.arrays;

import java.util.Scanner;

public class SumValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your values here:");
		int n=sc.nextInt();
		int[] size = new int[n];
int sum=0;

		//for input passing
				for (int i = 0; i < n; i++) {
					size[i] = sc.nextInt();

				}
//				for reading from scanner
				for (int num : size) {
					System.out.print(num+" ");
					sum=sum+num;
				}
				
System.out.print(sum);
	}

}
