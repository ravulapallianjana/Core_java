package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> li = new ArrayList<>();

		li.add(5);

		for (int num : li) {
			System.out.println(num);

			for (int i = 1; i <= 10; i++) {
				System.out.println(num + "X" + i + "= " + (num * i));
			}
		}
	}

}
