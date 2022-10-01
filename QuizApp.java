package com.nissan.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
		
		
		Map<String,String> statesAndCapitals = getStatesAndCapitals();
		// Declaring the scanner variable
		Scanner scanner = new Scanner(System.in);
		
//				{ "Meghalaya", "Shillong" }, 
//				{ "Mizoram", "Aizawl" }, 
//				{ "Nagaland", "Kohima" },
//				{ "Odisha", "Bhubaneswar" }, 
//				{ "Punjab", "Chandigarh" }, 
//				{ "Rajasthan", "Jaipur" },
//				{ "Sikkim", "Gangtok" }, 
//				{ "Tamil Nadu", "Chennai" }, 
//				{ "Telangana", "Hyderabad" },
//				{ "Tripura", "Agartala" }, 
//				{ "Uttar Pradesh", "Lucknow" }, 
//				{ "Uttarakhand", "Dehradun" },
//				{ "West Bengal", "Kolkata" }};
		
		System.out.println("Welcome to quiz app");
		System.out.println("Enter the state:");
		String state = scanner.nextLine().toLowerCase();
		
		if (statesAndCapitals.containsKey(state)) {
			System.err.println(statesAndCapitals.get(state));
		}else {
			System.out.println("Invalid state name");
		}
		// DEfining the hashmap
		// use database her eto retureive the documes
			
		
	}

	private static Map<String, String> getStatesAndCapitals() {
		HashMap<String,String> statesCapitals = new HashMap<String,String>();
		
		statesCapitals.put("Andhra Pradesh", "Hyderabad");
		statesCapitals.put("Arunachal Pradesh", "Itanagar" );
		statesCapitals.put("Assam", "Dispur");
		statesCapitals.put("Bihar", "Patna");
		statesCapitals.put( "Chhattisgarh", "Raipur");
		statesCapitals.put("Goa", "Panaji");
		statesCapitals.put("Gujarat", "Gandhinagar");
		statesCapitals.put("Haryana", "Chandigarh");
		statesCapitals.put( "Himachal Pradesh", "Shimla");
		statesCapitals.put("Jharkhand", "Ranchi" );
		statesCapitals.put( "Karnataka", "Bangaluru");
		statesCapitals.put("kerala", "trivandrum" );
		statesCapitals.put("Madhya Pradesh", "Bhopal");
		statesCapitals.put("Maharashtra", "Mumbai");
		statesCapitals.put("Manipur", "Imphal");
		
		return null;
	}

}
