package Class14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
				Car car1=new Car();
				car1.make="Lamborghini";
				car1.model="Gallardo";
				car1.year=2020;
				car1.color="Ble";
				
				Car car2=new Car();
				car2.make="BMW";
				car2.model="m5";
				car2.year=2019;
				car2.color="pink";
				
				Car car3=new Car();
				car3.make="123";//if we put 123 the compiler will give an error cause it goes by the template you have
				              // created
				car3.speed=200;
				//print BMW
				System.out.println(car2.make);
				// I drive pink BMW
				System.out.println("I drive "+car2.color+" "+car2.make);
				
				//accessing behaviors/methods of Car class
				car1.drive();
				car1.accelerate();
				car1.makeNoise();

				car2.drive();
				car2.accelerate();
				car2.makeNoise();
				
	}

}
