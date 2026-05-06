package com.oops1;

class a {

	int a1 = 10;

	a() {
		System.out.println(" a class called:");
	}
}

class b extends a {
	int b1 = 12;

	b() {
		System.out.println(" b class called:");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println();
		b b11 = new b();
		
		System.out.println(b11.a1);

		System.out.println(b11.b1);

	}

}
