package com.nissan.bean;

public class BoxClass {
	
	 // instance variables
	private double width;
	private double height;
	private double depth;
	
	// default constructor
	public BoxClass() {
		super();
	}
	
	// paramterized constructor
	public BoxClass(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//methods
	public double Volume() {
		return this.width*this.height*this.depth;
	}
	
}
