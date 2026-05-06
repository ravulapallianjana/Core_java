package com.oops1;

//B70 java - Build a banking system using Inheritance & Method Overriding
//Classes: Account(id,balance), SavingsAccount, CurrentAccount
//Account → calculateInterest()
//Override in child classes
//Savings → 6%, Current → 2%
//Print interest
class Account {

	int id;
	double balance;

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	void calculateInterest() {
		
	}

}

class savingaccount extends Account {

	public savingaccount(int id, double balance) {
		super(id, balance);

	}

	@Override

	void calculateInterest() {
		double intrest = balance * 0.06;
		System.out.println(" calculate intrest :"+intrest);

		
	}
}

class currentaccount extends Account {
	public currentaccount(int id, double balance) {
		super(id, balance);

	}

	@Override
	void calculateInterest() {
		double intrest1 = balance * 0.02;
		System.out.println(" calculate intrest :"+intrest1);

		
	}
}

public class BankingAccountSystem {
	public static void main(String[] args) {
		System.out.println("To show intrests: ");
		savingaccount bsa = new savingaccount(87, 500000.00);

		currentaccount bs = new currentaccount(68, 550000.00);
		bsa.calculateInterest();
		bs.calculateInterest();
	}
}
