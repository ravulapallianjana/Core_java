package com.Constructors;

public class DefaultConstructor2 {
	int sid;
	String sname;
	int age;
	
	DefaultConstructor2(){
		System.out.println("no-arg constructor");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started:");
		DefaultConstructor2 dc=new DefaultConstructor2( );
		dc.sid=87;
		dc.sname="Anjana";
		dc.age=21;
		System.out.println(dc.sid);
		System.out.println(dc.sname);
		System.out.println(dc.age);
		

	}

}
