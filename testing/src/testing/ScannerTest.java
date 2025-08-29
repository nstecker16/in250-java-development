package testing;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		// Testing the printing of inputted strings

		// Creating a scanner variable that will accept user input
		Scanner scanner = new Scanner(System.in);
		
		// Asking user to enter their name
		System.out.println("\nPlease enter your name: ");

		// Creating a string variable that will be assigned whatever the user enters
		String userName = scanner.nextLine();

		// Printing userName
		System.out.println("Your name is: " + userName);
	}
}
