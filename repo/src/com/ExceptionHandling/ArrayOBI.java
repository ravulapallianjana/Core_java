package com.ExceptionHandling;

public class ArrayOBI {

	public static void main(String[] args) {
		

		try {
			System.out.println("in try block called ");
			int[] arr = new int[4];
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
//			arr[4] = 50;
			
			for (int a : arr) {
				System.out.println(a);
			}
			
			
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("catch block called ");
			ae.printStackTrace();

		}
	}

}
