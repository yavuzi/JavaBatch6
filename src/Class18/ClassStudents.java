package Class18;

public class ClassStudents {
	 String firstName, lastName;
	 double mathGrade, physicsGrade, chemistryGrade;
	 
	double avrGrade() {
	double avrGrade=(mathGrade+physicsGrade+chemistryGrade)/3;
	System.out.println("Average grade of "+firstName+" "+lastName+" is "+avrGrade);
	return avrGrade;
	}
	
	ClassStudents(String studentFirstName, String studentLastName, int studentmath,int studentPhysics,int studentChemistry) {
	firstName=studentFirstName;
	lastName= studentLastName;
	mathGrade=studentmath;
	physicsGrade=studentPhysics;
	chemistryGrade=studentChemistry;
	}
	public static void main(String[] args) {
	
	ClassStudents student1=new ClassStudents("John","Wayne",90,85,87);
	student1.avrGrade();
	ClassStudents student2=new ClassStudents("Alpha","Chino",60,80,57);
	student2.avrGrade();
	ClassStudents student3=new ClassStudents("Demi","Moo",72,83,77);
	student3.avrGrade();
	ClassStudents student4=new ClassStudents("Bro","Will",95,92,94);
	student4.avrGrade();
	ClassStudents student5=new ClassStudents("Clint","East",97,93,96);
	student5.avrGrade();
	}
}
	
	