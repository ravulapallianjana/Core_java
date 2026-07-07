package com.MultiThreading;

//2.Write a Java program to create three threads.
//Thread-1 should print the multiplication table of 2.
//Thread-2 should print the multiplication table of 3.
//Thread-3 should print the multiplication table of 5 simultaneously.


	
	class Table1 extends Thread {

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("2 x " + i + " = " + (2 * i));
	        }
	    }
	}
	


class Table2 extends Thread {
	
	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("3 x " + i + " = " + (3 * i));
	        }
	    }
	}





	class Table3 extends Thread {

	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("5 x " + i + " = " + (5 * i));
	        }
	    }
	}


public class MultiplicationTableUsingThread {

	public static void main(String[] args) {
		
		 Table1 t1 = new Table1();
	        Table2 t2 = new Table2();
	        Table3 t3 = new Table3();

	        t1.start();
	        t2.start();
	        t3.start();
	}
}

