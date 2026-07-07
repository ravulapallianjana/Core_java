package com.Collections;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListDemo1 {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		System.out.println(l);
		l.addFirst(100);
		l.addLast(200);
		System.out.println("***************");
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		

	}

}
