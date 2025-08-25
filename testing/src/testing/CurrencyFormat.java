// Testing out importing and creating a currency format

package testing;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {

	public static void main(String[] args) {

		// Creating a currency format
		NumberFormat currencyFormatUS = NumberFormat.getCurrencyInstance(Locale.US);

		// Declaring doubles
		double amount = 1234.567;

		// Formatting amount and printing results
		String formattedAmountUS = currencyFormatUS.format(amount);
		System.out.println("Formatted (US Locale): " + formattedAmountUS);

	}

}
