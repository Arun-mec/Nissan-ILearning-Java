package com.nissan.bean;

import java.util.Scanner;
import com.nissan.bean.BalanceException;

public class CustomerClass {
	String name;
	int accountNumber;
	double balance;
	
	public CustomerClass(){
		System.out.println("This is custructor in balance class");
	}
	
	public double withdraw(double balance, double withdrawAmt) throws BalanceException {
		
		Scanner input = new Scanner(System.in);
		
		double minBalance = 2000.0f;
		char choice = 'n';
		
		if (withdrawAmt > (balance - minBalance)) {
			throw new BalanceException();
		}else if(withdrawAmt<0) {
			System.out.println("Enter a valid amount.");
		}
		
		// To perform the wothdrawel operation
		else {
			balance-=withdrawAmt;
			System.out.println("Do you want to display your balance here?");
			choice = input.next().charAt(0);
			
			if (choice =='y') {
				showBalance(balance);
			}
			else {
				System.out.println("Thank you for using ATM services");
			}
		}
		
		return balance;
	}
	public double showBalance(double balance) {
			
		System.out.println("The balance amount in your account is: "+balance);
		return balance;
	}
	
}
