package repo;

import java.util.Scanner;

public class Testlsdemo3 {

	public static void main(String[] args) {
		System.out.println("usong if and else statements");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age num :");
		int num=sc.nextInt();
		
		switch(num) {
		case 5:
			System.out.println("you are a child");
			break;
		case 12:
			System.out.println("kid");
			break;
			
		case 18:
			System.out.println("tineage");
			break;
		case 25:
			System.out.println("young age ");
			break;
		case 35:
			System.out.println("old");
			break;
			default:
				System.out.println("enter num is not there in program");
			}
		
		
	}
	}
	
