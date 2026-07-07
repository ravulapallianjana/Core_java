package com.StringHandling;

import java.util.Arrays;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

//1.Write a Java program to capitalize the first letter of every word in a given string.
//Input: hello world
//Output: Hello World
public class FirstLetterCap {

	public static void main(String[] args) {
		String s = "hello world";

		String[] st = s.split(" ");
		StringBuilder str = new StringBuilder();

		for (String words : st) {
			if (!words.isEmpty()) {
				str.append(Character.toUpperCase(words.charAt(0))).append(words.substring(1)).append(" ");

			}

		}
        System.out.println(str.toString().trim());


	}

}
