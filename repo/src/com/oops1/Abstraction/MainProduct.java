package com.oops1.Abstraction;

public class MainProduct {

	public static void main(String[] args) {

		Product p = new electronics("phone", 30000);
		p.buy(2);
		Product p1 = new Clothings("top", 200);
		p1.buy(1);
		Product p2 = new Grocessary("ricebag", 5000);
		p2.buy(2);

	}

}
