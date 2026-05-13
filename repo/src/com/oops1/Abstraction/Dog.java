package com.oops1.Abstraction;

public class Dog implements Interface {

	@Override
	public void sound() {
		System.out.println("dogs sounds like ......BOW BOW");
//		hello();
	}

	@Override
	public void eat() {
		System.out.println("dogs eats....... nonveg");

	}

	@Override
	public void run() {
		System.out.println("dog can run fastly....");

	}

	@Override
	public void walk() {
		System.out.println("dogs walk ......");

	}

	
	public void hunt() {
		System.out.println("dog can hunt small animals  like...... hens");
		 hello() ;
	}

	@Override
	public void sleep() {
		System.out.println("dog can sleep ........morning time");

	}

	@Override
	public void drunk() {
		System.out.println(" dog drinks .......water");
		anju();
	}
	 

	static void anju() {
		System.out.println("static method called");
		
	}

	private void hello() {
		System.out.println("hello good evening");
		System.out.println("helooooooooo");
		System.out.println("helooooooooo");
		System.out.println("helooooooooo");
		System.out.println("helooooooooo");
	}

}
