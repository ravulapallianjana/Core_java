package com.oops1;

class Nagaraju {
	int n = 100;

	void naga() {
		System.out.println("Nagaraju class called");

	}

}

class Anjana extends Nagaraju {
	int an = 90;

	void anju() {
		System.out.println("Anjana class called:");
	}

}

class Ajay extends Anjana {
	int a = 95;

	void ajju() {
		System.out.println("Ajju class called:");
	}

}

public class Multi_Level_Inheritance {

	public static void main(String[] args) {
		Ajay ak = new Ajay();

		ak.naga();
		System.out.println(ak.n);
		ak.anju();
		System.out.println(ak.an);
		ak.ajju();
		System.out.println(ak.a);

	}

}
