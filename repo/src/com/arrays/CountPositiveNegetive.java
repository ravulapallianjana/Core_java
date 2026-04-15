package com.arrays;
//Count number of positive and negative numbers
public class CountPositiveNegetive {

	public static void main(String[] args) {
		int positivecount=0;
		int negetivecount=0;
		
		
		int [] arr= {-1,-2,-3,-5,1,2,3,4,5,9};
		
		for(int i=0;i<arr.length;i++) {
			if(i>0) {
				System.out.println("postitive numbers:"+arr[i]);
				
			}else {
				System.out.println("negetive number:"+arr[i]);
			}
			
		}
		

	}

}
