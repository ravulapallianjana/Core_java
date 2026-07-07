package com.MultiThreading;

public class PriorityMultiThreading extends Thread{

	public static void main(String[] args) {
		System.out.println("main method started");
	System.out.println("main method priority:"+Thread.currentThread().MIN_PRIORITY);
		Thread.currentThread().setName("main");
		
		System.out.println(Thread.currentThread());
		 System.out.println("names:"+ Thread.currentThread().getName());
		 PriorityMultiThreading pt=new  PriorityMultiThreading();
		 pt.start();
			for(int i=0;i<=10;i++) {
				System.out.println("main:"+i);
			}
		
	}

	@Override
	public void run() {
		System.out.println("run method called ");
		System.out.println("run method priority:"+Thread.currentThread().MAX_PRIORITY);
	 Thread.currentThread().setName("run");
		System.out.println(Thread.currentThread());

	 System.out.println("name:"+ Thread.currentThread().getName());
		for(int i=0;i<=10;i++) {
			System.out.println("run:"+i);
		}
		
	}

}
