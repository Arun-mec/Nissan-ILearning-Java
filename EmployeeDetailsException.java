package com.nissan.bean;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.nissan.bean.AgeException;

public class EmployeeDetailsException {
	public static void main(String[] args) throws Exception {
		
		try {
		// Declaring the variables
		Scanner input = new Scanner(System.in);
		String empName = "";
		int empAge = 0;
		char choice = 'n';
		
		do {
			// Prompt input from the user
			System.out.println("Enter the employee name:");
			empName = input.next();
			System.out.println("Enter the employee age:");
			empAge = input.nextInt();
			
			// checking the age of the user
			if (empAge>60 || empAge<18) {
				throw new AgeException();
			}
			else {
				System.out.println("Do you want to continue?");
				choice = input.next().charAt(0);
			}
		}while (choice=='y' || choice=='Y');
		
		}
		// Catching the age exception
		catch(AgeException e) {
			System.out.println("Message"+e);
		}
		catch(Exception ex) {
			System.out.println("Enter valid age!!");
		}
	}
}
