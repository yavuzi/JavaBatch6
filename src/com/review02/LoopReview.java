package com.review02;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ask a user to pay for a candy
		 * As long as the entered price is not 2 dollars
		 * we need to keep ask for paying
		 * Once the amount is correc enjoy your candy
		 */
//		
//		Scanner s;
//		double price;
//		
//		s=new Scanner(System.in);
//			
//		System.out.println("Please pay for a candy");
//		price=s.nextDouble();
//		
//		while(price!=2) {
//		System.out.println("Please pay for a candy");
//		price=s.nextDouble();
//		}
//		System.out.println("Please pay for a candy");
		
		int even=0;
		int odd=0;
		
		for(int n=1; n<100; n++)
			if (n%2==0) {
				sumE=sumE+n
			}
			else {
				sumO=sumO+n
			}
			}
	System.out.println("sum of Even Numbers:"+sumE);
	System.out.println("sum of Odd Numbers:"+sumO);
	}

}
