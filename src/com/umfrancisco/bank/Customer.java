package com.umfrancisco.bank;

public class Customer {
	private int id;
	private String name;
	private double amount;
	
	public Customer(int id, String name, double amount) {
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
}
