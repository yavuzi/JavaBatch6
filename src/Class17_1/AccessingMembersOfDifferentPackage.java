package Class17_1;

import Class17.Employee;

public class AccessingMembersOfDifferentPackage {

public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.title="QA Engineer";
		emp.name="Ahmet";
		//below variables not available due to restrictions
		//emp.lastName --> protected
		//emp.salary --> default
		//emp.ssn --> private
		
		Employee.method1();
		emp.method1();// not prefferable
		//below metods not available due to restrictions
//		emp.method2();--> proteced
//		emp.method3();--> default
//		emp.method4();--> private
	}
}

