package repo;

import java.util.Scanner;



public class MagicNumber {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your input number:");
		int n=sc.nextInt();



        int sum = n;
        int temp;

        while (sum > 9) {
            temp = sum;  
            sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
        }

        if (sum == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
    }


	}


