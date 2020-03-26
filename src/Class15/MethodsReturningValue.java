package Class15;

public class MethodsReturningValue {

	public static void main(String[] args) {

		String str="Hello my friend";
		int length=str.length();
		
		if (length>10) {
			System.out.println("String is long");
		} else {
			System.out.println("String is short");
		}
		
		// compare 2 numbers and then we will identify whether largest is even or odd
//		Methods obj=new Methods();
//		int num=obj.larger(10,20);
		
		MethodsReturningValue newObj=new MethodsReturningValue();
		int num=newObj.largest(12,14);
		boolean flag=newObj.isOdd(num);
		System.out.println("The largest number is odd: "+flag);
		
		
		
	}
	// (outside main method)create a method that returns largest number from 2 given numbers 
	int largest(int a, int b) {
	int largest;
	if (a>b) {
		largest=a;
	}else {
		largest=b;
	}
	return largest;
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		if (num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
	
		return isOdd;
	}
	
}
