package com.nissan.bean;

public class CustomerAccountClass {
	
	//instance variables
	private int _accountNo;
	private String _name;
	private int _age;
	private String _place;
	private String _accountType;
	
	//default constructor
	public CustomerAccountClass() {
		super();
	}

	//paramteric constructor
	public CustomerAccountClass(int _accountNo, String _name, int _age, String _place, String _accountType) {
		super();
		this._accountNo = _accountNo;
		this._name = _name;
		this._age = _age;
		this._place = _place;
		this._accountType = _accountType;
	}

	//methods
	public void displayDetails() {
		System.out.println(this._accountNo+"\t"+"\t"+this._name+"\t"+this._age+"\t"+this._place+"\t"+this._accountType);
	}
	public void displayTitles() {
		System.out.println("Account Number"+"\t"+"Name"+"\t"+"Age"+"\t"+"Place"+"\t"+"Account Type");
		System.out.println("------------------------------------------------------------");
	}
	
	//getters and setters
	public int get_accountNo() {
		return _accountNo;
	}

	public void set_accountNo(int _accountNo) {
		this._accountNo = _accountNo;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public String get_place() {
		return _place;
	}

	public void set_place(String _place) {
		this._place = _place;
	}

	public String get_accountType() {
		return _accountType;
	}

	public void set_accountType(String _accountType) {
		this._accountType = _accountType;
	}

	//to string
	@Override
	public String toString() {
		return "CustomerAccountClass [_accountNo=" + _accountNo + ", _name=" + _name + ", _age=" + _age + ", _place="
				+ _place + ", _accountType=" + _accountType + "]";
	}
	
	
}


