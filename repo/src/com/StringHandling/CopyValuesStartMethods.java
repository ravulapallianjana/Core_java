package com.StringHandling;

public class CopyValuesStartMethods {

	public static void main(String[] args) {
//		String s="java with srikanth ";
		char [] ch= {'s','r','i','k','a','n','t','h'};
		String s=String.copyValueOf(ch);
		System.out.println(s.copyValueOf(ch));
		char [] ch1= {'a','n','j','a','n','a'};
		
		String s2=String .copyValueOf(ch1, 1, 3);
		System.out.println(s2);
		String[] names= {"java","Sql","Jpa","spring","jdbc"};
		for(String name:names) {
			if(name.startsWith("s")) {
				System.out.println(name);
			}
			
			if(name.toLowerCase().startsWith("j") && name.toUpperCase().endsWith("c")) {
				System.out.println(name);
			}
		}
		
		

	}

}
