package com.nissan.bean;

public class Bank {
	
	// instance variables
	private double amount;
	private double rate = 2.0;
	private double time;
	
	// default constructor
	public double interest() {
		return this.amount*this.time*this.rate;
	}
	// Default constructor
	public Bank() {
		super();
	}
	
	// parameterized constructor
	public Bank(double amount, double time) {
		super();
		this.amount = amount;
		this.time = time;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	// getter and setter
	
	
}
