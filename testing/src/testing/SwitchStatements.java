package testing;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
	
		// Initializing scanner for user input
		Scanner scanner = new Scanner(System.in);

		// Asking user for input and assigning scanner variable
		System.out.println("This is a test program for switch statements, enter a number 1-3 :");
		int userInput = scanner.nextInt();

		// Switch statement to output based on user input
		switch (userInput) {
			case 1:
				System.out.println("You have entered 1.");
				break;
			case 2:
				System.out.println("You have entered 2.");
				break;
			case 3:
				System.out.println("You have entered 3.");
				break;
			default:
				System.out.println("Invalid number.");
				break;
		}
	
	}
}
