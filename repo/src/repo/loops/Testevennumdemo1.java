package repo.loops;

import java.util.Scanner;

public class Testevennumdemo1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		  
		int num=sc.nextInt();
          int count=0;
  
 
		
		for(int i=2; i<=num; i=i+2) { 
		System.out.println(i);
		count++;
			
		}
		System.out.println("total even num count:"+count);
sc.close();
	}

}
