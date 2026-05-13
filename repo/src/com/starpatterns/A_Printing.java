package com.starpatterns;

public class A_Printing {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
//			a
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
//			n

			for (int j = 1; j <= 5; j++) {
				if (j == 1 || j == 5 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");
//				printing  j
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 3 || (i == 5 && j <= 3) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("  ");
//			a
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
//			n

			for (int j = 1; j <= 5; j++) {
				if (j == 1 || j == 5 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
//			a
			
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			System.out.println();
		}
		

	}

}
