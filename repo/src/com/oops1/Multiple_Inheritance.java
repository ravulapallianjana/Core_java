package com.oops1;

class person {
	String name = "anjana";

	void showperson() {
		System.out.println("person method called.....");

	}
}

class teacher extends person {
	String sub = "java";

	void showteacher() {
		System.out.println("teacher method called.....");
	}
}

class javateacher extends teacher {
	int exp = 14;

	void showjavateacher() {
		System.out.println("javateacher method called.....");

	}

}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		javateacher jt = new javateacher();
		jt.showperson();
		jt.showteacher();
		jt.showjavateacher();
		System.out.println(jt.name);
		System.out.println(jt.sub);
		System.out.println(jt.exp);

	}

}
