package repo.loops;

import java.util.Scanner;

public class Sumofnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=2; i<=num; i++) {
		System.out.println(i);
		sum=sum+i;
		}
		System.out.println("total sum :"+ sum);

	}

}
