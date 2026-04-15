package repo;

import java.util.Scanner;

public class FindLargeNum {

	public static void main(String[] args) {
		System.out.println("find the Largest number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int r = 0;

		while (n != 0) {
			r = n % 10;

			if (r > max) {
//				smallest number find  if(r<max)
				max = r;

			}
			n = n / 10;

		}
		System.out.println(max);

	}
}
