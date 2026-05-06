package com.arrays;

//input={9,3,1,8,2}
//o/p: 
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 9, 3, 1, 8, 2 };
		int temp, j;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;

			}
			arr[j] = temp;

		}
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
