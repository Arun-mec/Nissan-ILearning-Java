package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Bank;
import com.nissan.bean.BankA;
import com.nissan.bean.BankB;
import com.nissan.bean.BankC;

public class BankAppOne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		System.out.println("Enter your amount: ");
		double amount = Double.parseDouble(scanner.next());
		
		System.out.println("Enter your time: ");
		double time = Double.parseDouble(scanner.next());
		
		Bank bank = new Bank(amount, time);
		
		System.out.println("Enter your bank.\n1. Bank A\n2. Bank B\n3. Bank C");
		int choice = Integer.parseInt(scanner.next());
		
		switch(choice) {
			case 1:	Bank bankOne = new BankA(amount, time);
					System.out.println("The interest amount is: "+bankOne.interest());
					break;
			case 2: Bank bankTwo = new BankB(amount, time);
					System.out.println("The interest amount is: "+bankTwo.interest());
					break;
			case 3: Bank bankThree = new BankC();
			
			//bankThree.setAmount(1000);
			
					System.out.println("The interest amount is: "+bankThree.interest());
					break;
			default:
				System.out.println("Calling default");
				bank.interest();
		
		}
		
	}
	
}
