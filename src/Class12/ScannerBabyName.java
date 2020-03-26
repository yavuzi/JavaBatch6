package Class12;

import java.util.Scanner;

public class ScannerBabyName {

	public static void main(String[] args) {


		// Give baby a name
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter dad`s name");
		String dadname=scan.nextLine();
		System.out.println("Please enter mom`s name");
		String momname=scan.nextLine();
		
		System.out.println("Boy or Girl");
		String gender=scan.nextLine();
		
		int d=dadname.length()/2;
		String partiald=dadname.substring(0, d);
		String partialdend=dadname.substring(d, d*2+1);
		
		int m=momname.length()/2;
		String partialm=momname.substring(0, m);
		String partialmend=momname.substring(m, m*2+1);
		if (gender.equalsIgnoreCase("Boy")) {
			
			System.out.println(partiald+partialmend);
		} else if (gender.equalsIgnoreCase("Boy")){
			System.out.println(partialm+partialdend);
			
		}
	    Scanner userInput = new Scanner(System.in);

			String[] arr = new String[7];

			for (int i = 0; i <arr.length; i++) {

				System.out.println("Please enter day " + (i+1) + " of the week");
				arr[i] = userInput.next();
			}
			
			
			for(int i=0; i<=arr.length-1; i++){
				System.out.println(arr[i]);
			}
	}

}
