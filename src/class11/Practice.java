package class11;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a username");
		String username = scan.nextLine();
		System.out.println("Please enter a password");
		String password = scan.nextLine();
		if (!(username.isEmpty() || password.isEmpty())) {
			if (!username.contains(password)) {
				if (password.length() >= 8) {
					System.out.println("Please confirm your password");
					String confirmpass = scan.nextLine();
					if (confirmpass.equals(password)) {
						System.out.println("Your username and password are created");
					} else {
						System.out.println("Your passwords do not match");
					}

				} else {
					System.out.println("Password cannot be less than 8 characters");
				}

			} else {
				System.out.println("Username cannot contain password");
			}

		} else {
			System.out.println("Username or password cannot be empty");
		}

	}

}
