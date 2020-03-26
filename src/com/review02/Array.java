package com.review02;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A','B','C','D','E','F'};
		
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+ " ");
		}
			
		System.out.print("-----------using advanced for loop---------- ");
			
		for (char grade:grades) {
			System.out.print(grade + " ");
		}
			
		System.out.println ("-----------using advanced for loop and if---------- ");
		// create an array of fruits and retrieve all elements using advanced for loop	
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		for (String fruit:fruits) {
			
			if (fruit.equals("Apple")) {
				System.out.println(fruit+ " is your favorite fruit");
			} else {
				System.out.println(fruit);
			}
		}
		
		
	}

}
