package com.nissan.app;

import com.nissan.bean.FirstClass;
import com.nissan.bean.SecondClass;

public class InheritanceApp {
	public static void main(String[] args) {
		
		FirstClass first = new FirstClass();
		first.helloOne();
		
		SecondClass second = new SecondClass();
		second.secondOne();
		second.helloOne();
	}
}
