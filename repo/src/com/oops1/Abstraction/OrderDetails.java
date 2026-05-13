package com.oops1.Abstraction;

public class OrderDetails {

	int id;
	String cname;
	int price;

	public OrderDetails(int id, String cname, int price) {
		super();
		this.id = id;
		this.cname = cname;
		this.price = price;
	}

	void displaydetails() {
		System.out.println(id);
		System.out.println(cname);
		System.out.println(price);
	}

//	public void preparefood() {
//		System.out.println();
//
//	}
}
