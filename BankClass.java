package com.nissan.bean;

public class BankClass {
	
	//Instance variables
	private int _principle;
	private int _time;
	private double _rate;
	private String _typeOfAccount;
	
	//Default constructor
	public BankClass() {
		super();
	}
	//Parameterized Constructors
	public BankClass(int _principle, int _time, double _rate, String _typeOfAccount) {
		super();
		this._principle = _principle;
		this._time = _time;
		this._rate = _rate;
		this._typeOfAccount = _typeOfAccount;
	}
	
	//Getters amd setters
	public int get_principle() {
		return _principle;
	}
	public void set_principle(int _principle) {
		this._principle = _principle;
	}
	public int get_time() {
		return _time;
	}
	public void set_time(int _time) {
		this._time = _time;
	}
	public double get_rate() {
		return _rate;
	}
	public void set_rate(double _rate) {
		this._rate = _rate;
	}
	public String get_typeOfAccount() {
		return _typeOfAccount;
	}
	public void set_typeOfAccount(String _typeOfAccount) {
		this._typeOfAccount = _typeOfAccount;
		
		if (_typeOfAccount.equals("Fixed")) {
			set_rate(0.04);
		}else if(_typeOfAccount.equals("Savings")){
			set_rate(0.11);
		}else {
			set_rate(0);
		}
	}
	
	//Methods
	public void display() {
		System.out.println(_typeOfAccount);
	}
	public double calculateInterest() {
		return this._rate* this._principle*this._time;
	}
	
	//Override toString
	
	@Override
	public String toString() {
		return "BankClass [_principle=" + _principle + ", _time=" + _time + ", _rate=" + _rate + ", _typeOfAccount="
				+ _typeOfAccount + "]";
	}
	
	
}
