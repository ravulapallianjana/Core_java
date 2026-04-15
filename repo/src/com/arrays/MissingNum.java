package com.arrays;

public class MissingNum {

	public static void main(String[] args) {
		int [] arr= {1,2,4};
		
	boolean [] present =new 
		boolean [] present =new boolean[n+1];
		
		for(int num:arr) {
			present[num]=true;
			
		}

		
		for(int i=0;i<arr.length;i++) {
			if(!present[i]) {
				System.out.println(i);
			}
		}
	}

}
