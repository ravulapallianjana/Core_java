package com.arrays;

public class D2Array {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i % 2 == 0) {

					int start = 0;
					int end = arr.length - 1;
					while (start < end) {
						int temp = arr[i][end];
						arr[i][end] = arr[i][start];
						arr[i][start] = temp;
						start++;
						end--;
					}

				}
				if (i == j) {
			arr[i][j] = arr[i][j] * arr[i][j];
				}
					if (i == 1 && (j == 0 || j == arr[i].length - 1)) {
						arr[i][j] = arr[i][j] * 2;

					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

