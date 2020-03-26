package Class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Print in reverse order
		String str="Sunday is not holiday";
		char letter;
		for (int i=str.length()-1; i>=0; i--) {
			letter=str.charAt(i);
			System.out.print(letter+ " ");
		}
		System.out.println();
		String str1="y";
			if (!str1.isEmpty()) {
				int i=str1.length();
				if(i%2==1 && i>=3) {
					int middle=str1.length()/2;
					char m = str1.charAt(middle);
					System.out.println(m);
					
				} else if (i%2==0) {
					System.out.println("String has even number of characters");
				} else if (i<3) {
					System.out.println("String has less than 3 characters");
					
				}				
				
			} else {
				System.out.println("String is empty");
				
				
	
			}
	}
	
	

}
