package com.AbstractionClass;

public class Hospitals implements Insurance {
//	patientName
//	patientId
//	billAmount
//	treatment()
//	doctor()
	
	

	private String name;
	private int pid;
	private double billamount;

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getBillamount() {
		return billamount;
	}

	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	

	public Hospitals(String name, int pid, double billamount) {
		super();
		this.name = name;
		this.pid = pid;
		this.billamount = billamount;
	}

	@Override
	public void claiminsurance() {

	}

	@Override
	public void approvalinsu() {

	}

	@Override
	public void treatment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doctor() {
		// TODO Auto-generated method stub
		
	}

	public static void hospitalInfo() {
		// TODO Auto-generated method stub
		
	}

}
