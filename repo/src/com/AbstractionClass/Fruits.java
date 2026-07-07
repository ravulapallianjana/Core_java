package com.AbstractionClass;

public class Fruits extends AbsMarket {

	public Fruits(String job) {
		super(job);

	}

	@Override
	public void oranges() {
		System.out.println("oranges are fav fruit");

	}

	@Override
	public void watermelon() {
		System.out.println("it gives water content more in summer");

	}

	@Override
	public void mangoes() {
		System.out.println("summer is mangoes season");

	}

	@Override
	public void method() {
		System.out.println("abstract methods implements");
		
	}

}
