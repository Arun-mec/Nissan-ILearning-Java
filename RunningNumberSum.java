package com.nissan.bean;

public class RunningNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lowerBound = 1;
		int upperBound = 100;
		
		int number = lowerBound;
		int sum=0;
		//Find the sum and average
		
		while(number<= upperBound) {
			
			// Accumulate number into sum
			sum+=number;
			
			//increment number
			++number; // pre-increment
			
			//print the result
		}
		System.out.println("The sum from "+lowerBound+" to "+upperBound+" is "+sum);

		
	}

}
