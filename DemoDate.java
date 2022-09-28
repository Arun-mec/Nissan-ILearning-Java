package com.nissan.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDate {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		// Employee name, DeptId, Salary, JoinDate
		System.out.print("Enter the name: ");
		String empName = scanner.nextLine();
		
		System.out.println("Enter Dept Id: ");
		int empId = Integer.parseInt(scanner.next());
		
		System.out.println("Enter your salary: ");
		Double empSalary = Double.parseDouble(scanner.next());
		
		System.out.println("Enter joining date: ");
		
		Date joiningDate = null; // Hungarian Notation
		String joinDate = scanner.next();
		
		joiningDate = dateConversion(joinDate);
		System.out.println(joiningDate);
		
		String joiningDateString = new SimpleDateFormat("dd-mm-yyyy").format(joiningDate);
		
		scanner.close();
	}
	
	private static Date dateConversion(String joinDate) throws ParseException{
		
		//String to date
		Date utilDate = new SimpleDateFormat("dd-mm/yyyy").parse(joinDate);
		
		//Convert to SQL Date
		Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
}
