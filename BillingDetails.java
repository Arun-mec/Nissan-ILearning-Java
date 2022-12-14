package com.nissan.bean;

import java.util.Scanner;

public class BillingDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring the variables
		char choice = 'n';
		int entry = 0;
		
		Scanner input = new Scanner(System.in);

		// Menu driven program
		do {

			// getting user details
			System.out.println("Enter the country name:");
			String countryName = input.next();
			String countryLanguage = getLanguage(countryName);
			System.out.println("Enter the customer ID:");
			int customerId = input.nextInt();
			System.out.println("Enter the billing date:");
			String billingDate = input.next();
			System.out.println("Enter the amount outstanding:");
			double outStandingAmt = input.nextDouble();
			
			// Display details based on user input
			displayBillingDetails(countryName, countryLanguage, customerId, billingDate, outStandingAmt);
			entry++;
			
			// Menu driven program
			System.out.println("Do you want to add another data? y or n");
			choice = input.next().charAt(0);

			input.close();
			
			// Taking the choice from the customer
			if (choice == 'n' || entry == 5) {
				getExitNote(choice, entry);
			}
			

		} while (entry<5 && choice=='y');

	}

	private static void displayBillingDetails(String countryName, String countryLanguage, int customerId, String date,
			double amount) {
		
		// TODO Auto-generated method stub
		System.out.println("Country Name" + "\t" + "Language" + "\t" + "CustomerId" + "\t" + "Billing Date" + "\t"
				+ "Amount Outstanding");
		System.out.println(countryName + "\t" + "\t"+ countryLanguage + "\t"+"\t" + customerId + "\t"+ "\t" + date + "\t" + amount);
	}

	private static void getExitNote(char choice, int entry) {
		// TODO Auto-generated method stub

		// Checking the limit
		if (entry == 5) {
			System.out.println("Maximum limit has been reached!");
		}
		System.out.println("Thank you for using me :)");
	}

	private static String getLanguage(String countryName) {
		// TODO Auto-generated method stub

		String language = "";

		// Checking the input countries
		switch (countryName.toUpperCase()) {
		case "INDIA":
			language = "Hindi";
			break;
		case "USA":
			language = "English";
			break;
		case "PAKISTAN":
			language = "Hindi";
			break;
		case "JAPAN":
			language = "Japanese";
			break;
		case "ITALY":
			language = "Italian";
			break;
		case "GERMANY":
			language = "Germen";
			break;
		default:
			language = "English";
			break;
		}
		return language;
	}

}
