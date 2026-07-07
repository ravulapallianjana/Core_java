package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class FrequencyElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> li = new ArrayList<>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(20);
		li.add(20);
		li.add(10);

		System.out.println(li);

		List<Integer> check = new ArrayList<>();

		for (Integer num : li) {

			if (!check.contains(num)) {
				int count = 0;

				for (Integer n : li) {
					if (num.equals(n)) {
						count++;
					}
				}

				System.out.println(num + " = " + count + " times");
				check.add(num);
			}
		}

	}

}
