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

		/* Section 2: Image Classification Confidence
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * Requesting a confidence value from an AI image classifier
		 * to determine if human review is required to complete
		 * the classification based on a confidence threshold of 70
		 */

		// Indicating section
		System.out.println("\nSection 2: Image Classification Confidence");

		// Requesting input of confidence score and assigning scanner variable
		System.out.println("Enter classification confidence score (0-100): ");
		int confidenceScore = scanner.nextInt();

		// Comparing score to threshold
		if (confidenceScore >= 70) {
			System.out.println("Classification confidence sufficient for automated decision.");
		} else {
			System.out.println("Human review required due to low confidence.");
		}

		/* Section 3: Machine Learning (ML) Model Selection
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * Requesting input from user to select which ML algorithm
		 * to use for analysis
		 */

		// Indicating section
		System.out.println("\nSection 3: Machine Learning (ML) Model Selection");

		// Requesting input from user and assigning scanner variable
		System.out.println("Enter number from 1-12 to select Machine Learning algorithm: ");
		System.out.println("* 1-3 = Supervised Learning\n* 4-6 = Unsupervised Learning\n* 7-9 = Reinforcement Learning\n* 10-12 = Deep Learning");
		int modelSelection = scanner.nextInt();

		// If-ElseIf-Else statement to determine model category
		if (modelSelection >= 1 && modelSelection <= 3) {
			
			// Indicating model category selection
			System.out.println("Category: Supervised Learning");

			// If-ElseIf-Else statement to determine specific model
			if (modelSelection == 1) {
				System.out.println("Algorithm: Linear Regression");
				System.out.println("Use Case: Predictive modeling with continuous output");
			} else if (modelSelection == 2) {
				System.out.println("Algorithm: Random Forest");
				System.out.println("Use Case: Classification with multiple features");
			} else {
				System.out.println("Algorithm: Support Vector Machine");
				System.out.println("Use Case: Binary classification with complex boundaries");
			}

		} else if (modelSelection >= 4 && modelSelection <= 6) {

			// Indicating model category selection
			System.out.println("Category: Unsupervised Learning");

			// If-ElseIf-Else statement to determine specific model
			if (modelSelection == 4) {
				System.out.println("Algorithm: K-Means Clustering");
				System.out.println("Use Case: Customer segmentation");
			} else if (modelSelection == 5) {
				System.out.println("Algorithm: Principal Component Analysis");
				System.out.println("Use Case: Dimensionality reduction");
			} else {
				System.out.println("Algorithm: DBSCAN");
				System.out.println("Use Case: Density-based clustering");
			}

		} else if (modelSelection >= 7 && modelSelection <= 9) {

			// Indicating model category selection
			System.out.println("Category: Reinforcement Learning");

			// If-ElseIf-Else statement to determine specific model
			if (modelSelection == 7) {
				System.out.println("Algorithm: Q-Learning");
				System.out.println("Use Case: Game AI and robotics control");
			} else if (modelSelection == 8) {
				System.out.println("Algorithm: SARSA");
				System.out.println("Use Case: Real-time decision making");
			} else {
				System.out.println("Algorithm: Deep Q Network");
				System.out.println("Use Case: Complex environment interaction");
			}

		} else if (modelSelection >= 10 && modelSelection <= 12) {

			// Indicating model category selection
			System.out.println("Category: Supervised Learning");

			// If-ElseIf-Else statement to determine specific model
			if (modelSelection == 10) {
				System.out.println("Algorithm: Convolutional Neural Network");
				System.out.println("Use Case: Image recognition");
			} else if (modelSelection == 11) {
				System.out.println("Algorithm: Recurrent Neural Network");
				System.out.println("Use Case: Sequential data processing");
			} else {
				System.out.println("Algorithm: Transformer");
				System.out.println("Use Case: Natural language processing");
			}

		} else {

			// Default error code for number entered outside of 1-12
			System.out.println("Error: number value not recognized");

		}
	}
}
