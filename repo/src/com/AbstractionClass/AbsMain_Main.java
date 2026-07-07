package com.AbstractionClass;

public class AbsMain_Main {

	public static void main(String[] args) {
		AbsMarket am=new  Vegitables(null);
		
		am.leafveg();
		am.mushroom();
		am.tomatos();
		am.potatos();
		am.carrots();
		am.chicken();
		am.method();
		System.out.println("**********************");
		AbsMarket AM=new Fruits(null);
		AM.mangoes();
		AM.oranges();
		AM.watermelon();
		AM.method();
	}

}
