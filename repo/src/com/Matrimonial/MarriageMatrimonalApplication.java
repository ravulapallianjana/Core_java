package com.Matrimonial;

import java.util.Scanner;

public class MarriageMatrimonalApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Beautiful LifePatner Matrimonial Website");
		Scanner sc = new Scanner(System.in);
		System.out.println("tell your name:");
		String name = sc.nextLine();
		System.out.println("Hello mr." + name);
		System.out.println("can you tell,how much assets you have..?");
		double assets = sc.nextDouble();
		System.out.println("enter your salary information:");
		double salary = sc.nextDouble();
		if (assets >= 50000000.00 && salary >= 200000.00) {
			System.out.println("yes!! then we can start the converstion");
			System.out.println(" enter your age: ");
			int age = sc.nextInt();
			if (age <= 28 && age >= 24) {
				System.out.println("ohh okay !! shall we proceed furthur");
				System.out.println("can enter your weight..?");
				double weight = sc.nextDouble();
				if (weight <= 70 && weight >= 55) {
					System.out.println("okay cool!! lets enter your height:");
					float height = sc.nextFloat();
					if (height > 5.4 && height <= 6.0) {
						System.out.println("okay good to go !");
						System.out.println("do you have sibilings..?");
						boolean sibstatus = sc.nextBoolean();
						if (!sibstatus) {
							System.out.println("okay we will get back to you soon");
						} else {
							System.out.println("OMG!!!!!!!!!!");
						}
					} else {
						System.out.println("your height is too long ot too short!! not match with our profile!");
					}
				} else {
					System.out.println("you must join GYM");
				}
			} else {
				System.out.println("sorry !! your age is not matching");
			}
		} else {
			System.out.println("sorry.... you can leave for the day !! all the best");
		}
	}
}
