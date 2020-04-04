package Class19;

public class Book {
	static String type, name;
	int price;
	
	public Book(int price) {
	System.out.println("The price is "+price+" dollars");
	}	
	public Book(String type, String name) {
		System.out.println("The name of the book is "+name+" and the type is "+type);
	}
	
	public static void main(String[] args) {
	
	Book obj=new Book("Adventure","Johny");
	new Book (10);
		
	}

}
