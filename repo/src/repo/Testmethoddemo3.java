package repo;
import java.util.Scanner;

public class Testmethoddemo3 {
	 int acnum=93;
	  String name="ANJANA";
	  float mymoney;
	 int pin;

	public static void main(String[] args) {
		System.out.println("main method started");
		Testmethoddemo3 t3=new Testmethoddemo3();
	System.out.println("account num:"+(t3.acnum));
	System.out.println(" accounter name:"+(t3.name));
	System.out.println("my money:"+(t3.mymoney));
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter deposited money in your account:");
		double d=sc.nextDouble();
		
		System.out.println("enter withdrawed money:");
		double d1=sc.nextDouble();
		
		System.out.println("enter your pin:");
		int p=sc.nextInt();
		
		
		
		System.out.println("deposited money:"+getdeposit(d));
		System.out.println("withdrawed money from dopisited money:"+getwithdraw(d1));
		System.out.println("thanks for withdrraw");
		System.out.println("check  balence:"+getwithdraw(getdeposit(d-d1)));
		System.out.println("pin set :"+pinset(p));
		
		
		sc.close();
		}

 static double getdeposit(double d) {
	return d;
	 

}
 static double getwithdraw(double d1) {
 
	 return d1;
 }
	static int pinset(int p) {
		return p;
	}
}
