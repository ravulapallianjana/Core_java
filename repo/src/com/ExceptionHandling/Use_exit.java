package com.ExceptionHandling;

public class Use_exit {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			System.out.println(10/0);
			
		}catch(Exception e) {
			System.out.println("in catch");
			System.exit(0);
		}finally {
			System.out.println("in finally");
		}

	}

}
