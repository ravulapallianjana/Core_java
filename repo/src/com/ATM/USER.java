package com.ATM;

import java.util.Scanner;

public class USER{
	Scanner sc=new Scanner(System.in);
	int accno;
	int pin;
	String username;
	int balence;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBalence() {
		return balence;
	}

	public void setBalence(int balence) {
		this.balence = balence;
	}

	public USER(int accno, int pin, String username, int balence) {
		super();
		this.accno = accno;
		this.pin = pin;
		this.username = username;
		this.balence = balence;
	}

	USER() {

	}

	

}
