package com.ATM;

import java.util.Scanner;

public class ATM_Implements implements ATM_Interface {
	USER u;

	ATM_Implements(USER U) {
		this.u = U;

	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//	}

	Scanner sc = new Scanner(System.in);

	public void checkbalence() {
		System.out.println("check your balence here....");
		System.out.println("current balance:" + u.getBalence());

	}

	public void withdraw() {
		System.out.println("enter your withdrawed money...");
		int amount = sc.nextInt();

		if (amount > u.getBalence()) {
			System.out.println("Insufficient Balance");
		} else {
			int balance = u.getBalence() - amount;
			u.setBalence(balance);

			System.out.println("Remaining Balance: " + balance);
		}

	}

	public void deposit() {
		System.out.println("enter your deposited amount:");
		int deposit = sc.nextInt();
		int balance = deposit + u.getBalence();

		u.setBalence(balance);

		System.out.println("Updated Balance: " + balance);

	}

	public void pinchange() {
		System.out.println("enter your old pin");
		int oldpin = sc.nextInt();
		System.out.println("enter your new pin");
		int newpin = sc.nextInt();
		if (oldpin == u.getPin()) {

			u.getPin();

			System.out.println("Pin changed successfully");
		} else {
			System.out.println("Wrong old pin");
		}

	}

}
