package com.arrays;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 50, 70, 20, 10 };
		boolean[] boo = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (boo[i] == false) {
				boo[i] = true;
				count = 0;

				for (int j = i; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						boo[j] = true;
						count++;
					}

				}

				if (count > 1) {
					System.out.println(arr[i]);
				}

			}

		}
	}
}
