package com.arrays;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rsum = 0;
		int lsum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i] == arr[j]) {
					lsum = lsum + arr[i][j];

				}

			}
		}

		System.out.println(lsum);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i+j==arr.length-1) {
					rsum=rsum+arr[i][j];
				}
			}
		}
System.out.println(rsum);
	}
	

}
