package com.nissan.bean;

public class AgeException extends Exception{
	public AgeException() {
		System.out.println("Age should be in between 18 and 60");
	}
}
