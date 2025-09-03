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

		System.out.println("\nResults: ");

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
			System.out.println("\nClassification confidence sufficient for automated decision.");
		} else {
			System.out.println("\nHuman review required due to low confidence.");
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
			System.out.println("\nCategory: Supervised Learning");

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
			System.out.println("\nCategory: Unsupervised Learning");

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
			System.out.println("\nCategory: Reinforcement Learning");

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
			System.out.println("\nCategory: Supervised Learning");

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
			System.out.println("\nError: number value not recognized");

		}

		/* Section 4: Neural Network Layer Types
		 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		 * Requesting input from user to get information
		 * about various neural network layers
		 */

		// Indicating section
		System.out.println("\nSection 4: Neural Network Layer Types");

		// Requesting input from user and assigning scanner variable
		System.out.println("Enter number between 1-7 to select Neural Network layer: ");
		System.out.println("* 1 = Input\n* 2 = Convolutional\n* 3 = Pooling\n* 4 = Dense\n* 5 = Dropout\n* 6 = Activation\n* 7 = Output");
		int layerSelection = scanner.nextInt();

		// Switch statement outputting information based on user choice
		switch (layerSelection) {
			case 1:
				System.out.println("\nLayer Type: Input Layer");
				System.out.println("Purpose: Receives and standardizes initial data");
				System.out.println("Characteristics: Matches input data dimensions");
				break;
			case 2:
				System.out.println("\nLayer Type: Convolutional Layer");
				System.out.println("Purpose: Feature extraction in image processing");
				System.out.println("Characteristics: Uses sliding window features");
				break;
			case 3:
				System.out.println("\nLayer Type: Pooling Layer");
				System.out.println("Purpose: Dimensionality reduction");
				System.out.println("Characteristics: Reduces spatial size, preserves features");
				break;
			case 4:
				System.out.println("\nLayer Type: Dense Layer");
				System.out.println("Purpose: Complex pattern recognition");
				System.out.println("Characteristics: Full conncetion between neurons");
				break;
			case 5:
				System.out.println("\nLayer Type: Dropout Layer");
				System.out.println("Purpose: Prevents overfitting");
				System.out.println("Characteristics: Randomly deactivates neurons");
				break;
			case 6:
				System.out.println("\nLayer Type: Activation Layer");
				System.out.println("Purpose: Introduces non-linearity");
				System.out.println("Characteristics: Applies activation function");
				break;
			case 7:
				System.out.println("\nLayer Type: Output layer");
				System.out.println("Purpose: Produces final predictions");
				System.out.println("Characteristics: Matches required output format");
				break;
			default:
				System.out.println("\nInvalid number input");
		}

	}
}
