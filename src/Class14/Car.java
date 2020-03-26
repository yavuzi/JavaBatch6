package Class14;

public class Car {
	// define features of car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior (method)
	void drive() {
		System.out.println(make+ " can drive");
	}
	void accelerate( ) {
		System.out.println(make+ " can accelerate");
	}
	void makeNoise() {
		System.out.println(make+ " makes noise");
	}
}
