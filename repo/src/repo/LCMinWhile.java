package repo;

import java.util.Scanner;

public class LCMinWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=sc.nextInt();
		System.out.println("enter b number");
		int b=sc.nextInt();
		
		int originalA=a;
		int originalB=b;
		
		
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
			
		}
		
		int gcd=a;

		int lcm=(originalA*originalB)/gcd;
		
		System.out.println(lcm);
		
	}
	
	}


