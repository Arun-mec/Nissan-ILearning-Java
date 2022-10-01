package com.nissan.bean;

public class Student {

	// declaring variables
	private int studentId;
	private String studentName;
	private int age;
	private double fee;
	
	//default constructor
	public Student() {
		super();
	}
	
	// parametic constructors
	public Student(int studentId, String studentName, int age, double fee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.fee = fee;
	}
	
	//setters
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getStudentId() {
		return studentId;
	}
	
	//getters
	
	
	
}
