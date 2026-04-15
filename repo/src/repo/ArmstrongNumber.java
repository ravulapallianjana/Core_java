package repo;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your neon number:");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		int square=n*n;
		

		while (square!= 0) {
			int r=square%10;
			sum+=r;
			square/=10;
			
			
//			r = n * n;
//			System.out.println("square value:"+ r);
//			sum=sum+r;

		}
		System.out.println("sum value:"+sum);
		if(sum==temp) {
			System.out.println("given num is neon ");
		}else {
			System.out.println(" given num is not neon");
		}

	}

}
