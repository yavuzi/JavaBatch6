package com.review02;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner scan;
		int number = 1;
		scan = new Scanner(System.in);

		int luckyNumber = 17;

		do {
			System.out.println("Please enter a number from 1 - 20");
			number = scan.nextInt();

		} while (number != luckyNumber);

		System.out.println("You got it");
		
		scan.close();

	}

}
