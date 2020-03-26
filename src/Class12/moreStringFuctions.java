package Class12;

public class moreStringFuctions {

	public static void main(String[] args) {
	
		String me="I am a good tester";
		
		String newString=me.replace ("a", "c");
		System.out.println(newString);
		
		me=me.replace("good", "great");
		System.out.println(me);
		
		me=me.replace("great","awesome");
		System.out.println(me);
		System.out.println(newString);
		
		
		String str="Phone number is 1234567890";
//		str=str.replaceAll("[A-Z]", "");
//		System.out.println(str);
//		str=str.replaceAll("[a-z]", "");
//		System.out.println(str);
		
		str=str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		str=str.replaceAll(" ","");
		System.out.println(str);
		
		String str1="Hello %%12&&&3764**97";
		str1=str1.replaceAll("[0-9]","");
		System.out.println(str1);
		
		String str2="Hello %%12&&&3764**97";
		str2=str2.replaceAll("[^A-Za-z0-9]",""); // replace anything except letters and numbers
		System.out.println(str2);
		
		String today="Today is my favorite Java class";
		String [] array=today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java class";
		String[] stringArray=today1.split("a");
		
		for(String arr:stringArray) {
			System.out.print(arr+" ");
		}
		
	}

}
