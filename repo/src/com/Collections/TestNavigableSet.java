package com.Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {

	public static void main(String[] args) {
NavigableSet<Integer> n=new TreeSet<Integer>();
n.add(100);
n.add(200);
n.add(300);
n.add(400);
n.add(500);

System.out.println(n);

System.out.println(n.lower(200));
System.out.println(n.higher(300));



	}

}
