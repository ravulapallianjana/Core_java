package com.AbstractionClass;

public class Apollo extends Hospitals {

	public Apollo(String name, int pid, double billamount) {
		super(name, pid, billamount);
	}

	@Override
	public void treatment() {
		System.out.println("Apollo provides heart treatment");
	}

	@Override
	public void doctor() {
		System.out.println("Apollo has specialist doctors");
	}

	@Override
	public void claiminsurance() {
		System.out.println("Insurance claimed in Apollo");
	}

	@Override
	public void approvalinsu() {
		System.out.println("Insurance approved in Apollo");
	}
}