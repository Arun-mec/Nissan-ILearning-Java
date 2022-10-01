package com.nissan.bean;

public class BankA extends Bank{
	// instance variables
	
		private double amount;
		private double rate = 1.0;
		private double time;
		
		// default constructor
		public BankA() {
			super();
		}
		
		// paramterized constructor
		public BankA(double amount,double time) {
			super();
			this.amount = amount;
		}
		
		// interest function
		public double interest() {
			return this.amount*this.time*this.rate;
		}
}
