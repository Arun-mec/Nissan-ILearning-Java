package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class StateAndCountry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char choice = 'n';
		String stateName ;
		int mark = 0;
		
		// Declaration of countries
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
			
			// getting a random country
			Random rand = new Random();
			int randomNum = rand.nextInt((19 - 0) + 1);
			System.out.println(countries[randomNum][0]);
			stateName = scanner.next();
			
			//checking the statename
			if (countries[randomNum][1].toUpperCase().equals(stateName.toUpperCase())) {
				mark++;
			}
			
			// checking for choice
			System.out.println("Do you want to continue the game? y or n");
			choice = scanner.next().charAt(0);
		
		}while(choice == 'y' || choice =='Y');
		
		System.out.println("Congratulations! you have scored "+mark+ " marks");
	}
}
