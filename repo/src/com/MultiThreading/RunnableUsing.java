package com.MultiThreading;
//Write a java program using the Runnable 

//interface to create 3 threads that print employee names, emp IDs, 
//and emp salaries. Start all 3 threads simulatneously and display the output.

class thread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("employee name:ANJANA");
	}
}

class thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("employee id:1");

	}

}

class thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("employee salery:2000000");

	}

}

public class RunnableUsing {

	public static void main(String[] args) {
		thread1 name = new thread1();

		thread2 id = new thread2();
		thread3 sal = new thread3();

		Thread t1 = new Thread(name);
		t1.start();
		Thread t2 = new Thread(id);
		t2.start();
		Thread t3 = new Thread(sal);
		t3.start();
	}

}
