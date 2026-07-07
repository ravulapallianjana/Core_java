package com.AbstractionClass;

public class GovHos extends Hospitals {

	public GovHos(String name, int pid, double billamount) {
		super(name, pid, billamount);
	}

	@Override
	public void treatment() {
		System.out.println("GovHos provides heart treatment");
	}

	@Override
	public void doctor() {
		System.out.println("GovHos has specialist doctors");
	}

	@Override
	public void claiminsurance() {
		System.out.println("Insurance claimed in GovHos");
	}

	@Override
	public void approvalinsu() {
		System.out.println("Insurance approved in GovHos");
	}


}
