package com.nissan.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person {

	// Instance variables
	private int patientNo;
	private String hospital;
	private Date yearOfAdmisson;
	private String address;
	private double fee;

	// Default constructor
	public Patient() {
		super();
	}

	// Parameterized constructor

	public Patient(int patientNo) {
		super();
		this.patientNo = patientNo;
	}

	// gtters and stters
	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public Date getYearOfAdmisson() {
		return yearOfAdmisson;
	}

	public void setYearOfAdmisson(Date yearOfAdmisson) {
		this.yearOfAdmisson = yearOfAdmisson;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	// Calculate medical fee
	// -- injecting
	public void calculateMedicalFee(Money money) {
		this.fee = money.getBasicFee() + money.getTax();
	}

	// to STring
	@Override
	public String toString() {
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
		
		return "Patient [patientNo=" + patientNo + ", hospital=" + hospital + ", yearOfAdmisson=" + 
				formatDate.format(yearOfAdmisson)+ ", address=" + address + ", fee=" + fee + "]" + super.toString();
	}
	
	//format date
	
	
	

}
