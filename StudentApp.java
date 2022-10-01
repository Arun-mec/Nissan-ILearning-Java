package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Grad;
import com.nissan.bean.StudentClass;
import com.nissan.bean.Undergrad;

public class StudentApp {
	
	public static void main(String[] args) {
		
		// Declaring the scanner and student class
		Scanner scanner = new Scanner(System.in);
		StudentClass studentOne = new StudentClass();
		
		// Prompt from the user
		System.out.println("Enter the student name");
		String name = scanner.next();
		studentOne.set_studentName(name);
		
		System.out.println("Enter the student Id");
		String studId = scanner.next();
		studentOne.set_studentId(studId);
		
		System.out.println("Enter the student grade");
		Double grade = Double.parseDouble(scanner.next());
		studentOne.set_studentGrade(grade);
		
		System.out.println("Enter the age: ");
		int age = Integer.parseInt(scanner.next());
		studentOne.setAge(20);
		
		System.out.println("Enter the address");
		String address = scanner.next();
		studentOne.set_address(address);
		
		// Declaring the undergraduate class
		Undergrad undergradOne = new Undergrad();
		if(undergradOne.isPassed(grade)) {
			System.out.println("Congrats! passed undergraduation");
		}else {
			System.out.println("Sorry! failed Undergraduation");
		}
		
		// Declaring the graduate class
		Grad gradOne = new Grad();
		if(gradOne.isPassed(grade)) {
			System.out.println("Congrats! passed graduation");
		}else {
			System.out.println("Sorry! failed graduation");
		}
	}
	
	
}
