package com.review02;

public class NestedForLoopPatternNo {

	public static void main(String[] args) {
	
		for (int i=7; i>1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		for (int i=1; i<8; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
