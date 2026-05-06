package com.Constructors;

public class DefaultConstructor {
	String sid;
	String sname;
	DefaultConstructor(){
		System.out.println("no-arg constructor:");
	}
	
	

	public static void main(String[] args) {
		System.out.println("program on default constructor:");
		DefaultConstructor dc = new DefaultConstructor();
		dc.sid = "087";
		dc.sname = "anjana";
		dc.display();
	}

	void display() {
		System.out.println(sid);
		System.out.println(sname);
	}

}
