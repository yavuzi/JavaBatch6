package Class19;

public class Student {
	String name, address;
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Student= "+name+", Address= "+address);
		}
	
	public static void main(String[] args) {
		Student obj=new Student("Alpha Chino", "Sacramento CA");
		obj.displayInfo();
	}

}
