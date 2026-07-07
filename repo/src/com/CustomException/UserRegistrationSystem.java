package com.CustomException;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class WeakPasswordException extends Exception {
	public WeakPasswordException(String message) {
		super(message);
	}
}

class InvalidMobileNumberException extends Exception {
	public InvalidMobileNumberException(String message) {
		super(message);
	}
}

public class UserRegistrationSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter your age:");

			int age = sc.nextInt();
			if (age < 18) {
				throw new InvalidAgeException("age is not suitable");

			} else {
				System.out.println("your age is eligible .... ");
			}

			System.out.println(" go to next step ");

			System.out.println("enter your password:");
			String password = sc.next();

			if (password.length() < 8) {
				System.out.println(" correct ");
			} else {
				
				throw new WeakPasswordException("try again invalid password!! length min ");

			}

			System.out.println("go to next step");

			System.out.println("enter your mobile number:");
			String mobile = sc.next();

			if (mobile.length() == 10) {
				System.out.println("Registration Successful");
			} else {
				throw new InvalidMobileNumberException("Invalid mobile number !! Registration failed");
				
			}

		} catch (InvalidAgeException | InvalidMobileNumberException | WeakPasswordException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
