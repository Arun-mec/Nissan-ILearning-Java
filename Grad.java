package com.nissan.bean;

public class Grad extends StudentClass{
	
	//default constructor
	public Grad() {
		
	}
	
	public boolean isPassed(double grade) {
		if (grade>80.0) {
			return true;
		}else {
			return false;
		}
	}
}
