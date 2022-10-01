package com.nissan.app;

import com.nissan.bean.Counter;

public class DemoStaticApp {

	public static void main(String[] args) {
		
		// Default constructor
		Counter counterOne = new Counter();
		Counter counterTwo = new Counter();
		Counter counterThree = new Counter();
		
		counterOne.change();
		counterTwo.changeDisplay();
	}
}
