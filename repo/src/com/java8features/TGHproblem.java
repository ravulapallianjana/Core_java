package com.java8features;

import java.util.Scanner;

public class TGHproblem {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] price = new int[n];

        System.out.println("Enter prices:");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        for (int i = 0; i < price.length; i++) {

          
            if (i == price.length - 1) {
                System.out.print(price[i] + " ");
                continue;
            }

            int next = -1;

            for (int j = i + 1; j < price.length; j++) {

                if (price[j] < price[i]) {
                    next = price[j];
                    break;
                }
            }

            if (next != -1) {
                System.out.print((price[i] - next) + " ");
            } 
           
            else {
                System.out.print(price[i] + " ");
            }
        }

        sc.close();
    }

	}

