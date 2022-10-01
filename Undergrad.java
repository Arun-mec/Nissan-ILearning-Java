package com.nissan.bean;

public class Undergrad extends StudentClass {
	
	
	//default constructor
	public Undergrad() {
		
	}
	public boolean isPassed(double grade) {
		if (grade>70.0) {
			return true;
		}else {
			return false;
		}
	}
	//toString
	
}
