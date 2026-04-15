package com.arrays;

public class SecondLargeNum {

	public static void main(String[] args) {
	int []arr= {10,25,40,15,30};
	
	int max=arr[0];
//	int min=arr[0];
	int secondmax=arr[0];
	
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}else if(max>secondmax) {
		secondmax=	arr[i];
	}

	}
	System.out.println(max);
	System.out.println(secondmax);

	}
}
