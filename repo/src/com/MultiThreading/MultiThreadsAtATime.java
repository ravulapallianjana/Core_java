package com.MultiThreading;

class a extends Thread {
	@Override
	public void run() {
		System.out.println(" a run method called");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("a:" + i);
		}
	}

}

class b extends Thread {
	@Override
	public void run() {
		System.out.println(" b run method called");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {

			System.out.println("b:" + i);
		}
	}

}

class c extends Thread {
	@Override
	public void run() {
		System.out.println(" c run method called");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("c:" + i);
		}
	}
}

public class MultiThreadsAtATime {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());
		a a1 = new a();
		a1.start();
		b b1 = new b();
		b1.start();
		c c1 = new c();
		c1.start();

	}

}
