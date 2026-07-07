package com.CustomException;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);

	}

}

public class BankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 5000;
		System.out.println("enter withdrawel ammount ");
		double ammount = sc.nextDouble();
		try {
			if (ammount > balance) {
				throw new InsufficientBalanceException(" insufficient balance");
			}
			balance = balance - ammount;
			System.out.println("remaining balance:" + balance);
		} catch (InsufficientBalanceException ib) {
			System.out.println(ib);
		}
		sc.close();

	}

}
