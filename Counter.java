package com.nissan.bean;

public class Counter {
	
	static int count =1;
	
	// Default counter
	public Counter() {
		count++;
		System.out.println(count);
	}
	
	static {
		System.out.println("Static block");
	}
	
	public static void change() {
		System.out.println("Counter two");
	}
	public static void changeDisplay() {
		System.out.println("Counter three");
	}
}
