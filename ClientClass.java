package com.nissan.bean;

import java.util.Scanner;
import com.nissan.bean.CustomerClass;

public class ClientClass {
	public static void main(String[] args) throws BalanceException {
		
		CustomerClass customer = new CustomerClass();
		Scanner scanner = new Scanner(System.in);
		char choice = 'n';
		
		do {
			System.out.println("Hi user, welcome to the ATM");
			System.out.println("1. Withdraw"+"\n"+"2. Show balance"+
					"\n"+"Please enter your choice.."+"\n");
			int option = scanner.nextInt();
			
			// declaring and initialising the variables
			double balance = 5000.0f;
			
			switch(option) {
			
			case 1: System.out.println("Enter the amount to withdraw..");
					double withdrawAmt = scanner.nextDouble();
					balance = customer.withdraw(balance, withdrawAmt);
					break;
			case 2: balance = customer.showBalance(balance);
					break;
			}
			
			System.out.println("Do you want to continue? y or n");
			choice = scanner.next().charAt(0);
			
		}while(choice=='y' || choice=='Y');
	}
}
