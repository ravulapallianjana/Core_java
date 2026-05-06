package repo.loops;

import java.util.Scanner;

public class PrimeSum {
	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;

			}
			break;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a values:");
		int a = sc.nextInt();
		System.out.println("enter b values:");
		int b = sc.nextInt();
		int sum = 0;

		for (int i = a; i <= b; i++) {

			if (isprime(i)) {
				System.out.println(i);
				

				sum = sum + i;
			}


		}
		System.out.println();

		System.out.println("sum of a and b values:" + sum);
	}

}
