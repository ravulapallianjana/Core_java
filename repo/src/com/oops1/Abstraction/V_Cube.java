package com.oops1.Abstraction;

public class V_Cube {

	public static void main(String[] args) {
		System.out.println("..............presented by srikanth sir...........");
		Vcube_Interface vi = new Java_Sri();
		vi.ppt();
		vi.mocks();
		vi.exam();
		System.out.println("..............presented by viswa sir...........");

		Vcube_Interface vi1 = new Front_Back_Viswa();
		vi1.ppt();

		vi1.mocks();
		vi1.exam();
		System.out.println("..............presented by python sir...........");

		Vcube_Interface vi2 = new Python();
		vi2.ppt();

		vi2.mocks();
		vi2.exam();

	}

}
