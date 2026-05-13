package com.oops1.Polymorphosim;

import java.util.Scanner;
//area of triangle:0.5*base*height
//area of square:side*side
//area of rectangle:length
//area of circle:pi*r*r

public class Areas_Find_M0L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  base:");
		float b = sc.nextFloat();
		System.out.println("enter  height:");
		double h = sc.nextDouble();
		System.out.println(triangle(b, h));
		
		System.out.println("enetr side :");
		double s = sc.nextDouble();
		System.out.println(square(s));
		System.out.println("enetr lenght :");
		float l = sc.nextFloat();
		System.out.println("enetr breadth :");
		float br = sc.nextFloat();
		System.out.println(rectangle(l, br));
		System.out.println("enetr radius :");
		float r = sc.nextFloat();
		System.out.println(circle(r));

	}

	static double triangle(float b, double h) {
		return 0.5 * b * h;

	}

	static double square(double s) {
		return s * s;

	}

	static double rectangle(float l, float br) {
		return l * br;

	}

	static double circle(float r) {
		return Math.PI * r * r;

	}

}
