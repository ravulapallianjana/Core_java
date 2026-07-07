package com.MultiThreading;

public class ThreadDemo01 extends Thread implements Runnable {

	public static void main(String[] args) {
		System.out.println("main thread class ");
		System.out.println(Thread.currentThread());
 		ThreadDemo01 t = new ThreadDemo01();
 		Thread t1=new Thread(t);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	@Override

	public void run() {
		System.out.println("run method here");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("run method ended ");

	}

}
