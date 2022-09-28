package com.nissan.bean;

import java.util.Scanner;

public class SolnAreaCircle {
	
	//Entry point
	public static void main(String[] args) {
		
		// Test my program
		
		// Getting input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = input.nextDouble(); 
		
		input.close();
		//output the value
		System.out.println("The radius is: "+radius);
		System.out.println(String.format("The circumference is: %.2f",circumferenceCircle(radius)));
		System.out.println(String.format("The area is: "+areaCircle(radius)));
	}
	
	// Calculation method for area
	private static double areaCircle(double radius) {
		
		return radius * radius * Math.PI;
	}

	// Calculation method for circumferences
	private static double circumferenceCircle(double radius) {
		
		return 2 * radius * Math.PI;
	}
}
