package com.nissan.bean;

import java.util.Scanner;

public class AtmDemo {
	public static void main(String[] args) {
		
		// Declaring the scanner 
		Scanner input = new Scanner(System.in);
		
		// Taking the option from the user
		char option = 'n';
		double balance = 5000.0f;
		int choice = 0;
		int atmPin = 0;
		int entry = 0;
		boolean checkPin = false; // To check the pin entered by the user and attempts
		
		// Prompt the user to enter the variables.
		System.out.println("Hi user, Welcome to ATM");
		System.out.println("Please enter your pin to continue..");
		
		while(entry<3) {
			
			// Getting the atm pin inout from the user.
			atmPin = input.nextInt();
			if (checkAtmPin(atmPin)) {
				checkPin = true;
				break;
			}else {
				System.err.println("Please re-enter your pin..");
			}
			entry++;
		}
		// declaring the variables
		//Getting the choice
		
		if (checkPin) {
			
		do {
			
		// Enter the pin
			
		System.out.println("1. Deposit"+"\n"+"2. Withdraw"+"\n"+"3. Show balance"+"\n"+"4. Exit"+
							"\n"+"Please enter your choice.."+"\n");
		choice = input.nextInt();
		
		//Menu driven
		switch(choice) {
		case 1: System.out.println("Enter the amount to deposit");
				double depositAmt = input.nextDouble();
				balance = depositAmount(balance, depositAmt);
				break;
				
		case 2: System.out.println("Enter the amount to withdraw");
				double withdrawAmt = input.nextDouble();
				balance = withdrawAmount(balance,withdrawAmt);
				break;
				
		case 3: showBalance(balance);
				break;
		case 4: System.out.println("Thank you for using the ATM services!");
				break;
		default:System.out.println("Invalid selection, please make valid selections.");
			} 
		
		// Getting a option from the user
		System.out.println("\n"+"Do you want to continue..? y or n");
		option = input.next().charAt(0);
		
		}while(option=='y' || option=='Y');
		
		
		}else {
			// TO
			System.out.println("Sorry, can't continue with this transaction.");
		}
	}

	private static boolean checkAtmPin(int atmPin) {
		// TODO Auto-generated method stub
		
		// To check the atm pin enterted by the user
		int[] pinArray = {1233,2737};
		for(int i=0;i<=pinArray.length;i++) {
			if (pinArray[i]==atmPin) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	private static void showBalance(double balance) {
		// TODO Auto-generated method stub
		
		// Getting the balance of the user
		if (balance == 0) {
			System.out.println("Balance : 0");
		}else if(balance<5000) {
			System.out.printf("Ledger balance : %.2f",balance);
			System.out.printf("\n"+"Available balance : 0");
		}
		else {
			System.out.printf("Ledger balance : %.2f",balance);
			System.out.printf("\n"+"Available balance : %.2f",(balance-5000));
		}
		
	}

	private static double withdrawAmount(double balance, double withdrawAmt) {
		// TODO Auto-generated method stub
		double minBalance = 5000.0f;
		char choice = 'y';
		
		// declaring the scanner
		Scanner withdrawInput = new Scanner(System.in);
		
		// Checking the active balance of the user
		if (withdrawAmt > (balance - minBalance)) {
			System.out.println("Insufficient balance!");
		}else if(withdrawAmt<0) {
			System.out.println("Enter a valid amount.");
		}
		
		// To perform the wothdrawel operation
		else {
			balance-=withdrawAmt;
			System.out.println("Do you want to display your balance here?");
			choice = withdrawInput.next().charAt(0);
			
			if (choice =='y') {
				showBalance(balance);
			}
			else {
				System.out.println("Thank you for using ATM services");
			}
		}
		return balance;
	}

	private static double depositAmount(double balance, double depositAmt) {
		// TODO Auto-generated method stub
		
		char choice = 'n';
		Scanner depoInput = new Scanner(System.in);
		
		if(depositAmt<0) {
			System.out.println("Please enter a valid amount.");
		}
		else {
			balance+=depositAmt;
			System.out.println("Congrats, your money has been deposited.");
			System.out.println("Do you want to display your balance here?");
			choice = depoInput.next().charAt(0);
			if (choice =='y') {
				showBalance(balance);
			}
			else {
				System.out.println("Thank you for using ATM services");
			}
		}
				
		
		return balance;
		
	}

	
}
