package com.Collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyonwriteArrayList {

	public static void main(String[] args) {
		
//		" java.util.ConcurrentModificationException
//		List<Integer> l=new ArrayList<>();
		List<Integer>l=new CopyOnWriteArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		for(Integer i:l) {
			System.out.println(i);
			l.add(90);
			System.out.println(i);
		}
		
	}

}
