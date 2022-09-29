package com.nissan.bean;

import com.nissan.bean.InvalidValueException;

public class EvaluationClass {
	
	//Properties, fields, data members, attributes
	
	//	Virtual Table
	// 	Declare variables -> Instance variables
	int evaluationId;
	int marksOne;
	int marksTwo;
	
	//	Physical Table
//	Create table evaluation(
//			EvaluationId INT PRIMARY KEY,
//			MarksOne INT,
//			MarksTw INT,
//			)
	
	// Constructors
	
	// 1. Default Constructor
	public EvaluationClass() {
		System.out.println("Hello this is evaluation vlass");
	}
	
	// 2. Paramaterized Constructor
	public EvaluationClass(int mOne, int mTwo) {
		this.marksOne = mOne;
		this.marksTwo = mTwo;
	}
	
	// 2. Custom methods
	public void display() throws InvalidValueException{
		//restrict to enter non zero value
		
		if (marksOne<0 || marksTwo<0) {
			throw new InvalidValueException();
		}else {
			System.out.println("markone: "+marksOne);
			System.out.println("markTwo: "+marksTwo);
		}
	}
	
}
