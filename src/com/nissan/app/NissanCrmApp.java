package com.nissan.app;

import java.util.Scanner;

import com.nissan.doe.CourseDao;

public class NissanCrmApp {
	
	public static void main(String[] args) {
		
//		Entry point
		mainMenu();
	}

	public static void mainMenu() {
		// TODO Auto-generated method stub
		//input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("-------  Course Management  ------ ");
		System.out.println("1. Course Master\n2. Course Enquiry\n3. Report Generator\n4. Exit\n"
				+ "Enter your choice");
		
		switch(Integer.parseInt(scanner.next())) {
		case 1: 
			// go to add course
			//menu
			break;
		case 2: 
			CourseDao.menu();
			// enquiry
			break;
		case 3: 
			// report gen
			// list all courses
			break;
		case 4: 
			System.out.println("Thank your for using!");
			System.exit(0);
			// go to modify course
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}
}
