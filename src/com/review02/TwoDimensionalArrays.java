package com.review02;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
 
		int[][] numbers=new int[3][4];  // this means 3 rows, 4 columns
		// First row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		// Second row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		
		// Third row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		
		//print value 15
		System.out.println(numbers[1][2]);
		
		int [][] nums= {{10,20,30,40},{5,10,15,20},{1,2,3,4}};
		System.out.println(numbers[1][2]);
		
		String [][]month= {{"January", "February","December"},{"March", "April", "May"},{"July","August"},{"Sept","Oct","Nov"}};
		
		System.out.println(month[1][2]);  //may
		
		int rows=month.length; // how many arrays, which is 4
		int firstArray=month[2].length;
		System.out.println(firstArray);
		
		for(int i=0;i<month.length; i++) { //iterates over rows
			for(int j=0; j<month[i].length; j++) {  //iterates over columns
			System.out.print(month[i][j]+" ");
		}
			System.out.println();
		}
		
	}

}
