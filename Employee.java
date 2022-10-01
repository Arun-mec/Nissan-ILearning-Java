package com.nissan.app;

public class Employee {
	
	//member variables
	private int empId;
	private String empName;
	
	//static variable
	static String officeName;
	
	// default constructor --> No arguement, always public
	public Employee() {
		System.out.println("Displaying default constructor");
	}
	// With argument -> Parameterised
	public Employee(int empId, String empName) {
		this.empId = empId; // this operator helps to identify the datamembers in a class
		this.empName = empName;
	}
	
	// With argument -> Parameterised
	public Employee(String Name) {
		this.empName = Name;
	}
	
	//member (or) method function
	public void displayReport() {
		System.out.println("First name :"+this.empName);
		System.out.println("Emp Id :"+this.empId);
	}
	
	// override toString


	
}
