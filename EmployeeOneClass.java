package com.nissan.bean;

public class EmployeeOneClass implements Comparable<EmployeeOneClass>{
	
	// instance variables
	private int _empCode;
	private String _empName;
	private String _empDesg;
	private double _empSalary;
	private boolean _salary;
	
	// default constructor
	public EmployeeOneClass() {
		
	}
	
	// paramaterised constructor 1
	public EmployeeOneClass(int eCode, String eName, String eDesg) {
		this._empCode = eCode;
		this._empName = eName;
		this._empDesg = eDesg;
		
		// Check the condition for salary
		if (this._empDesg.equals("Clerk")) {
			this._empSalary = 5000.0f;
		}else if (this._empDesg.equals("Peon")) {
			this._empSalary = 2000.0f;
		}else if (this._empDesg.equals("Manager")) {
			this._empSalary = 10000.0f;
		}else {
			this._empSalary = 1000.0f;
		}
	}
	
	// paramaterised constructor 2
	public EmployeeOneClass(int eCode, String eName, String eDesg, double eSalary) {
		this._empCode = eCode;
		this._empName = eName;
		this._empDesg = eDesg;
		this._empSalary = eSalary;
	}
	
	// methods
	public void displayDetails() {
		System.out.println("User details");
		System.out.println("Employee code"+"\t"+"Employee Name"+"\t"+
							"Designation "+"\t"+"Salary"+"\n"+this._empCode+"\t"+"\t"
							+this._empName+"\t"+"\t"+this._empDesg+"\t"+"\t"+this._empSalary);
	}
	// overriding to string

	@Override
	public String toString() {
		return "EmployeeOneClass [_empCode=" + _empCode + ", _empName=" + _empName + ", _empDesg=" + _empDesg
				+ ", _empSalary=" + _empSalary + "]";
	}

	@Override
	public int compareTo(EmployeeOneClass o) {
		// TODO Auto-generated method stub
		this._empSalary = o._empSalary;
		if (this._empSalary == o._empSalary) {
			return 0;
		}
		else if(this._empSalary < o._empSalary){
			return 1;
		}else {
			return -1;
		}
	}
	
}
