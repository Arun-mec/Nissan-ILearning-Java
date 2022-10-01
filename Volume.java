package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.VolumeClass;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring the scanner
		Scanner scanner = new Scanner(System.in);
		
		// declaring and initializing the message
		int count = 2;
		
		try {
		for(int i=0; i<count;i++) {
			System.out.println("Enter the width, height and depth of the box");
			double width = scanner.nextDouble();
			double height = scanner.nextDouble();
			double depth = scanner.nextDouble();
			
			// Declaring the class and 
			VolumeClass volume = new VolumeClass(width,height,depth);
			volume.getVolume();
		}
		}
		catch(Exception e) {
			System.out.println("Enter valid numbers!!");
		}
	}

}
