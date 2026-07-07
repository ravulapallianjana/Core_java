package com.StringHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Anagrams {

	public static void main(String[] args) {
		String[] map = { "eat", "tea", "tan", "ate", "nat", "bat" };

		HashMap<String, ArrayList<String>> word = new HashMap<>();

		for (String words : map) {
			char[] ch = words.toCharArray();

			Arrays.sort(ch);

			String s = new String(ch);
			if (!word.containsKey(s)) {
				word.put(s, new ArrayList<>());
				word.get(s).add(words);

			}
			for (ArrayList<String> list : word.values()) {
				System.out.println(list);
			}

		}
	}
}
