package repo;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter your happy number:");
		int n = sc.nextInt();

		while (n > 9) {
			int sum = 0;
			int r = 0;

			while (n > 0) {
				r = n % 10;
				sum += r * r;
				n = n / 10;

			}
			n = sum;
		}
		if (n == 1) {
			System.out.println(" enterede num is happy number:");
		} else {
			System.out.println("entered num is not happy number:");
		}

	}

}
