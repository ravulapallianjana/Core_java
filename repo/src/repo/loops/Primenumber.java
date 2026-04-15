package repo.loops;

import java.util.Scanner;

public class Primenumber {
	 static boolean isprime(int n) {
	
	boolean prime=true;
	if(n==0||n==1) {
		return false;
	}
	
	for(int i=2;i<n;i++) {
		if(n%i==0) {


			return prime = false;
	}
		 
	}
	return prime;
	
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(isprime( n));
		for(int i=2;i<=n;i++) {
			if(isprime(i))
			System.out.println(i);
			
		}


			
		}

}
