package com.nissan.app;

import java.util.ArrayList;
import java.util.Collections;

import com.nissan.bean.EmployeeOneClass;

public class DemoGenericType {

	public static void main(String[] args) {
		
		ArrayList<EmployeeOneClass> employeeList = new ArrayList<EmployeeOneClass>();
		
		EmployeeOneClass firstEmp = new EmployeeOneClass(1001,"Sanjay","Manager");
		EmployeeOneClass secEmp = new EmployeeOneClass(1002,"Suresh","Software Engineer");
		EmployeeOneClass thirdEmp = new EmployeeOneClass(1001,"Madhu","Programmer");
		
		employeeList.add(firstEmp);
		employeeList.add(secEmp);
		employeeList.add(thirdEmp);
		
		
		for (EmployeeOneClass employee : employeeList) {
			System.out.println();
		}
		
		// comparable compareTo()
		
		
		
//		// Generic collection
//		ArrayList<String> cities = new ArrayList<String>();
//		cities.add("Banglore");
//		cities.add("Hyderabad");
//		cities.add("Ahmer");
//		cities.add(null);
//
//		// Print the list
//		System.out.println(cities.get(1));
//		System.out.println(cities.get(2));
//
//		System.out.println("Method 1");
//		for(int i=0;i<cities.size();i++) {
//			System.out.println(cities.get(i));
//		}
//		
//		cities.remove(2);
//		System.out.println("Method 2");
//		// Iterating through the arraylist
//		for (String city : cities) {
//			System.out.println(city);
//		}
		
	}

}
