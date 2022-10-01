package com.nissan.bean;

public class ItemClass {
	// defining instance variables
	private String itemName;
	private double itemQuantity;
	private double itemPrice;
	private double finalPrice;
	
	// defining default constructor
	public ItemClass() {
		super();
	}
	
	// Parameterized constructor
	public ItemClass(String itemName, double itemQuantity, double itemPrice, double finalPrice) {
		super();
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.finalPrice = finalPrice;
	}
	
	// getter and setter methods
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		
		this.itemPrice = itemPrice;
		this.finalPrice = itemPrice*itemQuantity;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	//methods
	public double displayFinalPrice() {
		return this.itemPrice*this.itemQuantity;
	}

	// toString
	@Override
	public String toString() {
		return "ItemClass [itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", itemPrice=" + itemPrice
				+ ", finalPrice=" + finalPrice + "]";
	}
	
}
