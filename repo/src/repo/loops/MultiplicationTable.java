package repo.loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
 
int mul=0;


for(int i=1; i<=10; i++) {
	System.out.println(num + " x " + i + " = " + (num * i) );
//	mul=2*i;
//	mul=i*i;
	
}

//System.out.println("total table:"+ mul);	
	
	}

}
