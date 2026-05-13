package com.oops1.Abstraction;

public class electronics implements Product {
	String productname;
	double price;

	public electronics(String productname, double price) {
		super();
		this.productname = productname;
		this.price = price;
	}

	public void buy(double quantity) {
		double totalbill = quantity * price;
		System.out.println("bill:"+totalbill);
		double discount=0.6*totalbill;
		
		System.out.println("discount:"+discount);

	}

}
