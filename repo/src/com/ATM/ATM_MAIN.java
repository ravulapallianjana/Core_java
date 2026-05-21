package com.ATM;

import java.util.Scanner;

public class ATM_MAIN {
	public static void main(String[] args) {
		USER[] users = new USER[3];
		users[0] = new USER(1234, 2345, "anjana", 8000);
		users[1] = new USER(1345, 1234, "AJAY", 7000);
		users[2] = new USER(1432, 1345, "naga", 9000);
		USER U = new USER();
		// System.out.println("welcome to SBI services....");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your account number:");
		int accno = sc.nextInt();
		System.out.println("enter your pin number:");
		int pin = sc.nextInt();
		boolean status = false;
		USER use = null;
		for (USER user : users) {
			if (accno == user.getAccno() && pin == user.getPin()) {
				status = true;
				use = user;
				break;
			} else {
				System.out.println("entered credentials are invalid:");
			}
		}
		if (status) {
			ATM_Implements atm = new ATM_Implements(use);
			while (status) {
				System.out.println("welcome to SBI services....");
				System.out.println("1.checkbalence\n 2.withdraw\n 3.deposit\n 4.pinchange\n 5.exist ");

			
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> atm.checkbalence();

			case 2 -> atm.withdraw();

			case 3 -> atm.deposit();

			case 4 -> atm.pinchange();

			case 5 -> {
				System.out.println("thanks for choosing SBI sevices");
				System.exit(0);
				status = false;
				
			}

			default -> System.out.println("entered cHOice is not here....");

			}
		}
			
		
	}
		else {
			System.out.println("wrong credentials");
		}
	}
}
