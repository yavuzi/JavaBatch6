package Class12;

public class class12 {

	public static void main(String[] args) {
	
		String str="Good Morning Students!";
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println("Letter at index 4 is "+letter5+".");
		
		// get all characters 1 by 1 from String
		


		for (int i=0; i<str.length(); i++) {
			char letter=str.charAt(i);
			System.out.print(letter+ " ");
		}
		System.out.println();
		for (int i=str.length()-1; i>=0; i--) {
			char letter=str.charAt(i);
			System.out.print(letter+ " ");
		}
		
		System.out.println("-------indexOf() function---------------");
		String name="Syntax Technologies";
		int index=name.indexOf("y");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
			
		index = name.indexOf("!");
		System.out.println("Index of not existing character"+index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		index=name.indexOf("Technologies");
		System.out.println(index);
		
		
		index=name.indexOf("o", 0);
		System.out.println("Index of first O ="+ index);
		index=name.indexOf("o", 1);
		System.out.println("Index of second O ="+ index);
	}

}
