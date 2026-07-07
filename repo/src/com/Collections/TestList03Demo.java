package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class TestList03Demo {

	public static void main(String[] args) {
		List<String> boys=new ArrayList<>();
		boys.add(0,"nagaraju");
		boys.add("ajay");
		boys.add(0,"naga");
		boys.add("bunny");
		boys.add(1,"bujji");
		boys.add(" charan");
		boys.add( 1,"ram");
		System.out.println(boys);
		boys.add(2,"ramanji");
		boys.add(3,"srinu");
//		boys.add(11,"ajju");//indexoutofboundexception
		
		System.out.println("******************");
		System.out.println(boys.lastIndexOf("naga"));
		
		System.out.println(boys.subList(0, 3));
		
		System.out.println(boys);
		
		
		

	}

}
