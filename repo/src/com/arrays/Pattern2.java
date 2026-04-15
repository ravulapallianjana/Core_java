package com.arrays;

public class Pattern2 {

	public static void main(String[] args) {
		String [][]arr= {{"@"},{"@ @"},{"@ @ @"},{"@ @ @ @"}};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
