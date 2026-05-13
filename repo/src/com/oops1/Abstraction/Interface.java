package com.oops1.Abstraction;

public interface Interface {

	public abstract void sound();

	public abstract void eat();

	public abstract void run();

	public abstract void walk();

	

	public abstract void sleep();
	default void hunt() {
		System.out.println("all animal hunting...for hungry time....");
	}

	public abstract void drunk();
	 static void breath() {
		 System.out.println("all animal breath for serviving.......");
	}

	 
	

}
