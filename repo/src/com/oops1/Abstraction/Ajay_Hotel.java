package com.oops1.Abstraction;

public class Ajay_Hotel extends Class_Abstract {
	String foodname;
	int quantity;
	double price;
	

	public Ajay_Hotel(String foodname, int quantity, double price) {
		super();
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
	}

	public void food1(double quantity) {

		double totalbill = quantity * price;
		System.out.println("bill:" + totalbill);
		double discount = 0.6 * totalbill;
		System.out.println("disscount:" + discount);
	}

	@Override
	public void food(double quantity) {
		
		
	}

	
}
