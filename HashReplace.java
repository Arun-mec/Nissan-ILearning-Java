package com.nissan.bean;

import java.util.Scanner;

//Read and return strign after remove # and its immediate left and right character

public class HashReplace {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Reading input from the user
		System.out.println("Enter the string: ");
		String currentString = scanner.nextLine();
		
		// Replacing the # values
		for(int i=0;i<currentString.length();i++) {
			if (currentString.charAt(i)=='#') {
				System.out.println(currentString.substring(i-1, i+2));
				currentString = currentString.replace(currentString.substring(i-1, i+2),"");
			}
		}	
		
		// Displaying the output
		scanner.close();
		System.out.println(currentString);
	}
}
