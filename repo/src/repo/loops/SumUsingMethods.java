package repo.loops;

import java.util.Scanner;

public class SumUsingMethods {

	
	 static  void SumUsingMethods(int num){
			int sum=0;
	 
		 for(int i=0; i<=num; i++) {
				
          sum=sum+i;
	}
		 System.out.println("sum of numbers:"+sum);
	 }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		SumUsingMethods( num);
		
		


		


		


		
		sc.close();
	}



	
	
	}


