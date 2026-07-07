package com.CustomException;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}

}

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr age:");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new InvalidAgeException("not eligibile to vote:");
			}else {
				System.out.println("eligibile to vote ");
			}
		} catch (InvalidAgeException ia) {
			System.out.println(ia);
		}
		sc.close();
	}

}
