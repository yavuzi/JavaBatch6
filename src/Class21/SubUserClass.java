package Class21;

public class SubUserClass extends UserClass{
	String address;

	public SubUserClass(String name, String mobileNum, String address) {
		super(name, mobileNum);
		this.address = address;
	}
	
	public void userDetails () {
		System.out.println(name+" "+mobileNum+" "+address);
	}

}
