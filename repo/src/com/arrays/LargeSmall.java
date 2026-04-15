package com.arrays;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
	
		
		
		int [] arr= {12,34,56,80,23};
		
		int large=arr[0];
		int small=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
			large=arr[i];
			}else if(arr[i]<small) {
				small=arr[i];
				
			}
			
			
		}
		System.out.println("max"+large);
		
		System.out.println("min"+small);
			
		
		}
//		for(int value:arr) {
//			System.out.println(value);
//	
//		}
	
	}


