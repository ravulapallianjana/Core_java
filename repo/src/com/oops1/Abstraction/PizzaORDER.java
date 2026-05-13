package com.oops1.Abstraction;

public class PizzaORDER extends OrderDetails implements Food_ORDER {

	public PizzaORDER(int id, String cname, int price) {
		super(id, cname, price);

	}

	@Override
	public void preparefood() {
		System.out.println("very yemmi..........");

	}

	@Override
	public void adressdeatails() {
		System.out.println("Address:"+"kphb:road no5:srisai venkateswara pg");
		
	}

}
