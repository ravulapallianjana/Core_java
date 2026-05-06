package repo.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessRanNum {
	static int attempts = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("your fixed value: ");
		Random rnum = new Random(10);
		int rn = sc.nextInt();

		while (attempts < 3) {
			System.out.println("enter your random num:");
			int gnum = sc.nextInt();

			if (rn == gnum) {
				System.out.println("congratulation...you are genious");
				break;

			} else if (gnum< rn) {
				System.out.println("your num is less value ");
			} else {
				System.out.println("your num is greater to my num:");
			}
			attempts++;
		}
		if (attempts == 3) {
			System.out.println("your are loosing this game:");
		}

	}

}
