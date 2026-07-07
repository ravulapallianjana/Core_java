package com.StringHandling;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("srikanthsrikanthsri");
		sb1.append("srikanthsrikanthsrikanth");
		sb1.append("srikanthsrikanthsrikanthsrikanth");
		sb1.append("srikanthsrikanthsrikanthsrikanthsrikanth");
System.out.println(sb1.capacity());
	}

}
