package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceEvenElements {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);

		int index = 0;
		Iterator<Integer> i=l.iterator();
		
		while(i.hasNext()){
			i.next();
			if(index%2==0) {
				l.set(index, 0);
				
			}
			index++;
		}
System.out.println(l);
	}

}
