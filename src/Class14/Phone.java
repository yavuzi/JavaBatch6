package Class14;

public class Phone {
	// define features of phone
	String make;
	String model;
	int price;
	String color;
	float screenSize;
	
	//define behavior (method)
	void operate() {
		System.out.println(make+" " +model +" can operate");
	}
	void takePic( ) {
		System.out.println(make+" " +model +" can take pictures");
	}
	void playVideo() {
		System.out.println(make+" " +model +" play videos");
	}
	
	public static void main(String []args) {
		Phone phone1=new Phone();
		phone1.make="IPhone";
		phone1.model="11 Pro";
		phone1.price=700;
		phone1.color="gold";
		phone1.screenSize=5.85f;
		
		phone1.operate();
		phone1.takePic();
		phone1.playVideo();
		
		Phone phone2=new Phone();
		phone2.make="Android";
		phone2.model="Galaxy S500";
		phone2.price=600;
		phone2.color="black";
		phone2.screenSize=5.95f;
		
		phone2.operate();
		phone2.takePic();
		phone2.playVideo();
		
		Phone phone3=new Phone();
		phone3.make="Nokia";
		phone3.model="Lumia";
		phone3.price=500;
		phone3.color="grey";
		phone3.screenSize=5.10f;
		
		phone3.operate();
		phone3.takePic();
		phone3.playVideo();
		
	}
}