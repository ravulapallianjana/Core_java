package com.AbstractionClass;

public class SBI extends BANK {

	public SBI(String name, double accno, double balence) {
		super(name, accno, balence);
		System.out.println(name+"-"+ accno+"-"+ balence);

	}

	@Override
	public void deposit() {
		 int deposit=3000;
		System.out.println("ammount deposted in sbi bank"+deposit);

	}

	@Override
	public void withdraw() {
		int withdraw=2000;
		System.out.println("money withdraw in sbi "+withdraw);

	}

	@Override
	public void homeloan() {
		System.out.println("home loan taken from sbi bank ");

	}

	@Override
	public void educationloan() {
		System.out.println("educational loan taken from sbi bank");

	}

}
