package com.nissan.bean;

public class BankC extends Bank{
	
	// instance variables
	private double rate = 0.07;
	
	// default constructor
	public BankC() {
		super();
	}
	
	public BankC(double rate) {
		super();
		this.rate = rate;
	}
	
	public double interest() {
		return super.getAmount()*super.getTime()*this.rate;
	}

}
