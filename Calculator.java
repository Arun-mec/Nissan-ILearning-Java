package com.nissan.bean;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int numOne = scanner.nextInt();
		System.out.println("Enter the second number");
		int numTwo = scanner.nextInt();
		
		zeroMap(numOne,numTwo);
		
		scanner.close();
	}

	private static void zeroMap(int numOne, int numTwo) {
		// TODO Auto-generated method stub
		try {
			int result = numOne/numTwo;
			System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Sorry invalid entry of numbers!!");
		}
	}
}
