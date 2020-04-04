package Class19;

public class Test {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.breed="Husky";
		dog.color="Grey";
		dog.fur="Too much";
		dog.size="Big";
		
		dog.bark();
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		animal.color="Any";
		animal.size="Any";
		animal.fur="Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		Cat cat=new Cat();
		cat.bigEyes=true;
		cat.fur="Some";
		cat.size="Small";
		
		cat.play();
		cat.eat();
		cat.sleep();
		cat.beWild();
		

	}

}
