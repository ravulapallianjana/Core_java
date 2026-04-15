package com.arrays;

public class BubbuleSort {

	public static void main(String[] args) {
		int [] arr= {1,35,6,32,80,2};
		System.out.println("before sorting");
		for(int a:arr) {
			System.out.println(a + " ");
		}
		System.out.println();
		
		
		for(int i=0;i<arr.length;i++) {
						for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println();
		System.out.println("after sorting");
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
