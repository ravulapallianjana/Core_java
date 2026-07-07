package com.AbstractionClass;

public class LOAN_MAIN {

	public static void main(String[] args) {
		
		BANK s=new SBI("anjana", 1234, 1000000);
		s.deposit();
		s.educationloan();
		s.homeloan();
		s.withdraw();
		s.bankrules();
		System.out.println("**********************");
		BANK h=new HDFC("ajay", 2345, 6000000);
		h.deposit();
		h.educationloan();
		h.homeloan();
		h.withdraw();
		h.bankrules();
	}

}
