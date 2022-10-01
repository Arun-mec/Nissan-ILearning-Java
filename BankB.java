package com.nissan.bean;

public class BankB extends Bank{
	
	// instance variables
		private double amount;
		private double rate = 0.09;
		private double time;
		
		// default constructor
		public BankB() {
			super();
		}
		
		public BankB(double amount, double time) {
			super();
			this.amount = amount;
			this.time = time;
		}
		
		public double interest() {
			return this.time*this.amount*this.rate;
		}
}
