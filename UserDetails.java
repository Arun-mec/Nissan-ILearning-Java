package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Declaring the variables
		System.out.println("Enter the name");
		String name = input.next();
		System.out.println("Enter the gender");
		String gender = input.next();
		System.out.println("Enter the date of birth(Year of birth)");
		int dob = input.nextInt();
		System.out.println("Enter the marital status");
		boolean maritalStatus = input.nextBoolean();
		System.out.println("Enter the weight");
		double weight = input.nextDouble();
		System.out.println("Enter the gpa");
		double gpa = input.nextDouble();
		
		
		input.close();
		
		// Printing the output
//		PrintDetails(name,gender,dob,maritalStatus,weight,gpa,generateRandom());
//		PrintDetailsNextline(name,gender,dob,maritalStatus,weight,gpa,generateRandom());
		PrintDetailsTablewise(name,gender,dob,maritalStatus,weight,gpa,generateRandom());
	}
	
	private static void PrintDetails(String name, String gender,int dob,boolean maritalStatus,double weight,double gpa,int uniqueNum) {
		System.out.print("Name: "+name+"\t");
		System.out.print("Gender: "+gender+"\t");
		System.out.print("Year of birth: "+dob+"\t");
		System.out.print("Marital Status: "+maritalStatus+"\t");
		System.out.print("Wegiht: "+weight+"\t");
		System.out.print("GPA : "+gpa+"\t");
		System.out.print("Unique number : "+uniqueNum+"\t");
	}
	
	private static void PrintDetailsNextline(String name, String gender,int dob,boolean maritalStatus,double weight,double gpa,int uniqueNum) {
		System.out.print("Name: "+name+"\n");
		System.out.print("Gender: "+gender+"\n");
		System.out.print("Year of birth: "+dob+"\n");
		System.out.print("Marital Status: "+maritalStatus+"\n");
		System.out.print("Wegiht: "+weight+"\n");
		System.out.print("GPA : "+gpa+"\n");
		System.out.print("Unique number : "+uniqueNum+"\n");
	}
	
	private static void PrintDetailsTablewise(String name, String gender,int dob,boolean maritalStatus,double weight,double gpa,int uniqueNum) {
		System.out.print("Name: "+"\t"+"Gender: "+"\t"+"Year of birth: "+"\t"+"Marital Status: "+"\t"+"Weight"+"\t"+"GPA : "+"\t"+"Unique number : "+"\n");
		System.out.print(name+"\t"+gender+"\t"+"\t"+dob+"\t"+"\t"+maritalStatus+"\t"+weight+"\t"+gpa+"\t"+generateRandom());
	}
	
	private static int generateRandom() {
		Random random = new Random();
		int uniqueNum = 100000+random.nextInt(90000);
		return uniqueNum;
	}
}
