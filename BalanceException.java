package com.nissan.bean;

public class BalanceException extends Exception{
	public BalanceException() {
		System.out.println("Your balance is invalid! Please have a balance above 5000!");
	}
}
