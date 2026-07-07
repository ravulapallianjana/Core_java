package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		System.out.println("list methods started here ");

		List<String> l = new ArrayList<>();

		l.add("anjana");
		l.add("ajay");
		l.add("nagaraju");
		l.add(0, "bujji");
		l.add("anju");
		l.add(0, "naga");
		System.out.println(l);

		List<String> l2 = new ArrayList<>();

		l2.add("srikanth");
		l2.add("viswa");
		l2.add(0, "srikanth sir");

		l2.add(1, "viswasir");
System.out.println(l2);
		
		List<String>l3=new ArrayList<>();
		
		System.out.println(l3.addAll(l2));
		System.out.println(l.contains("anju"));
		
		System.out.println(l3.containsAll(l2));
		System.out.println(l3.equals(l));
		System.out.println(l3.equals(l2));
		System.out.println(l3.isEmpty());
		
		System.out.println("*******************************");
		Iterator<String> i=l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println("___________________________________");
		System.out.println(l2.remove(0));
		System.out.println(l2);
		System.out.println(l2.remove("viswa"));
		System.out.println(l2);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(l2.retainAll(l3));
		System.out.println(l);
		
		System.out.println(l2.size());
		System.out.println(l.size());
		
		System.out.println(l.containsAll(l3));
		
		
		
		
		
	
	
	}

}
