// Code for Unit 1 Assignment

package org.nathan.in252.unit1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.locale;

public class IN252_U1M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring strings outlining student information
		String name = "John Smith";
		String address = "101 N. Main Street";
		String city = "anytown";
		String state = "Texas";
		String zip = "11111";
		String unitsTaken = "19";
		String prevPerformance = "Good";
		
		// Declaring constant variables for price and AI parameters
		final double pricePerUnit = 100.50;
		final double baseDiscount = 150;
		final double aiPerformanceMultiplier = 1.1;
		
		// Converting string unitsTaken to integer
		int intUnitsTaken = Integer.parseInt(unitsTaken);
		
		// Incrementing unitsTaken by 1
		intUnitsTaken++;
		
		// Calculating initial tuition
		double initTuition = pricePerUnit * intUnitsTaken;
		
		// Calculating AI-adjusted discount based on performance
		double aiAdjustedDiscount = baseDiscount;
		
		// If statement increasing discount if performance is good
		if (prevPerformance == "Good") {
			aiAdjustedDiscount *= aiPerformanceMultiplier;
		}
		
		// Calculating final tuition costs
		double afterDiscount = initTuition - aiAdjustedDiscount;
		double monthlyPayment = afterDiscount / 12.0;
		
		// Currency formatting
		NumberFormat currencyFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
		
		// Final printout
		
		
	}

}
