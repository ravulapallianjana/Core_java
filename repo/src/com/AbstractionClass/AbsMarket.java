package com.AbstractionClass;

public abstract class AbsMarket implements Market {
//	variables 
//	static String name="anjana";
//	final int age=21;
	public String market = null;
//	constructors

//	 abstract methods 
	public abstract void method();
	public AbsMarket(String job) {
		
		super();
		this.market = job;
		System.out.println("constructos called");
	}
//	 normal methods/concrete methods 
	public void chicken() {
		System.out.println("i love chicken always ......");
	}

//all are overide methods 
	@Override
	public void leafveg() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tomatos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void potatos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mushroom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void oranges() {
		// TODO Auto-generated method stub

	}

	@Override
	public void carrots() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watermelon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mangoes() {
		// TODO Auto-generated method stub

	}

}
