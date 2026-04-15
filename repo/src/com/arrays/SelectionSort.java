package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {12,34,32,67,98,121};
		
		for(int i=0;i<arr.length;i++) {
			
			int minvalue=i;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[j]<arr[minvalue]) {
					minvalue=j;
				}
				
			}
			int temp=arr[minvalue];
			arr[minvalue]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
