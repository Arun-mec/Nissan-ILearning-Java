package com.nissan.bean;

import java.util.Scanner;

public class CompareStrings {

	// To find the largest prefix
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first string: ");
		String firString = input.next();
		System.out.println("Enter the second string: ");
		String secString = input.next();
		
		//Find the length of the smallest string
		int smaller = Math.min(firString.length(), secString.length());
		StringBuilder commonString = new StringBuilder();
		
		//Iteration for length of the smaller string as max loop iteration
		for (int i=0;i<smaller;i++) {
			
			if (firString.charAt(i)==secString.charAt(i)){
				commonString.append(firString.charAt(i));
			}else {
				break;
			}
		}
		//print output
		input.close();	
		
		if (commonString.length() == 0) {
			System.out.println("The first and second string have no common string");
		}else {
			System.out.println("The common prefix is :"+ commonString);
		}
			
		//character to be checked from first to second
		//String builder - is used to append
		
	}

}
