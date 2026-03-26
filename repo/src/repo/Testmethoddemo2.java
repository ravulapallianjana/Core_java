package repo;

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Testmethoddemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
// area of triangle
		System.out.println("enter height :");
		double height = sc.nextDouble();

		System.out.println("enter base:");
		double base = sc.nextDouble();
		System.out.println("area of triangle:" + triAngleArea(height, base));
//	AREA OF CIRCLE	
		
		System.out.println( "enter radius:");
		double radius=sc.nextDouble();
		System.out.println("area of circle:"+ circleArea(radius));
//	AREA OF SQUARE	
		System.err.println("enter value:");
		double side=sc.nextDouble();
		System.out.println( "area of square="+square(side));
//	AREA OF RECTANGLE	
		System.out.println("enter width:");
		double width=sc.nextDouble();
		System.out.println("enter breadth:");
		double breadth=sc.nextDouble();
	System.out.println("area of rectangle:"+rectangle(width,breadth) );
	
//		System.out.println("enter garde:");
//		Object ge = null;
//		System.out.println("first year grade:"+garde(ge));
		
		System.out.println("enter phone num:");
		long num=sc.nextLong();
		System.out.println("phone num="+phonenum(num));
		
		
		System.out.println("enter numeber:");
		BigDecimal hei=sc.nextBigDecimal();
		System.out.println("my height="+height(hei));
		
		
		System.out.println("enter value");
		byte moo=sc.nextByte();
		System.out.println("my money="+ money(moo));
		
		
		System.out.println("enter name:");
		String nam=sc.next();
		System.out.println("my name is="+  name(nam));

		
		System.out.println("enter hall ticket number:");
		BigInteger ticket=sc.nextBigInteger();
		System.out.println("hall ticket number="+hallno(ticket));

		sc.close();

	}

	static double triAngleArea(double height, double base) {
//		System.out.println("artri");
		return 0.5 * base * height;
	}
	
	 static double  circleArea(double  radius){
		 
      return Math.PI*radius*radius;

	}
	 static double square(double side) {
		 return side*side;
	 }
	static double rectangle(double breadth,double width) {
		return breadth*width ;
	}
	static long phonenum( long num) {
		return num;
	} 
	static BigDecimal height(BigDecimal hei) {
		return hei;
	}
	static byte money( byte moo) {
		return moo;
	}
	static String name(String nam) {
		return nam;
	}
	static BigInteger hallno(BigInteger ticket) {
		return ticket;
	}
//	static char garde(Object ge) {
//		return 0;
	}
	
	
	

