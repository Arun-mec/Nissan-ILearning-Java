package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.CustomerAccountClass;

public class CustomerAccount {
	
	public static void main(String[] args) {
		
		// Declaring the scanner
		Scanner scanner = new Scanner(System.in);
		
		// Defining the class
		CustomerAccountClass customerOne = new CustomerAccountClass(12234,"Arun",12,"Calicut","Savings");
		CustomerAccountClass customerTwo = new CustomerAccountClass(12223,"Aman",12,"Tvm","Fixed");
		CustomerAccountClass customerThree = new CustomerAccountClass(12211,"Aswin",12,"Kochi","Savings");
		CustomerAccountClass customerFour = new CustomerAccountClass(12234,"Ameen",12,"Kochi","Savings");
		CustomerAccountClass customerFive = new CustomerAccountClass(12234,"Ameen",12,"Tvm","Savings");
		
		// Calling the functions
		customerOne.displayTitles();
		customerOne.displayDetails();
		customerTwo.displayDetails();
		customerThree.displayDetails();
		customerFour.displayDetails();
		customerFive.displayDetails();
	}
}	
