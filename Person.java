package com.nissan.bean;

import java.util.Scanner;

public class Person {
	
	// Instance variables
	private String name;
	private int age;
	
	// Default function
	public Person() {
		super();
	}

	// Paramterized function
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void readData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name : ");
		this.name = input.nextLine();
		
		System.out.println("Enter age : ");
		this.age = Integer.parseInt(input.nextLine());
	
	}
	public void displayData() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
