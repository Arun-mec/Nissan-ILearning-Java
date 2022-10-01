package com.nissan.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.nissan.bean.Money;
import com.nissan.bean.Patient;

public class DemoHospitalApp {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat date = new SimpleDateFormat("dd/mm/yy");
		Patient patient = new Patient(101);
		
		System.out.println("Enter name : ");
		patient.setName("Arun");
		
		System.out.println("Enter the age");
		patient.setAge(20);
		
		System.out.println("Enter the hospital");
		patient.setHospital("MBH");
		
		System.out.println("Enter the year of joining");
		patient.setYearOfAdmisson(date.parse("13/03/2000"));
		
		System.out.println("Enter the address");
		patient.setAddress("Aaaa");
		
		Money money = new Money(1200,59);
		patient.calculateMedicalFee(money);
		
		System.out.println(patient.toString());
		
	}
}
