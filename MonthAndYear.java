package com.nissan.bean;

import java.util.Scanner;

public class MonthAndYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring the scanner
		Scanner input = new Scanner(System.in);

		// Declaring the choice
		char choice = 'n';

		do {
			System.out.println("Enter the month:");
			int month = input.nextInt();
			System.out.println("Enter the year:");
			int year = input.nextInt();
			
			// declaring and initializing variables
			int days = 0;
			String monthName = "";


			switch (month) {
			case 1:
				monthName = "January";
				days = 31;
				displayDays(days, monthName);
				break;
			case 2:
				monthName = "February";
				days = ((isLeapYear(year)) ? 29 : 28);
				displayDays(days, monthName);
				break;
			case 3:
				monthName = "March";
				days = 31;
				displayDays(days, monthName);
				break;
			case 4:
				monthName = "April";
				days = 30;
				displayDays(days, monthName);
				break;
			case 5:
				monthName = "May";
				days = 31;
				displayDays(days, monthName);
				break;
			case 6:
				monthName = "June";
				days = 30;
				displayDays(days, monthName);
				break;
			case 7:
				monthName = "July";
				days = 31;
				displayDays(days, monthName);
				break;
			case 8:
				monthName = "August";
				days = 31;
				displayDays(days, monthName);
				break;
			case 9:
				monthName = "September";
				days = 30;
				displayDays(days, monthName);
				break;
			case 10:
				monthName = "October";
				days = 31;
				displayDays(days, monthName);
				break;
			case 11:
				monthName = "November";
				days = 30;
				displayDays(days, monthName);
				break;
			case 12:
				monthName = "December";
				days = 31;
				displayDays(days, monthName);
				break;

			default:
				System.out.println("Invalid month selection");
				break;
			}

			System.out.println("Do you want to continue..? y or n");
			choice = input.next().charAt(0);
		} while (choice == 'y' || choice=='Y');
		System.exit(0);
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		
		// checking for leap year
		if ((year%4==0 && year%100==0) || (year%4==0))
			return true;
		else
			return false;
	}

	private static void displayDays(int days, String monthName) {
		// TODO Auto-generated method stub
		
		// Displaying the output
		System.out.println("The " + monthName + " has " + days);

	}

}
