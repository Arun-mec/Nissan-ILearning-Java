package com.nissan.app;

import com.nissan.bean.Rectangle;
import com.nissan.bean.Shape;
import com.nissan.bean.Square;

public class DemoShapeApp {
	
	public static void main(String[] args) {
		
		Shape shapeOne = new Shape();
		
		Square square = new Square(10);
		System.out.println("Area is :"+ square.area());
		
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println("Area is :"+ rectangle.area());
	}
}
