package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.EmployeeOneClass;

public class EmpDetails {
	public static void main(String[] args) {
		
		// Scanner decleration
		Scanner scanner = new Scanner(System.in);
		Scanner intScanner = new Scanner(System.in);
		
		EmployeeOneClass[] employee = new EmployeeOneClass[5];
		
		//menu driven
		char choice = 'n';
		int i=0;
		
		do {
			System.out.println("Enter the employee id");
			int empCode = intScanner.nextInt();
			
			System.out.println("Enter the employee name");
			String empName = scanner.nextLine();
			
			System.out.println("Enter the designation");
			String empDesg = scanner.nextLine();
			
			System.out.println("Enter the Salary");
			String empSalary = scanner.nextLine();
			
			if(empSalary.equals("")) {
				employee[i] = new EmployeeOneClass(empCode, empName,empDesg);
			}else {
				employee[i] = new EmployeeOneClass(empCode, empName,empDesg, Double.parseDouble(empSalary));
			}
			
			System.out.println("Do you want to add more..?");
			choice = scanner.next().charAt(0);
			i++;
			
		}while(choice=='y' || choice=='Y');
		
		for(int j=0;j<i;j++) {
			employee[j].displayDetails();
			System.out.println();
		}
	}
}
