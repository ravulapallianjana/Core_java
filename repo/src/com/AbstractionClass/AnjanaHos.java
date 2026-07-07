package com.AbstractionClass;

public class AnjanaHos extends Hospitals{

	public AnjanaHos(String name, int pid, double billamount) {
		super(name, pid, billamount);
	}

	@Override
	public void treatment() {
		System.out.println("AnjanaHos provides heart treatment");
	}

	@Override
	public void doctor() {
		System.out.println("AnjanaHos has specialist doctors");
	}

	@Override
	public void claiminsurance() {
		System.out.println("Insurance claimed in AnjanaHos");
	}

	@Override
	public void approvalinsu() {
		System.out.println("Insurance approved in AnjanaHos");
	}

}
