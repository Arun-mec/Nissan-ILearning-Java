package com.nissan.bean;

public class Customer {
	
	//check customer exists
	public static boolean checkCustomerExists(String CustomerName, String[] customerNames) {
		// check coondition
		for (String customer : customerNames) {
			if (customerNames.equals(customer)) {
				return true;
			}
		}
		return false;
	}
}
