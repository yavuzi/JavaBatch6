package class11;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] groceries = { { "cucumber", "potato", "carrot" }, { "mango", "apple", "banana", "kiwi" },
				{ "milk", "cheese", "yogurt" } };

		// get all values from 2D array
		// loop through rows
		for (int r = 0; r < groceries.length; r++) {
			// loop through columns
			for (int c = 0; c < groceries[r].length; c++) {
				System.out.print(groceries[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println("---------advanced for loop------------");
		// using advanced for loop
		// loop through all arrays
		for (String[] array : groceries) {
		// loop through each array
			for (String items : array)
				System.out.print(items + " ");
			System.out.println();
		}

	}

}
