package class11;

import java.util.Scanner;

public class TaskUserNamePassword {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a username");
		String username = scan.nextLine();

		System.out.println("Please enter a password");
		String password = scan.nextLine();

		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if (!password.contains(username)) {
					System.out.println("Please confirm your password");
					String confirmpass = scan.nextLine();

					if (password.equals(confirmpass)) {
						System.out.println("Your acccount is created");
					} else {
						System.out.println("Passwords do not match");
					}
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password should be minimum 8 characters");
			}
		} else {
			System.out.println("Username and password cannot be empty");
		}

	}

}
