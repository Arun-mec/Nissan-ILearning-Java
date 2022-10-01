package com.nissan.bean;

public class StudentClass {
	
	// instance variables
	private String _studentName;
	private String _studentId;
	private double _studentGrade;
	private int age;
	private String _address;
	private Double _passmarks;
	// default constructor
	public StudentClass() {
		super();
	}
	// paramterized constructor
	public StudentClass(String _studentName, String _studentId, double _studentGrade, int age, String _address, double _passmarks) {
		super();
		this._studentName = _studentName;
		this._studentId = _studentId;
		this._studentGrade = _studentGrade;
		this.age = age;
		this._address = _address;
		this._passmarks = _passmarks;
	}
	
	//method
	
	// getters and setters
	public String get_studentName() {
		return _studentName;
	}
	public void set_studentName(String _studentName) {
		this._studentName = _studentName;
	}
	public String get_studentId() {
		return _studentId;
	}
	public void set_studentId(String _studentId) {
		this._studentId = _studentId;
	}
	public double get_studentGrade() {
		return _studentGrade;
	}
	public void set_studentGrade(double _studentGrade) {
		this._studentGrade = _studentGrade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
	}
	public Double get_passmarks() {
		return _passmarks;
	}
	public void set_passmarks(Double _passmarks) {
		this._passmarks = _passmarks;
	}
	
	// ocerriding
	@Override
	public String toString() {
		return "StudentClass [_studentName=" + _studentName + ", _studentId=" + _studentId + ", _studentGrade="
				+ _studentGrade + ", age=" + age + ", _address=" + _address + ", _passmarks=" + _passmarks + "]";
	}
	

	
	
}	
