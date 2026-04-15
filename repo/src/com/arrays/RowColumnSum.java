package com.arrays;

public class RowColumnSum {

	public static void main(String[] args) {
		int arr[] [] = {{1,2,3},{5,6,7},{11,22,33}};
		System.out.println("row sum:");
		
for(int [] num:arr) {
	int sum=0;
	for(int a:num) {
		sum=sum+a;
		
	}
	
	System.out.println(sum);
	
}
System.out.println();

System.out.println("column sum is:");

for (int j=0;j<arr.length;j++) {
	int sum=0;
	for(int i=0;i<arr[j].length;i++) {
		sum= sum+arr[i][j];
	}
	
	System.out.println(sum);
}
	}

}
