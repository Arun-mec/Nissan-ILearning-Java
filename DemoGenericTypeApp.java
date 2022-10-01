package com.nissan.app;

import java.util.HashSet;
import java.util.Set;

public class DemoGenericTypeApp {
	public static void main(String[] args) {
		
		Set<String> hSet = new HashSet<String>();
		
		hSet.add("Welcome");
		hSet.add("Hello");
		hSet.add("Hello");
		hSet.add("Happy");
		hSet.add("happy");
		
		System.out.println(hSet);
	}
}
