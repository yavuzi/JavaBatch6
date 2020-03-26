package class11;

public class moreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]professions= {
				{"QA Tester", "Developers", "Product Owner","Scrum Master"},
				{"Math Teacher","Science Teacher","ESL Teacher"},
				{"Dentist", "Surgeon"}
		};
		
		for (String[] occupation:professions) {
			for (String title:occupation) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		
	String [][]cars= {
			{"Lincoln","Cadillac","Ford"},
			{"Mercedes","Renault","BMW"},
			{"Toyota","Nissan","Kia","Mazda"}
			
	};
	
	for(String [] car:cars) {
		for(String brand:car) {
			System.out.print(brand+" ");
		}
		System.out.println();
	};
	
	for (int r = 0; r < cars.length; r++) {
		// loop through columns
		for (int c = 0; c < cars[r].length; c++) {
			System.out.print(cars[r][c] + " ");
		}
	}
	System.out.println();
	
//	String[][] countries= {
//			{"US","Canada"},
//			{"Brazil","Peru","Argentina"},
//			{"Germany","Italy","France","Denmark"},
//			{"Russia","Iraq","China"},
//			{"Camerun","Niger"}};
//			
//	for(String[]country:countries) {
//		for (String countr:country) {
//			System.out.print(countr+" ");
//			
//		}
//		System.out.println();
//	};
//	// total countries
//	int x=countries[0].length;
//	int y=countries[1].length;
//	int z=countries[2].length;
//	int a=countries[3].length;
//	int b=countries[4].length;
//	int c=x+y+z+a+b;
//	System.out.println("Total countries= "+c);
//	System.out.println();
			
	// total countries other method
	
	int count=0;
	String[][] countries= {
			{"US","Canada"},
			{"Brazil","Peru","Argentina"},
			{"Germany","Italy","France","Denmark"},
			{"Russia","Iraq","China"},
			{"Camerun","Niger"}};
			
	for(String[]country:countries) {
		for (String countr:country) {
			System.out.print(countr+" ");
			count++;
		}
		System.out.println();
		System.out.println("Total countries= "+count);
	}
	}
}
