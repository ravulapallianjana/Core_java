package repo.loops;

import java.util.Scanner;

public class SumofODDEVENnums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int evensum = 0;
		int oddsum = 0;
		int evencount = 0;
		int oddcount = 0;

		for (int i = 1; i <= n; i++) {
			if (n % 2 == 0) {
				evensum = evensum + i;
				oddsum = oddsum + i;
				evencount = evencount + 1;
				oddcount = oddcount + 1;
				System.out.println(i + "  ");

			}
		}
		System.out.println("sum of given even num:" + evensum);
		System.out.println("given odd number count:" + evencount);

		System.out.println("***********************************************");
		System.out.println("sum of given odd num:" + oddsum);

		System.out.println(" given  odd count:" + oddcount);

	}
}
