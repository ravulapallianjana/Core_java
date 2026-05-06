package com.Constructors;

public class PrametarisedCon {
	int id;
	int age;
	String name;
	String location;

	PrametarisedCon() {
		System.out.println("no-arg constructor:");
	}

	PrametarisedCon(int id, int age, String name, String location) {
		System.out.println("parametarised constructors:");
		

	}

	public static void main(String[] args) {
		System.out.println("main method started:");
//		object creation
		PrametarisedCon pc =new PrametarisedCon(87,21,"anjana","kphb");
		pc.show();
		PrametarisedCon pdc =new PrametarisedCon(01,22,"ajay","kphb-5");
		pdc.show();
	}
void show() {
	
	System.out.println(id);
	System.out.println(age);
	System.out.println(name);
	System.out.println(location);
}
		
}
