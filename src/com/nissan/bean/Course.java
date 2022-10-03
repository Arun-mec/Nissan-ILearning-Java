package com.nissan.bean;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {
	
	//instance variables
	private int courseCode;
	private String courseName;
	private String description;
	private String duration;
	private double fee;
	private ArrayList<String> qualifications;
	
	// default constructor
	public Course() {
		super();
	}

	//paramterized constructor
	public Course(int courseCode, String courseName, String description, String duration, double fee,
			ArrayList<String> qualifications) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.description = description;
		this.duration = duration;
		this.fee = fee;
		this.qualifications = qualifications;
	}

	//getters and setters
	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
		
	}
	public void setDescription(String description) {
//		Pattern pattern = Pattern.compile("^(?=.*[a-z])^(?=.*[A-Z])(?=.*\\\\d)[a-zA-Z\\\\d]{6-20}$\"");
//		
//		Matcher matcher = pattern.matcher(description);
//		
//		boolean finder = matcher.find();
//		
//		if (!finder) {
//			System.out.println("Description should contain should contain an uppercase, lowercase and maximum of 20 characters.!");
//		}
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public ArrayList<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(ArrayList<String> qualifications) {
		this.qualifications = qualifications;
	}

	//overriding
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", description=" + description
				+ ", duration=" + duration + ", fee=" + fee + ", qualifications=" + qualifications + "]";
	}
	
	// generate course code
	public static int generateCourseCode() {
		Random rndCourseCode = new Random();
		return  rndCourseCode.nextInt(50); 
	}
	
}
