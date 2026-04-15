package repo;

import java.util.Scanner;

public class AMSTRONGnumbers {

	public static void main(String[] args) {
		System.out.println("find the armstrong number");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your amstrong num:");
		int n=sc.nextInt();
		int r=0;
		int n1=n;
		int temp=n;
		int count=0;
		int sum=0;
		String s=Integer.toString(n);
		int armstrong=s.length();
		
		sc.close();
		while(n!=0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
//		System.out.println("amstrong value:"+ sum);
		if(temp==sum) {
			System.out.println(" given num is armstrong");
		}else {
			System.out.println("given num is not armstrong");
		}
	

	}

}
