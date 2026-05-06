package repo.loops;

import java.util.Scanner;

public class PrimeSeries {

	static boolean isprime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;

			}
			break;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
//    System.out.println("enter a value:");
		int a;
//    System.out.println("enter b value:");
		int b;
		while (true) {
			System.out.println("enter first prime values:");

			a = sc.nextInt();
			if(isprime(a)) {
				System.out.println("prime");
				break;
			}else {
				System.out.println("not prime");
				
			}
			
		}
		while (true) {
			System.out.println("enter second  prime values:");

			b = sc.nextInt();
			if(isprime(b)) {
				System.out.println("prime");
				break;
			}else {
				System.out.println("not prime");
				
			}
			
		}
		sum=sum+a+b;
		
System.out.println("sum of two prime values:"+sum);
	}

}
