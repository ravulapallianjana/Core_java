package com.MultiThreading;

//Java

//Create 4 threads for perform this
//Thread A prints "Fizz" for numbers divisible by 3 but not by 5.
//Thread B prints "Buzz" for numbers divisible by 5 but not by 3.
//Thread C prints "FizzBuzz" for numbers divisible by both 3 and 5.
//Thread D prints the number itself
//The threads must work together to print the correct FizzBuzz sequence from 1 to n in order.
//Input:- n = 15
//Output:- 1,2, fizz, 4, buzz, fizz, 7,8, fizz......14, fizz buzz.

class threadA extends Thread {
	static int n;

	threadA(int n) {
		this.n = n;

	}

	@Override
	public void run() {

		for (int i = 1; i <= n; i++) {
			if (n % 3 == 0 && n % 5 != 0) {
				System.out.println("fizz");
			}
		}

	}
}

class threadB extends Thread {
	static int n;

	threadB(int n) {
		this.n = n;

	}

	@Override
	public void run() {

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("BUZZ");
			}
		}

	}

}

class threadC extends Thread {
	static int n;

	threadC(int n) {
		this.n = n;

	}

	@Override
	public void run() {

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			}
		}

	}
}

class threadD extends Thread {
	static int n;

	threadD(int n) {
		this.n = n;

	}

	@Override
	public void run() {

		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
			}
		}

	}

}

public class FizzBuzzSequence {

	public static void main(String[] args) {
		int n = 15;

		threadA a = new threadA(n);
		threadB b = new threadB(n);
		threadC c = new threadC(n);
		threadD d = new threadD(n);

		a.start();
		b.start();
		c.start();
		d.start();
	}

}
