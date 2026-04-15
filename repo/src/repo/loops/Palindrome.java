package repo.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
    System.out.println(" to find the palindrome number");
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number:");
    int n=sc.nextInt();
//    System.out.println("enter b value");
//    int b= sc.nextInt();
    int temp=n;
    int r=0;
//    int n1=0;
    int rev=0;
    
            while(n!=0) {
            	r=n%10;
            	n=n/10;
            	rev=rev*10+r;
        
            	
            }
            System.out.println("reverse  value:"+rev);
            
            if(temp==rev) {
            	System.out.println(" palindrome");
            	
            	
            }else {
            	System.out.println("not palindrome");
            }
	}

}
