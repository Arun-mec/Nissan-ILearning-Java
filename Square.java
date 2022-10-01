package com.nissan.bean;

public class Square extends Shape{
	
	private double side;
	
	//default 
	public Square() {
		super();
	}
	
	//paramterize constructor
	public Square(double side) {
		super();
		this.side = side;
	}
	
	// Custom method
	public double area() {
		return this.side*this.side;
	}
}
