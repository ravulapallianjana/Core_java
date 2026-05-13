package com.oops1.Abstraction;

public class MinFood {

	public static void main(String[] args) {
System.out.println("your pizza ready.....");
		PizzaORDER po = new PizzaORDER(2, "chicken pizza", 2000);
		po.displaydetails();
		po.preparefood();
		po.adressdeatails();
		System.out.println("your burger ready....");
		BurgerDetails bd = new BurgerDetails(1, "chicken burger ", 2000);
		bd.displaydetails();
		bd.preparefood();
		bd.adressdeatails();
	}

}
