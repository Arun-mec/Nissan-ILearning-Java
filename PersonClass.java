package com.nissan.bean;

public class PersonClass {
	// declaring the variables
	
	private String name;
	private int age;
	private double salary;
	
	//default class
	public PersonClass() {}
	
	//parametric class
	public PersonClass(String pName, int pAge, double pSalary) {
		this.name = pName;
		this.age = pAge;
		this.salary = pSalary;
	}
	
	//methods
	public void displayPersonDetails() {
		System.out.println("Name"+"\t"+"Age"+"\t"+"Salary"+"\n"+
							this.name+"\t"+this.age+"\t"+this.salary);
	}

	//tostring
	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
