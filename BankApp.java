package com.nissan.app;

import java.util.Scanner;
import com.nissan.bean.Customer;

public class BankApp {
	public static void main(String[] args) {
		
		//Declare variables
		Scanner input = new Scanner(System.in);
		
		//Get input from the customer
		String[] customerNames = new String[20];
		double[] balances = new double[20];
		double[] openingBalance = new double[20];
		
		//Choice 
		char choice = 'n';
		String enterCustomerName = "";
		int counter =0;
		//menu driven
		
		do {
			System.out.println("Enter customer name:");
			enterCustomerName = input.nextLine();
			
			if(Customer.checkCustomerExists(enterCustomerName, customerNames)) {
				System.out.println("Customer already exists!!");
				continue;
			}else {
				customerNames[counter] = enterCustomerName;
			}
			
			System.out.println("Enter the bank balance: ");
			openingBalance[counter] = Double.parseDouble(input.nextLine());
			counter++;
			
			System.out.println("Do you want to continue?");
			choice = input.nextLine().charAt(0);
			
		} while(choice=='y' || choice=='Y');
	}
	
	// 
//	private static boolean checkCustomerExists(String CustomerName, String[] customerNames) {
//		// check coondition
//		for (String customer : customerNames) {
//			if (CustomerName.equals(customer)) {
//				return true;
//			}
//		}
//		return false;
//	}
}
