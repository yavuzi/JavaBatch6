package com.review02;

import java.util.Scanner;

public class ContinueScannerScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int number, number2, i, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Starting Number : ");
		number = sc.nextInt();	
		
		System.out.print("Please Enter Ending Number : ");
		number2 = sc.nextInt();	
		
		for(i = number; i <= number2; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("The Sum of Even Numbers from "+number+" to "+ number2 + "  =  " + evenSum);
		System.out.println("The Sum of Odd Numbers from " + number+" to "+number2+ "= " + oddSum);
	
	}
	
	
}
