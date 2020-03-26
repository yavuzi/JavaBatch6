package Class14;

public class Dog {
	// define features of car
	String breed;
	String color;
	String name;
	int age;
	//define behavior (method)
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "German Shepperd";
		dog1.color = "Brown";
		dog1.name = "Max";
		dog1.age = 2;

		Dog dog2 = new Dog();
		dog2.breed = "Maltese";
		dog2.color = "White";
		dog2.name = "Max";
		dog2.age = 4;
		
		System.out.println("I love my "+dog1.age+" years old "+ dog1.color+" "+dog1.breed+" "+dog1.name );
		
		dog1.bark();
		dog1.run();
		dog1.eat();
}
}
