package com.nissan.bean;

public class InvalidValueException extends Exception {
	
	public InvalidValueException() {
		System.out.println("My own exception");
	}
	 // without parameter -> Default constructor
	// With parameter -> Paramaterized constructor
}
