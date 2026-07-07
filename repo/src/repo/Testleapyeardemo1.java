package repo;

import java.util.Scanner;

public class Testleapyeardemo1 {

	public static void main(String[] args) {
		System.out.println("leap year related");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year: ");
		int year =sc.nextInt();
		if( year%400==0 ) {
			System.out.println("year is leap year ");
			
		}else {
			System.out.println("year is not leap year" );
		}
	}

}
