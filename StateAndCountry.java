package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class StateAndCountry {
	public static void main(String[] args) {
		
		// Declaring the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Prompt input from the user
		System.out.println("Welcome to the quiz app!!");
		System.out.println("Enter your name : ");
		String name = scanner.next();
		
		// Deleration and initialization of the variables
		char choice = 'n';
		String stateName ;
		int mark = 0;
		int attempts = 5;
		
		// Declaration of the array and initialize the country and capital values
		String[][] countries = {{ "Andhra Pradesh", "Hyderabad" }, 
		{ "Arunachal Pradesh", "Itanagar" },
		{ "Assam", "Dispur" }, 
		{ "Bihar", "Patna" }, 
		{ "Chhattisgarh", "Raipur" }, 
		{ "Goa", "Panaji" },
		{ "Gujarat", "Gandhinagar" }, 
		{ "Haryana", "Chandigarh" }, 
		{ "Himachal Pradesh", "Shimla" },
		{ "Jharkhand", "Ranchi" }, 
		{ "Karnataka", "Bangaluru" },
		{ "Kerala", "Trivandrum" },
		{ "Madhya Pradesh", "Bhopal" }, 
		{ "Maharashtra", "Mumbai" }, 
		{ "Manipur", "Imphal" },
		{ "Meghalaya", "Shillong" }, 
		{ "Mizoram", "Aizawl" }, 
		{ "Nagaland", "Kohima" },
		{ "Odisha", "Bhubaneswar" }, 
		{ "Punjab", "Chandigarh" }, 
		{ "Rajasthan", "Jaipur" },
		{ "Sikkim", "Gangtok" }, 
		{ "Tamil Nadu", "Chennai" }, 
		{ "Telangana", "Hyderabad" },
		{ "Tripura", "Agartala" }, 
		{ "Uttar Pradesh", "Lucknow" }, 
		{ "Uttarakhand", "Dehradun" },
		{ "West Bengal", "Kolkata" }};
		
		do {
			
			// Initializing with attempts values
			
			int attempt = 0;
			while(attempt<attempts) {
				
				Random rand = new Random();
				int randomNum = rand.nextInt((19 - 0) + 1);
				System.out.println("Enter the capital of "+countries[randomNum][0]);
				stateName = scanner.next();
				
				//checking the statename
				if (countries[randomNum][1].toUpperCase().equals(stateName.toUpperCase())) {
					mark++;
				}
				
				attempt++;
				}
			System.out.println("Congratulations " +name+" ! you have scored "+ mark +" marks, out of "+ attempts);
			
			// checking for choice
			System.out.println("Do you want to reattempt the game? y or n");
			choice = scanner.next().charAt(0);
			// getting a random country
			
		}while(choice == 'y' || choice =='Y');
		
		// displays the score of the user
	}
}
