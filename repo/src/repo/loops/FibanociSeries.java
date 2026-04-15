package repo.loops;

import java.util.Scanner;

public class FibanociSeries {

	public static void main(String[] args) {
		System.out.println(" to find the fibanoci  number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1 + " " + n2);
		for (int i = 0; i < n-2; i++) {
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
