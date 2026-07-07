package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class TargetNum {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(7);
		l.add(11);
		l.add(15);
		l.add(3);
		l.add(6);
		
		int target=9;
		for(int i=0;i<l.size();i++) {
			for(int j=i+1;j<l.size();j++) {
				if(l.get(i)+l.get(j)==target) {
					System.out.println(l.get(i)+ ","+l.get(j));
				}
			}
		}
		
		
	}

}
