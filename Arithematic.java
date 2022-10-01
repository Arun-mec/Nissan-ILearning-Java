package com.nissan.app;

import java.util.Scanner;

public class Arithematic {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// declaring and taking the inputs
		System.out.println("Enter the first number");
		int num1 = Integer.parseInt(scanner.next());
		
		System.out.println("Enter the second number");
		int num2 = Integer.parseInt(scanner.next());
		
		System.out.println("Enter the third number");
		double num3 = Double.parseDouble(scanner.next());
		
		System.out.println("Enter the forth number");
		double num4 = Double.parseDouble(scanner.next());
			
		// output the result
		System.out.println("The sum of the numbers in first method:"+getSum(num1,num2));
		System.out.println("The sum of the numbers in second method:"+getSum(num3,num4));
	}

	// function with float type variables and int type output
	private static int getSum(double d, double e) {
		// TODO Auto-generated method stub
		int sum = (int) (d+e);
		return sum;
	}
	
	// function with int type variables and double type output
	private static double getSum(int d, int e) {
		// TODO Auto-generated method stub
		double sum = (double) (d+e);
		return sum;
	}
}
