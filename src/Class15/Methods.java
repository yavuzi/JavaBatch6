package Class15;

public class Methods {
	//create a method that will say welcome 10 times
	
	void sayWelcome() {
		for (int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	void sayAnything(String word, int times) {
		for (int i=1; i<=times; i++) {
			System.out.println(word);
		}
		
	}
	
	//create a method isItRaining,
	//that will accept boolean value as a parameter
	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("It is raining stay at home");
		}else {
			System.out.println("It is not raining, go for a walk");
		}
	}
	
	void larger(int a,int b) {
		if (a>b) {
			System.out.println(a+ " is larger");
		} 
		if (b>a) {
			System.out.println(b+ " is larger"); 
		} else {
			System.out.println("Both numbers are equal");
		}
	}
	
	void evenOdd (int a) {
		if (a%2==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is odd");
		}
	}
	
	void palindrome (String word) {
		String reverse="";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (reverse.equalsIgnoreCase(word)) {
			System.out.println(word+" is palindrome");
		} else {
			System.out.println(word+ " is not palindrome");
		}
		
	}
	void language(String country) {
		switch (country.toLowerCase()) {
		case "turkey":
			System.out.println("Merhaba");
			break;
		case "usa":
			System.out.println("Hello");
			break;
		case "germany":
			System.out.println("Hallo");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "albania":
			System.out.println("Përshëndetje");
			break;
		default:
			System.out.println("Country is not in the system");
		}
		
	}
	
	
	 
}
