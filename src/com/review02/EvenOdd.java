package com.review02;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evensSum=0;
		int oddsSum=0;
		
		for(int i=1; i<100; i++)
			if (i%2==0) {
				evensSum=evensSum+i;
			}
			else {
				oddsSum=oddsSum+i;
			}
			
	System.out.println("sum of Even Numbers:"+evensSum);
	System.out.println("sum of Odd Numbers:"+oddsSum);
		
		
		for(int n=1; n<5; n++) {
			if (n==4) {
				System.out.println("end of loop");
				break;
			}
			System.out.println("I am inside the loop");
			System.out.println(n);
			
		}
		
		/* write a program that prints numbers from 1 to 20
		 * I dont want to print 5,6,7
		 */
	
		for(int x=1; x<21; x++) {
			if(x==5 || x==6 || x==7) {
				continue;
			}
			
			System.out.println(x);
		}
	
		/* write a program that prints numbers from 1 to 100
		 * I dont want to print 35-55
		 */
		
		for(int z=1; z<100; z++) {
			if(z>=35 & z<=55) {
				continue;
			}
			
			System.out.println(z);
		}
		
		/* write a program that prints numbers divisible to 5 from 1 to 100
		 * I dont want to print 35-55
		 */
		
		for(int z=1; z<100; z++) {
			if(z%15==0) {
				continue;
			}
			
			System.out.println(z);
		}
	
	}
	
}
