package unit2;

import java.util.Scanner;

public class IN252_U2M2 {

	public static void main(String[] args) {

		// initializing scanner for user input
		Scanner scanner = new Scanner(System.in);

		/* Section 1: Sentiment Analysis Comparisons
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * Sentiment analysis determines emotional tone or attitude
		 * outputted by AI in text data via assignment of numerical
		 * scores
		 */ 

		// Indicating section
		System.out.println("\nSection 1: Sentiment Analysis Comparisons");

		// Prompting user to enter two sentiment scores and assigning scanner variable
		System.out.println("Enter first sentiment score (-100 to 100): ");
		int sentiment1 = scanner.nextInt();
		System.out.println("Enter second sentiment score (-100 to 100): ");
		int sentiment2 = scanner.nextInt();

		// Comparing sentiment scores using all logical operators
		if (sentiment1 == sentiment2) {
			System.out.println("Both texts have equal sentiment scores: " + sentiment1);
		}

		if (sentiment1 != sentiment2) {
			System.out.println("Texts have different sentiment scores: " + sentiment1 + " and " + sentiment2);
		}

		if (sentiment1 < sentiment2) {
			System.out.println("Text A is more negative than Text B");
		}

		if (sentiment1 > sentiment2) {
			System.out.println("Text A is more positive than Text B");
		}

		if (sentiment1 <= sentiment2) {
			System.out.println("Text A is not more positive than Text B");
		}

		if (sentiment1 >= sentiment2) {
			System.out.println("Text A is not more negative than Text B");
		}
	}
}
