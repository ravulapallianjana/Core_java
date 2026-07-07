package com.Collections;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
java.util.SortedSet<Integer> s=new TreeSet<>();
s.add(20);
s.add(30);
s.add(40);
s.add(50);
s.add(60);
System.out.println(s);

System.out.println(s.first());
System.out.println(s.last());
System.out.println(s.headSet(20));
System.out.println(s.tailSet(20));
System.out.println(s.subSet(20,40));
	}

}
