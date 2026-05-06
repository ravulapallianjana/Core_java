package com.Constructors;

/// Question 3 (this keyword use)

//Create a class Employee:

//variables: id, name, salary
//constructor parameters same name as variables

//Use this keyword properly
public class Employee {
	int eid;
	int esal;
	String ename;

	Employee(int eid, int esal, String ename) {
		System.out.println("parametaraised constructor:");
		this.eid = eid;
		this.esal = esal;
		this.ename = ename;

	}

	public static void main(String[] args) {

		System.out.println("main method started:");
		Employee em = new Employee(87, 50000, "anjana");
		em.show();

	}

	void show() {
		System.out.println("id:" + eid);
		System.out.println("salery:" + esal);
		System.out.println("name:" + ename);
	}

}
