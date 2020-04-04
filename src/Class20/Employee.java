package Class20;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee "+empNumber+ " gets paid "+salary+" dollars annually");
	}
	void work() {
		System.out.println("Employee "+empNumber+ " works for "+company);
	}

}
