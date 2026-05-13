package com.oops1.Abstraction;

public class Animal {

	public static void main(String[] args) {
		System.out.println("********************dog*********************");
		Interface i=new Dog();
		i.sound();
		i.drunk();
		i.eat();
		i.hunt();
		i.run();
		i.sleep();
		Interface.breath();
		
		
		
		System.out.println("*********************cat******************");
		Interface i1=new Cat();
		i.drunk();
		i1.eat();
		i1.hunt();
		i1.sleep();
		i1.sound();
		i1.run();
		Interface.breath();

	}

}
