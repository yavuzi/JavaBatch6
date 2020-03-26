package com.review02;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // we want to ask users name 5 times and print good afternoon _____
	
		Scanner input;
		String name;
		int num=1;
		
		
		
		input=new Scanner(System.in);
		while(num<=5) {
		
		System.out.println("What is your name?");
		
		name=input.nextLine();
	
		System.out.println("Good Afternoon " +name);
		
		num++;
		}
	}

}
