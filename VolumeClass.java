package com.nissan.app;

import com.nissan.bean.BoxClass;

public class VolumeClass {
	
	public static void main(String[] args) {
		
		BoxClass box1 = new BoxClass(10,20,10);
		BoxClass box2 = new BoxClass(10,20,10);
		System.out.println("The volume of box one is : "+box1.Volume());
		System.out.println("The volume is box two is : "+box2.Volume());
		
	}
}
