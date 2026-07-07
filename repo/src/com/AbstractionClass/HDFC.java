package com.AbstractionClass;

public class HDFC  extends BANK{

	public HDFC(String name, double accno, double balence) {
		super(name, accno, balence);
		System.out.println(name+"-"+ accno+"-"+ balence);
	}

	@Override
	public void deposit() {
		System.out.println("money deposited.....");
		
	}

	@Override
	public void withdraw() {
		System.out.println("ammount withdrawed...");
		
		
	}
	@Override
	public void homeloan() {
		System.out.println("home loan from hdfc bank..");
		
		
	}

	@Override
	public void educationloan() {
		System.out.println("educational loan from hdfc bank");
		
		
	}

}
