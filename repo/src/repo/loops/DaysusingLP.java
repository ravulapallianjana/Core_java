package repo.loops;

import java.util.Scanner;

public class DaysusingLP {

	public static void main(String[] args) {
		 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER (1-7) :");
		int num=sc.nextInt();
		sc.close();
		  for (int i = 1; i <= 7; i++) {
			  if (i == num) {
	                if (i == 1) System.out.println("Sunday");
	                else if (i == 2) System.out.println("Monday");
	                else if (i == 3) System.out.println("Tuesday");
	                else if (i == 4) System.out.println("Wednesday");
	                else if (i == 5) System.out.println("Thursday");
	                else if (i == 6) System.out.println("Friday");
	                else if (i == 7) System.out.println("Saturday");
	            }
		    }

//		for(int i=1; i<=n; i++) {
//			if(n%7==n) {
//				System.out.println("days printed");
//			}
//		}//else {
//			System.out.println("day not printed");
		}

	}


