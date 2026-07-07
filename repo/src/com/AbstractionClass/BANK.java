package com.AbstractionClass;

public abstract class BANK implements Loan {

	String name;
	double accno;
	double balence;

	public BANK(String name, double accno, double balence) {
		super();
		this.name = name;
		this.accno = accno;
		this.balence = balence;
	}

	public abstract void deposit();

	public abstract void withdraw();

	public void bankrules() {
System.out.println("every custmer can follow the bank rules");
	}

	@Override
	public void homeloan() {
		

	}

	@Override
	public void educationloan() {

	}

}
