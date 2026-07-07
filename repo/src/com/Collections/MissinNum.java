package com.Collections;

import java.util.ArrayList;
import java.util.List;

//2.Store the numbers 1, 2, 3, 5, 6 in a List<Integer>.
//Find and print the missing number from the sequence 1 to 6.
//Input : 1 2 3 5 6
//Output : Missing Number = 4

public class MissinNum {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(6);
		
		for(int i=0;i<=6;i++) {
			if(!l.contains(i)) {
				System.out.println("missing number is:"+ i);
			}
		}
		
		
		

	}

}
