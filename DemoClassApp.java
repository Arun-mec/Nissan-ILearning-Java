package com.nissan.bean;

import com.nissan.app.Employee;

public class DemoClassApp {
	 public static void main(String[] args) {
		
		 Employee firEmployee = new Employee(1011,"Madhu"); //Instantiation
		 firEmployee.displayReport(); // 
		 Employee secEmployee = new Employee(1002,"Keran"); //Instantiation
		 secEmployee.displayReport(); // 
		 
		 System.out.println(firEmployee.toString());

	}
}
