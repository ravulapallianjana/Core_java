package com.Collections;

import java.util.HashMap;
import java.util.HashSet;

public class LargeSubString {

	public static void main(String[] args) {
		String s = "abcabcbb";

		int maxlen = 0;
		int start = 0;
		HashMap<Character, Integer> set = new HashMap<>();
//		char[] ch = s.toCharArray();
		

		for (char i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);

			if (set.containsKey(c)) {
				start = Math.max(start, set.get(c) + 1);
			}

			set.put(c, (int) i);

			maxlen = Math.max(maxlen, i - start + 1);
		}

		System.out.println("Length of longest substring : " + maxlen+set);

	}

}
