package com.nissan.bean;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeId {
	public static void main(String[] args) {
		
		
		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the employee Id");
		int empId = scanner.nextInt();
		}
		catch(Exception ex) {
			System.out.println("Provide a valid input");
		}
}
}
