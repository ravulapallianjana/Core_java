package com.Collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceOfEachChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String word = sc.nextLine();

		char[] c = word.toCharArray();

		Map<Character, Integer> m = new HashMap<>();
		for (char ch : c) {

			if (m.containsKey(ch)) {
				m.put(ch, m.get(ch) + 1);
			} else {
				m.put(ch, 1);
			}

		}
		
		Set<Entry<Character, Integer>> str=m.entrySet();
		for(  Entry<Character, Integer> entry:str) {
			System.out.println(entry);
		}

	}

}
