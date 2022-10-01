package com.nissan.app;

import java.util.Scanner;
import com.nissan.bean.BankClass;

public class NewBankApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String typeAccount="";
		
		System.out.println("Enter principle amount");
		int principle = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter time");
		int time = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the type of account..?");
		System.out.println("1.Savings\n2.Fixed");
		int typeInt = Integer.parseInt(input.nextLine());
		
		//condition
		if (typeInt==1) {
			typeAccount="Savings";
		}else if (typeInt==2){
			typeAccount="Fixed";
		}else {
			typeAccount="Invalid";
		}
		
		BankClass bank = new BankClass();
		bank.set_principle(principle);
		bank.set_time(time);
		bank.set_typeOfAccount(typeAccount);
		
		System.out.println("Interest rate: "+bank.calculateInterest());
		System.out.println(bank.toString());
	}
	
}
