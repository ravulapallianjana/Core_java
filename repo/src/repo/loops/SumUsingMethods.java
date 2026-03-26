package repo.loops;

import java.util.Scanner;

public class SumUsingMethods {
//	static int sum=0;
	
//	SumUsingMethods(int num){
//		
//		sum=sum+num;
//	}
//	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
//		SumUsingMethod(num);
		
		
		int sum=0;
		
		for(int i=0; i<=num; i++) {
		
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum of numbers:"+sum);
		
		sc.close();
	}



	
	
	}


