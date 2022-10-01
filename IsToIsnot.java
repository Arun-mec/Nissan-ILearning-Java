package com.nissan.bean;

import java.util.Scanner;

//Replace every is with is not in a string

public class IsToIsnot {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Taking input from the user
		System.out.println("Enter the string output: ");
		String currentString = input.nextLine();
		
		// Replacing words
		String nwString= currentString.replace("is","is not");
		System.out.println(nwString);
		
		input.close();
	}

}
