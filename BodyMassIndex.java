package com.nissan.bean;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		double weight = input.nextDouble();
		System.out.println("Enter your height in inches");
		double height = input.nextDouble();
		
		input.close();
		
		//Calculate the BMI
		double bmi = getBmi(height,weight);
		
		//Providing the output
		
		System.out.printf("User BMI: %.2f",bmi);
		System.out.println("\n"+"User BMI Report :"+getBmiReport(bmi));
		
		}

	private static String getBmiReport(double bmi) {
		// TODO Auto-generated method stub
		
		String report ="";
		
		if (bmi<19) {
			report = "Underweight";
		}
		else if((bmi>=19) && (bmi<=24.9)) {
			report = "Normal weight";
		}
		else if((bmi>=25) && (bmi<=29.9)) {
			report = "Over weight";
		}
		else {
			report = "Obese";
		}
		return report;
	}

	// calculating the bmi
	private static double getBmi(double height, double weight) {
		
		return getWeightInPounds(weight)/(getHeightInMeter(height)*getHeightInMeter(height));
	}

	// Converting the height to meter
	private static double getHeightInMeter(double height) {
		// TODO Auto-generated method stub
		
		return height*0.0254;
	}

	// Converting the weight to pounds
	private static double getWeightInPounds(double weight) {
		// TODO Auto-generated method stub
		
		return weight * 0.453359273;
	}

}
