package com.nissan.app;

import java.util.ArrayList;

public class DemoNonGenericApp {
	public static void main(String[] args) {
		
		// Non generic collection
		// Not typesafe
		ArrayList  cities = new ArrayList<>();
		cities.add("Banglore");
		cities.add("Hyderabad");
		cities.add(12345);
		cities.add(false);
		cities.add("Ahmer");
		cities.add('c');
		cities.add(null);
		
		// Print the list
		System.out.println(cities.get(1));
		System.out.println(cities.get(2));
		
		// Iterating through the arraylist
		for (Object city : cities) {
			System.out.println(city);
		}
	}
}
