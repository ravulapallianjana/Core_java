package repo;

import java.util.Scanner;

public class ARMSTRONGusingcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your number :");
		int n=sc.nextInt();
		int temp=n;
		int n1=n;
		int r=0;
		int sum=0;
		int count=0;
//	 System.out.println(Math.pow(3,3);
		
		
		while(n!=0) {
			r=n%10;
			n=n/10;
			count++;
		}
	
		
		while(n1!=0) {
			r=n1%10;
			n1=n1/10;
			sum=(int)(sum+Math.pow(r, count)) ;
		}
		if(temp==sum) {
			System.out.println(" entered num is armstrong:");
		}else {
			System.out.println(" entered num is not an armstrong number:");
		}

	}

}
