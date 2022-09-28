package com.nissan.bean;

import java.util.Scanner;

public class PoundToKg {
	
	//Pound to Kg
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number in Pounds: ");
		
		//store the values
		double pounds = input.nextDouble();
	
		double kilograms = poundsToKilograms(pounds);
		System.out.println("The"+pounds+"in kilograms %.2f"+kilograms);
	}

	private static double poundsToKilograms(double pounds) {
		// TODO Auto-generated method stub
		
		return pounds*0.456;
	}
}
