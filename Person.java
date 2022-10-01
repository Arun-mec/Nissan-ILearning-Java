package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.PersonClass;

public class Person {
	public static void main(String[] args) {

		try {

			// prompt input fromt he user
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the name of the person");
			String name = scanner.nextLine();
			System.out.println("Enter the age of the person");
			int age = scanner.nextInt();
			System.out.println("Enter the salary of the person");
			double salary = scanner.nextDouble();

			//declaration od the class
			PersonClass personOne = new PersonClass(name, age, salary);
			personOne.displayPersonDetails(); // Displaying the output
			
		} catch (Exception ex) {
			System.err.println("Enter valid input!!");
		}
	}
}
