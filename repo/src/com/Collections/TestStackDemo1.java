package com.Collections;

import java.util.Stack;

public class TestStackDemo1 {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
//		System.out.println(s);
		
		
		s.peek();
		System.out.println(s);
		
		System.out.println("_______________");
//		
		
		System.out.println(s.empty());
		System.out.println(" ");
//		s.search(s);
		System.out.println(	s.search(5));
		System.out.println("      ");
//		s.pop();
		System.out.println(s.pop());
		System.out.println(s);
		
		

	}

}
