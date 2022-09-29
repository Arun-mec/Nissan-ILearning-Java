package com.nissan.bean;

import java.util.Scanner;

public class DemoException {

	public static void main(String[] args) {
		
		try {
			
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			int firstNumber, secondNumber, result;
			System.out.print("Enter a first number");
			firstNumber = input.nextInt();
			
			System.out.print("Enter a second number");
			secondNumber = input.nextInt();
			
			result = firstNumber/secondNumber;
			
			System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Sorry Invalid entry");
		}

	}

}
