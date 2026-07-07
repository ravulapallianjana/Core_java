package com.oops1.Abstraction;

public class Hotel_ANJANA  extends Class_Abstract{
	String foodname;
	int quantity;
	double price;

	
	public Hotel_ANJANA(String foodname, int quantity) {
		super();
		this.foodname = foodname;
		this.quantity = quantity;
	}
	public void food(double quantity) {
		
		double totalbill = quantity * price;
		System.out.println("bill:"+totalbill);
		double discount=0.6*totalbill;
System.out.println("disscount:"+discount);
	}

//	@Override
//	public void food() {
//		System.out.println("food tasty in anjana hotel");
//		
//		
//	}

	
	
	


}
