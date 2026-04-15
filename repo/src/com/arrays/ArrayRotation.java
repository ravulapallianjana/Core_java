package com.arrays;

import java.util.Scanner;

//there are two types of array rotations
//1.right rotation
//input:{1,2,3,4,5}
//o/p:{4,5,1,2,3}
//2.left array rotation
//input:{1,2,3,4,5}
//o/p:{3,4,5,1,2}
//Rotation	Order of Steps
// RIGHT:::	Full → First → Remaining
// LEFT	:::First-> Remaining → Full
public class ArrayRotation {

	public static void rotation(int arr[], int start, int end) {
	
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		
	}
	
	}
	public static void reverse( int arr[], int r) {
		int start=0;
		int temp=0;
		int end=arr.length-1;

//right rotation 
//		 rotation( arr ,start ,end);//full
//		rotation (arr,start,r-1);//first half
//		rotation (  arr,r,end );//remaining
//		
		
//		left rotation
			rotation (arr,start,r-1);//first half
			rotation (  arr,r,end );//remaining
			rotation( arr ,start ,end);//full
			
	}
	
	public static void main(String[] args) {
		
int []  arr= {1,2,3,4,5};



Scanner sc=new Scanner(System.in);
System.out.println("enetr how many times iterated");


int r=sc.nextInt();
//int r=3;
reverse( arr,r);
for(int num:arr) {
	System.out.println(num);
}
System.out.println();

	}

}
