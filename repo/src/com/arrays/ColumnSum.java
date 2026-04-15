package com.arrays;

public class ColumnSum {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{11,22,33},{5,6,7}};
		int rowsum=0;
		int columnsum=0;
		for (int j=0;j<arr.length;j++) {
			 
			for(int i=0;i<arr[j].length;i++) {
				
				rowsum= rowsum+arr[j][i];
				columnsum=columnsum+arr[i][j];
			}
			System.out.println("row sum is:"+rowsum);
			System.out.println("column sum is:"+columnsum);
		}
	
	}

}
