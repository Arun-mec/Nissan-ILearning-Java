package com.nissan.bean;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
		int[] marks = new int[10];
		
		// Taking 10 inputs from the user
		System.out.println("Enter the marks of 10 students");
		for(int i=0;i<11;i++) {
			marks[i] = scanner.nextInt();
		}
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of range!");
		}
		finally {
			System.out.println("Thank you for entering 10 elements!");
		}
	}
}
