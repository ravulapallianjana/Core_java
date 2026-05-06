package com.starpatterns;

public class CharsPrints {

	public static void main(String[] args) {
	char i,j,c='a';
	char [] arr= {'A','N','J','A','N','A'};
	
	for(i=0;i<arr.length;i++) {
		for(j=0;j<arr.length;j++) {
			if(i==j||i+j==arr.length-1) {
				System.out.print(arr[i]+" ");
				
			}else {
				System.out.print(c+" ");
				c++;
			}
		
		}
		System.out.println();

	}
			

	}

}
