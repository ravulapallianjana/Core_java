package com.arrays;
//Count even and odd numbers
public class CountEvenOdd {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int evencount=0;
		int oddcount=0;
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				evensum=evensum+arr[i];
				evencount++;
			}else{
				oddsum=oddsum+arr[i];
				oddcount++;
			}
			
			
		}
		System.out.println("evensum:"+evensum);
		System.out.println("oddsum:"+oddsum);
		System.out.println("evencount:"+evencount);
		System.out.println("oddcount:"+oddcount);
		
	}

}
