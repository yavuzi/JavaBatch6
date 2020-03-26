package com.review02;



public class ArrayHW {

	public static void main(String[] args) {
		
		for (int x =5; x >= 1; x--) {
			for(int y=x; y>=1; y--) {
			System.out.print(x);
			}
		System.out.println();	
		}
		
		for (int x =1; x <= 5; x++) {
			for(int y=1; y<=x; y++) {
			System.out.print("*");
			}
		System.out.println();	
		}
		for (int x =4; x >= 1; x--) {
			for(int y=1; y<=x; y++) {
			System.out.print("*");
			}
		System.out.println();	
		}
	}
}
