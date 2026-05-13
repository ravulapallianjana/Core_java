package com.oops1.Abstraction;

public class Clothings implements Product {
	String productname;
	double price;

	public Clothings(String productname, double price) {
		super();
		this.productname = productname;
		this.price = price;
	}

	public void buy(double quantity) {
		double totalbill = quantity * price;
		System.out.println(totalbill);
		double discount=0.6*totalbill;
		System.out.println(discount);

	}

}
