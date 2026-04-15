package repo;

import java.util.Scanner;

public class GCDfind {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number :");
		int a=sc.nextInt();//12
		System.out.println("enter b number :");
		int b=sc.nextInt();//18
		
		
		while(b!=0) {//b not equal 
			int temp=b;
			b=a%b;
			a=temp;
		}
System.out.println(a);
		
		

	}

}
