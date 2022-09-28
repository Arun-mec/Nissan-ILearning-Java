package com.nissan.bean;

import java.util.Scanner;

//write a program

public class HeighestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		System.out.println("The best student is :"+ getTheBestStudent());
		
	}

	private static String getTheBestStudent() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Taking the no of students input
		System.out.println("Enter the number of students:");
		int num = input.nextInt();
		
		// Setting up the declarations
		
		double largeScore = 0;
		double score = 0;
		String bestStudent = "";
		String name = "";
		
		//Looping inside the data
		int count=0;
		while(count<num) {
			System.out.println("Enter student name:");
			name = input.next();
			System.out.println("Enter student score:");
			score = input.nextDouble();
			
			if (score>largeScore) {
				bestStudent = name;
				largeScore = score;
			}
			
			count++;
		}
		
		return bestStudent;
		
	}

}
