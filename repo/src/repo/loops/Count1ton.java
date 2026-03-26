package repo.loops;

import java.util.Scanner;

public class Count1ton {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
				
int count=0;
for(int i=1; i<=n;i++) {
	System.out.println(i);
	
	count++;
}
System.out.println("total count:"+ count);
	}

}
