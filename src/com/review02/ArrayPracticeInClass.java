package com.review02;

public class ArrayPracticeInClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals= {"Bear", "Tiger", "Dog", "Cat", "Lion", "Mice"};
		for (String animal:animals) {
			System.out.print(animal+" ");
			}
		
		for (int n=0; n<animals.length; n++) {
			System.out.print(animals[n]+ " ");
		}
		
		System.out.println("    -----------Country Exercise--------"
				+ "   ");
		String[] countries= {"US", "UK", "Germany", "Turkey"};
		for (String country:countries) {
			if (country.equals ("US")) {
				System.out.println("Capital of " +country+ " is DC");
			}	else if (country.equals ("UK")) {
					System.out.println("Capital of " +country+ " is London");
			}	else if (country.equals ("Germany")) {
					System.out.println("Capital of " +country+ " is Berlin");
			}	else if (country.equals ("Turkey")) {
						System.out.println("Capital of " +country+ " is Ankara");
			}
			else {
				System.out.println("the country is not in our data");
			}
		}
		
		for (int x=0; x<countries.length; x++) {
			if (x==0) {
				System.out.println("Capital of " +countries[x]+ " is DC");
			}	else if (x==1) {
					System.out.println("Capital of " +countries[x]+ " is London");
			}	else if (x==2) {
					System.out.println("Capital of " +countries[x]+ " is Berlin");
			}	else if (x==3) {
						System.out.println("Capital of " +countries[x]+ " is Ankara");
			}
			else {
				System.out.println("the country is not in our data");
			}
		}
		
		
		for (int z=0; z<countries.length; z++) {
			switch(countries[z]) {
			case "US":			
				System.out.println("Capital of " +countries[z]+ " is DC");
				break;
			case "UK":
				System.out.println("Capital of " +countries[z]+ " is London");
				break;
			case "Germany":
				System.out.println("Capital of " +countries[z]+ " is Berlin");
				break;
			case "Turkey":
				System.out.println("Capital of " +countries[z]+ " is Ankara");
				break;
			}
			
		}
	
	int[] num= {5,15,27,53,49};
	int sum=0;
	for (int i:num) {
		sum +=i;
	}
	System.out.println("the sum of of the numbers is : " +sum);
	
	int sum1=0;
	for (int i=0; i<num.length; i++) {
		sum1 +=num[i];
	}
	System.out.println("the sum of of the numbers is : " +sum1);
	
	}

}
