package Class15;

public class MethodsTest {

	public static void main(String[] args) {

		Methods obj=new Methods();
		
		obj.sayAnything("Hande", 1);
		obj.isItRaining(true);
		obj.isItRaining(false);
		
		System.out.println();
		//task
		obj.larger(15, 15);
		obj.evenOdd(25);
		obj.palindrome("kayak");
		obj.language("germany");
	}

}
