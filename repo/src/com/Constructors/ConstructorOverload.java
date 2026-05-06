package com.Constructors;
//Question 4 (Multiple Constructors)

//Create a class Car:

//variables: brand, price

//Create:

//one default constructor
//one parameterized constructor

// Print values using both
public class ConstructorOverload {
	String brand;
	int price;

	ConstructorOverload() {
		System.out.println("default constructor");
	}

	ConstructorOverload(String brand, int price) {
		System.out.println("parametarised constructor:");
		this.brand = brand;
		this.price = price;

	}

	public static void main(String[] args) {

		System.out.println("main method started:");
		ConstructorOverload cod = new ConstructorOverload();
		cod.show();

		ConstructorOverload co = new ConstructorOverload("suzuki", 2000000);

		co.show();

	}

	void show() {
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);
	}

}
