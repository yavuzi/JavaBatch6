package com.review02;

import java.util.Scanner;

public class AskItemPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s;
		String item;
		
		double price;
		double money;
		double amount=0;
		double remaining;
		double change;
		
		s=new Scanner(System.in);
		System.out.println("Please Enter Item You Want to Buy : ");
		item = s.nextLine();	
		
		System.out.println("What is the price for the "+item+ "?");
		price = s.nextDouble();	
		
		do {
			System.out.println("Please give me payment");
			money=s.nextDouble();
			
			amount=amount+money;
			
			if (amount<price) {
				remaining=price-amount;
				System.out.println("Please give more "+remaining);
			} else if (amount>price) {
				change=amount-price;
				System.out.println("Here is your change "+change);
				break;
			}else{
				System.out.println("we got your correct payment");
			}
		}while (price!=amount);
			
		System.out.println("Thank you for shopping");
		
		
	}

}
