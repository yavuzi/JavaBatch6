package Class15;

public class Google {
		// define features as emp id, name, last name, salary, title
		// define a behavior as working, get paid, attending meetings
		
		String name, lastName, title;
		int empId;
		double salary;
		
		void working( ) {
			System.out.println(title+" is working");
		}
		void getPaid() {
			System.out.println(name+" is getting paid $"+salary);
		}

		public static void main(String[]args) {
			Google emp1=new Google();
			emp1.empId=123;
			emp1.name="John";
			emp1.lastName="Smith";
			emp1.title="CEO";
			emp1.salary=200000;
			
			emp1.working();
			emp1.getPaid();
			
			// creating 2nd object
			Google emp2=new Google();
			emp2.empId=124;
			emp2.name="Seyma";
			emp2.lastName="Atasoy";
			emp2.title="QA Engineer";
			emp2.salary=80000;
			
			emp2.working();
			emp2.getPaid();
			
			
			
		}
	

}
