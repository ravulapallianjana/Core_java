package com.Constructors;

public class UsingThis {
	int id;
	int age;
	String name;
	String location;

	UsingThis() {
		System.out.println("no-arg constuctor:");
	}

	UsingThis(int id, int age, String name, String location){
		System.out.println("parametaraised constructor:");
		this.age=age;
		this.id=id;
		this.location=location;
		this.name=name;
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		UsingThis ut = new UsingThis(21,87,"kphb","anjana");
		ut.display();
		UsingThis uts = new UsingThis(18,01,"kphb-5","ajay");
		uts.display();

	}
	void display() {
		System.out.println(age);
		System.out.println(id);
		System.out.println(location);
		System.out.println(name);
	}
	
	
	
}
	


