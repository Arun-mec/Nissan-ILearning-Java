package com.nissan.bean;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		// Scanner fpr taking input from user
		Scanner input = new Scanner(System.in);
		
		// Taking inputs from the user
		System.out.println("Enter the number of elements");
		int count = input.nextInt();
		int numberArray[] = new int[count];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<count;i++) {
			numberArray[i] = input.nextInt();
		}
		
		input.close();
		// Display the array elements as the output
		displayArray(numberArray);
		
		}

	private static void displayArray(int[] numberArray) {
		
		//method to display output
		System.out.println("The array :");
		for(int i=0;i<numberArray.length;i++) {
			System.out.println(numberArray[i]);
	}
		
		
	}
}
