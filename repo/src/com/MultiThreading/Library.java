package com.MultiThreading;
//1.Write a Java program using the Runnable interface

//to create 3 threads representing books borrowed from a library. 
//Each thread should display the book title and the number of days it was borrowed.
//If a book is returned after more than 7 days, calculate and 
//display a fine of ₹10 per extra day; otherwise, display "No Fine". Start all three threads simultaneously
//and display the details for each book.

//Requirements:

//1.Book 1: Java Basics – 10 days
//2.Book 2: Data Structures – 5 days
//3.Book 3: Spring Boot – 12 days
//4.Fine = ₹10 per day after the first 7 days
//Use the Runnable interface.
//5.Create and start 3 threads simultaneously.

class book1 implements Runnable {

	@Override
	public void run() {
		String b1name = "java basics";
		int days = 10;
		int fine = 10;
		System.out.println("book1 name is :" + b1name);
		System.out.println("number of days:" + days);
		if (days > 7) {
			fine = (days - 7) * 10;
			System.out.println(fine);
		} else {
			System.out.println("no fine ");

		}
	
	}

}

class books2 implements Runnable {

	@Override

	public void run() {
		String b2name = "data structurs";
		int days = 5;
		int fine = 10;
		System.out.println("book2 name is :" + b2name);
		System.out.println("number of days:" + days);

		if (days > 7) {
			fine = (days - 7) * 10;
			System.out.println(fine);
		} else {
			System.out.println("no fine");

		}

	}

}

class books3 implements Runnable {

	@Override
	public void run() {

		String b3name = "spring boot";
		int days = 12;
		int fine = 10;
		System.out.println("book1 name is :" + b3name);
		System.out.println("number of days:" + days);
		if (days > 7) {
			fine = (days - 7) * 10;
			System.out.println(fine);
		} else {
			System.out.println(" no fine");

		}
	
	}

}

public class Library {

	public static void main(String[] args) {
		Thread t1 = new Thread(new book1());
       Thread t2 = new Thread(new books2());
       Thread t3 = new Thread(new books3());
		t1.start();
//		System.out.println("************************************");
		t2.start();
//		System.out.println("************************************");
		t3.start();

	}

}
