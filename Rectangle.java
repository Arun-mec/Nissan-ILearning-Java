package com.nissan.bean;

public class Rectangle extends Shape{
	
	private double length, breadth;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return this.length*this.breadth;
	}
	
	
}
