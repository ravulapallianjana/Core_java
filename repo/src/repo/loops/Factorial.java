package repo.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fact=1;
		 for(int i=1; i<=num;i++) {
		 System.out.println(i);
		 fact=fact*i;
		 }
		 
		System.out.println("total factorial:"+ fact);

	}

}
