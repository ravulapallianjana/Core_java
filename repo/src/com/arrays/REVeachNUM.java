package com.arrays;

public class REVeachNUM {

	public static void main(String[] args) {
		int [] arr= {11,12,13,14,15,16};
		int r=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int rev=0;
			while(num>0) {
				  r=num%10;
				 rev=rev*10+r;
				  num=num/10;
			}
			System.out.print(rev+" ");
			
		}
		
System.out.println();
	}
	}

