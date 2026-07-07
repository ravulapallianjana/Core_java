package com.AbstractionClass;

public class Hospital_Main {

	public static void main(String[] args) {

		Hospitals h1 = new Apollo("Anjana", 101, 250000);

		System.out.println(h1.getName(null));
		System.out.println(h1.getPid());
		System.out.println(h1.getBillamount());

		h1.treatment();
		h1.doctor();
		h1.claiminsurance();
		h1.approvalinsu();
		

		Hospitals.hospitalInfo();

		System.out.println("********************");

		Hospitals h2 = new AnjanaHos("Ajay", 102, 500000);

		System.out.println(h2.getName(null));

		h2.treatment();
		h2.doctor();

		System.out.println("********************");

		Hospitals h3 = new GovHos("Naga", 103, 10000);

		System.out.println(h3.getName(null));

		h3.treatment();
		h3.doctor();
	}
}