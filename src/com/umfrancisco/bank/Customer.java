package com.umfrancisco.bank;

public class Customer {
	private final int id;
	private final String name;
	private double amount;
	
	Customer(int id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	protected int getId() {
		return id;
	}
	protected String getName() {
		return name;
	}
	protected double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return String.format("%s: $%.2f", name, amount);
	}
}
