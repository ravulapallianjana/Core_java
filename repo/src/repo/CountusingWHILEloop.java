package repo;

import java.util.Scanner;

//wap to find the count of given number...?
//input:12345
//output:5
public class CountusingWHILEloop {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number:");
		int n=sc.nextInt();
		int r=0;
		while(n!=0) {
			r=n%10;
			n=n%10;
		}
		
		

	}

}
