package com.nissan.bean;

import java.util.Scanner;
import com.nissan.bean.BalanceException;

public class CustomerClass {
	
	//Delaring the variables
	String name;
	int accountNumber;
	double balance;
	
	//Constructor function
	public CustomerClass(){
		System.out.println("This is custructor in balance class");
	}
	
	// withdraw function
	public double withdraw(double balance, double withdrawAmt) throws BalanceException {
		
		Scanner input = new Scanner(System.in);
		
		try {
		double minBalance = 2000.0f;
		char choice = 'n';
		
		// checking the condition for the balance amount
		if (withdrawAmt > (balance - minBalance)) {
			throw new BalanceException();
		}else if(withdrawAmt<0) {
			System.out.println("Enter a valid amount.");
		}
		
		// To perform the withdrawel operation
		else {
			balance-=withdrawAmt;
			System.out.println("Do you want to display your balance here?");
			choice = input.next().charAt(0);
			
			// Asking the choice from the customers
			if (choice =='y') {
				showBalance(balance);
			}
			else {
				System.out.println("Thank you for using ATM services");
			}
		}
		
		}
		
		// Exception case
		// To catch the balance exception
		catch(BalanceException ex) {
			System.out.println("Invalid input! Please try again");
		}
		
		// To catch the other exceptions
		catch(Exception ex) {
			System.out.println("Invalid input! Please try again");
		}
		
		return balance;
	}
	public double showBalance(double balance) {
		// Return the balance amount
		System.out.println("The balance amount in your account is: "+balance);
		return balance;
	}
	
}
