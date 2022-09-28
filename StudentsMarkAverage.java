package com.nissan.bean;

import java.util.Scanner;

// Enter the mark of 10stduents and find the average

public class StudentsMarkAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int students[] = new int[10];

		// Taking student details from user
		System.out.println("Enter the student details");
		for (int i = 0; i < 10; i++) {
			students[i] = scanner.nextInt();
		}

		// Returning the average of students
		System.out.println("The average of 10 students is : " + studentsAverage(students));
	}

	private static float studentsAverage(int[] students) {

		// Finding sum and average of the mark of students
		int sumOfMarks = 0;
		
		for (int i = 0; i < 10; i++) {
			sumOfMarks += students[i];
		}

		// returning average
		return sumOfMarks / students.length;
	}
}
