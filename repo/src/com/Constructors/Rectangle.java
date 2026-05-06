package com.Constructors;

public class Rectangle {
	int lenght;
	int breadth;
	int area;

	Rectangle(int lenght, int breadth){
		this.lenght=lenght;
		this.breadth=breadth;
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Rectangle ra=new Rectangle(12,13);
		 
		ra.show();

	}
	void show() {
		 area=lenght*breadth;
		System.out.println("lenght:"+lenght);
		System.out.println("breadth:"+breadth);
		System.out.println("area:"+area);
	}

}
