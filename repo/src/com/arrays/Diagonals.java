package com.arrays;

public class Diagonals {

//

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
//		for(int [] num:arr) {
//			for(int nums:num) {
//				System.out.print(nums+" ");
//			}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i - 3 == j || i + j == arr.length - 1) {
					System.out.print(arr[i][j] + " ");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

//		 

	}

}
