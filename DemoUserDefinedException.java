package com.nissan.bean;

import com.nissan.bean.EvaluationClass;
import com.nissan.bean.InvalidValueException;
public class DemoUserDefinedException {
	public static void main(String[] args) {
		
		EvaluationClass evaluation = new EvaluationClass();
		
		try {
			evaluation.display();
		}
		catch(InvalidValueException ive) {
			System.out.println("Invalid Entry");
		}
		catch(Exception e) {
			System.out.println("Message"+e);
		}
	}
}
