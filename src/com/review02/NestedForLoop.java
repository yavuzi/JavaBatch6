package com.review02;

public class NestedForLoop {

	public static void main(String[] args) {
		
//	for (int i=1; i<=3; i++) {
//		for (int j=1; j<=3; j++) {
//			System.out.println(i+" "+j);
//		}
//	}
		
	// using nested loop to print from 10 to 99
	
	for (int i=1; i<=9; i++) {
		for(int j=0; j<=9; j++)
			System.out.println(i+""+j);
		}
	// using nested loop to print clock
	
	for (int h=0; h<24; h++) {
		for(int m=0; m<60; m++) {
			if(m<10) {
			System.out.println(h+":0"+m);
		} else {
			System.out.println(h+":"+m);
		}
		}	
	}
	
	}
}
