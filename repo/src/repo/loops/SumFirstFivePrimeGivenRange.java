package repo.loops;

import java.util.Scanner;

public class SumFirstFivePrimeGivenRange {

	static Boolean isprime(int n) {

		if (n < 0 && n == 1) {
			return false;

		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;

			}
		}

		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value:");
		int a = sc.nextInt();
		System.out.println("enter b value:");
		int b = sc.nextInt();
		int sum = 0;
		int oddsum = 0;
		int count = 0;

		for (int i = a; i < b && count < 5; i++) {
			if (isprime(i)) {
				System.out.println(i);
				sum = sum + i;
				count++;

			}

		}
		System.out.println(sum);
		if (sum % 2 == 0) {
			System.out.println("sum is even:" + sum);
		} else {
			System.out.println("sum is odd");
		}

	}
}
