// Testing out if statements

package testing;

import java.util.Scanner;

public class IfStatements {
	
	public static void main(String[] args) {

		// Declaring a string
		String myString = "True";

		// Initializing a scanner for input
		Scanner scanner = new Scanner(System.in);
		
		// Conditional if statement to print if True
		if (myString == "True") {
			System.out.println("myString is True");
		}

		// if-elseif-else statement with number ranges
		System.out.println("Please enter a number value: ");
		int userInput = scanner.nextInt();

		if (userInput >= 1 && userInput <= 3) {
			System.out.println("userInput is within 1 and 3");
		} else if (userInput >= 4 && userInput <= 6) {
			System.out.println("userInput is within 4 and 6");
		} else {
			System.out.println("userInput is not within 1 and 6");
		}

	}
}
