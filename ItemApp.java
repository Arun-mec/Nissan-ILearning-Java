package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.ItemClass;

public class ItemApp {
	
	public static void main(String[] args) {
		
		// Declaring the scanner
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the name of the item");
		String name = scanner.nextLine();
		System.out.println("Enter the price of the item");
		double price = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter the quantity of the item you have taken?");
		double quantity = Double.parseDouble(scanner.nextLine());
		
		ItemClass itemOne = new ItemClass();
		itemOne.setItemName(name);
		itemOne.setItemPrice(price);
		itemOne.setItemQuantity(quantity);
		
		System.out.println("The final price of the item :"+itemOne.displayFinalPrice());
		itemOne.toString();
	}
}
