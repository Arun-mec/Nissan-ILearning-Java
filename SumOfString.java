package com.nissan.bean;

import java.util.Scanner;

// Calculate the sum of digits in a string

public class SumOfString {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Prompt input from user
		System.out.println("Enter the number:");
		String numberString = input.nextLine();
		
		//conversion of string to number
		int number = Integer.parseInt(numberString);
		
		//Getting the sum of the digits
		int sumOfDigits = 0;
		for(int i=number;i>0;i/=10) {
			sumOfDigits+=(i%10);
		}
		
		// Output the result
		System.out.println(sumOfDigits);
		
		input.close();
	}
}
