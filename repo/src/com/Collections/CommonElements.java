package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> s1=new ArrayList<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		
		List<Integer> s2=new ArrayList<>();
		
		s2.add(10);
		s2.add(20);
		s2.add(60);
		s2.add(70);
		s2.add(80);
		
//		s1.retainAll(s2);
//		
//		System.out.println(s1);
		
		for(int i=0;i<s1.size();i++) {
			for(int j=0;j<s2.size();j++) {
				if(s1.get(i)==s2.get(j)) {
					System.out.println(s1.get(i));
					
				}
			}
		}
		
		
		

	}

}
