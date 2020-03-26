package com.review05;

public class TwoDArrayDemo {

	public static void main(String[] args) {
	
		int[][] num={{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		
		int rows=num.length;
		for(int i=0; i<rows; i++) {
			System.out.println("I am at row index "+i);
			int length=num[i].length;
			for(int j=0; j<length; j++) {
				int element=num[i][j];
				System.out.print(element+ ",");
			}System.out.println();
		}
		int sum=0;
		for (int row=0; row<num.length; row++) {
			int length1=num[row].length;
			for (int col=0; col<length1; col++) {
				int element1=num[row][col];
				sum+=element1;
				
			}
		}
		System.out.println("Sum of all elements is "+ sum);
		
		// find the minimum and maximum in 2D array
		int max=num [0][0];
		int min=num [0][0];
		for (int row=0; row<num.length; row++) {
			int length1=num[row].length;
			for (int col=0; col<length1; col++) {
				if (num[row][col]>max) {
					max=num[row][col];
				}
				if (num[row][col]<min) {
					min=num[row][col];}
			}
		}System.out.println("Maximum number is " +max);
		System.out.println("Maximum number is " +min);
		
		// find the sum of each row
		int[]sum1=new int[num.length];
		for (int row=0; row<num.length; row++) {
			for (int col=0; col<num.length; col++) {
				int element=num[row][col];
				sum1[row]+=element;
			}
		}System.out.println(sum1[0]);
	}
		
}
