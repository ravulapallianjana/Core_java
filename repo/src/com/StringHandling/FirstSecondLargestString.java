package com.StringHandling;

//2.Write a Java program to find the longest and second longest words in a sentence along with their lengths.
//Input: "I love programming and debugging"
//Output:
//Longest Word : programming
//Length        : 11
//Second Longest: debugging
//Length         : 9
public class FirstSecondLargestString {

	public static void main(String[] args) {
		String s = "I love programming and debugging";
		String[] words = s.split(" ");
		String longest = "";
		String secondlargest = "";
		for (String st : words) {
			if (st.length() > longest.length()) {
				secondlargest = longest;
				longest = st;
			} else if (st.length() > secondlargest.length() && !st.equals(longest)) {

				secondlargest = st;

			}

		}
		System.out.println("longset word:" + longest);
		System.out.println("longest word lenght:" + longest.length());
		System.out.println("secondlargest word:" + secondlargest);
		System.out.println("secondlargest word lenght:" + secondlargest.length());

	}

}
