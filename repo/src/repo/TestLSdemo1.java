package repo;

import java.util.Scanner;

public class TestLSdemo1 {
	public static void main() {
		System.out.println("now Iam started logical statements");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("u are eligilible to vote and driving");
			
			System.out.println("enter your height");
			double height=sc.nextDouble();
			if(height>=5.6) {
				System.out.println("you are eligible to go to next step in  for SI");
				
				System.out.println("enter your weight");
				float weight=sc.nextFloat();
				
				
				if(weight>=50) {
					System.out.println("your are select next round");
				} else {
					System.out.println("you are disqualify");
				}
			}else {
				System.out.println("other wise youe are not eligibile for SI");
			}
		}else {
			System.out.println("u are not eligibile ");
		}
		
		}
		
	}

