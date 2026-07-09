package com.MultiThreading;

class Bookshow {
	static int available_tickets = 10;

	synchronized public static void bookticket(String cname, int tickets) {
		if (available_tickets >= tickets) {
			System.out.println(tickets + ":tickets are booked by :" + cname);
			available_tickets = available_tickets - tickets;
			System.out.println("remaining tickets:" + available_tickets);

		} else {
			System.err.println("sorry tickets are low :"+cname);
			System.err.println("remaining tickets:" + available_tickets);
		}

	}

}

class customer extends Thread {
	Bookshow bs;
	int tickets;
	String cname;

	public customer(Bookshow bs, int tickets, String cname) {
		super();
		this.bs = bs;
		this.tickets = tickets;
		this.cname = cname;
	}

	@Override
	public void run() {
		bs.bookticket(cname, tickets);
	}

}

public class BookMyShowPOC {
	static Bookshow bs = new Bookshow();

	public static void main(String[] args) {
		customer c = new customer(bs, 5, "anjana");
		c.start();
		customer c1 = new customer(bs, 2, "ajay");
		c1.start();
		customer c2 = new customer(bs, 3, "nagaraju");
		c2.start();

	}

}
