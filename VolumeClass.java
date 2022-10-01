package com.nissan.bean;

public class VolumeClass {
	private double _width;
	private double _height;
	private double _depth;
	
	public VolumeClass() {}
	
	public VolumeClass(double width, double height, double depth) {
		this._width = width;
		this._height = height;
		this._depth = depth;
	}
	
	public void getVolume() {
		System.out.println("The volume of the box is :"+(this._width*this._height*this._depth)+" m3");
	}
	
	
}
