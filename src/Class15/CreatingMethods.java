package Class15;

public class CreatingMethods {
	// create a method that accepts marks (90, 80 etc)
	// based on the marks it returns grade (A, B, C)
	// if grade > 90 -->A, 90<B<80, 80<C<70
	
	char getGrade(int a) {
		char grade='A';
		
		if(a>=90) {
			grade='A';
		}
		if (a>=80 && a<90) {
			grade='B';
		}
		if (a>=70 && a<80) {
			grade='C';	
		}
		if (a>=60 && a<70) {
			grade='D';
		}
		if (a<60 ) {
			grade='F';
	}
		return grade;
	}
	
	public static void main(String[]args) {
		CreatingMethods obj=new CreatingMethods();
		char grade=obj.getGrade(85);
		System.out.println("The grade is: "+grade);
	}
}
