package com.arrays;
//give only once repeated.....
import java.util.HashSet;

public class DUPLICATESremove {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 6, 7, 8, 1, 2 };

		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);

		}
		System.out.println(set);

	}

}
