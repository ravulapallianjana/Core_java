package com.MultiThreading;

class resuorce {

	int i;

	synchronized void put(int i) {

		this.i = i;

	}

	synchronized void get() {
		System.out.println("get method ");

	}
}

class producer implements Runnable {

	resuorce r;

	@Override
	public void run() {

		Thread t = new Thread();

		t.start();
		r.put(10);

	}

}

class consumer implements Runnable {
	resuorce r;

	@Override
	public void run() {
		r.get();
	}

}

public class ProducerConsumer {

	public static void main(String[] args) {

		
	}

}
