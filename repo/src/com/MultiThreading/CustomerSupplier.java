package com.MultiThreading;
//1. Write a Java program using the Runnable interface to create 2 threads. One thread acts as a Supplier and adds items to a Warehouse, while the other thread acts as a Customer and removes items from the same Warehouse. Start both threads simultaneously and display the available stock after all operations are completed.

//Requirements:
//Initial stock = 20 items.
//The Supplier adds 10 items.
//The Customer removes 5 items.
//If sufficient stock is available, complete the purchase; otherwise, display "Insufficient Stock".
//Display the stock after each operation and the final available stock.

class Warehouse {
	int stock = 20;

	public void addItems() {
		stock = stock + 10;
		System.out.println("Supplier added 10 items.");
		System.out.println("Stock after adding: " + stock);
	}

	public void removeItems() {
		if (stock >= 5) {
			stock = stock - 5;
			System.out.println("Customer removed 5 items.");
			System.out.println("Stock after removing: " + stock);
		} else {
			System.out.println("Insufficient Stock");
		}
	}
}

class Supplier implements Runnable {

	Warehouse warehouse;

	Supplier(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void run() {
		warehouse.addItems();
	}
}

class Customer implements Runnable {

	Warehouse warehouse;

	Customer(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void run() {
		warehouse.removeItems();
	}
}

public class CustomerSupplier {

	public static void main(String[] args) {

		Warehouse warehouse = new Warehouse();

		Thread t1 = new Thread(new Supplier(warehouse));
		Thread t2 = new Thread(new Customer(warehouse));

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Final Stock: " + warehouse.stock);
	}
}
