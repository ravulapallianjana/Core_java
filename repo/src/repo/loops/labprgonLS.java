package repo.loops;

import java.util.Scanner;

public class labprgonLS {

	public static void main(String[] args) {
	System.out.println("checking 5and 3 divisibles ");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
	 if(n%5==0 && n%3==0) {
			System.out.println("anjana ajay");
		}

	 else if(i%5==0) {
			System.out.println("Anjana");
		}else if(i%3==0) {
				System.out.println("Ajay");
				
			}
		else{
			System.out.println(i);
		}
		
		}
		
			
		}
	}
	


