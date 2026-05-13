package com.oops1.Abstraction;

public class BurgerDetails extends OrderDetails implements Food_ORDER {

	public BurgerDetails(int id, String cname, int price) {
		super(id, cname, price);

	}

	@Override
	public void preparefood() {
		System.out.println("very big burger ...... eager to eat");

	}

	@Override
	public void adressdeatails() {
		System.out.println("Address:"+"kphb:road no5:srisai venkateswara pg");
		
	}

}
