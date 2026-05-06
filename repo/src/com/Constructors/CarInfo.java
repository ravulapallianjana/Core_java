package com.Constructors;

public class CarInfo {
	int price;
	String cname;
	String cmodel;
	int cmilage;

	CarInfo() {
		System.out.println("no-arg constructor:");
	}

	CarInfo(int price, String cname, String cmodel, int cmilage){
		System.out.println("parametaraised constructor:");
		this.price=price;
		this.cname=cname;
		this.cmodel=cmodel;
		this.cmilage=cmilage;
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		CarInfo ci=new CarInfo(2000000,"suzuki","model",280);
		ci.carinfos();
		CarInfo cis=new CarInfo(200000,"suzuk","mode",28);
		cis.carinfos();
		
		

	}
void carinfos() {
	System.out.println(price);
	System.out.println(cname);
	System.out.println(cmodel);
	System.out.println(cmilage);
}
}
