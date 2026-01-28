package com.umfrancisco.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private int bankNumber;
	private String name;
	private List<Customer> customers = new ArrayList<>();
	
	public Bank(int bankNumber, String name) {
		this.bankNumber = bankNumber;
		this.name = name;
	}
	
	public Customer newBankCustomer(int id, String name, double amount) {
		Customer customer = new Customer(id, name, amount);
		this.addBankCustomer(customer);
		return customer;
	}
	
	protected void addBankCustomer(Customer customer) {
		for (var c : customers) {
			if (c.getId() == customer.getId()) {
				System.out.println(customer.getName()+" is already a customer...");
			}
		}
		customers.add(customer);
	}
	
	public boolean deposit(Customer c, double amount) {
		if (customers.contains(c) && amount > 0) {
			c.deposit(amount);
			return true;
		}
		return false;
	}
	
	public boolean withdraw(Customer c, double amount) {
		if (customers.contains(c) && amount > 0) {
			c.withdraw(amount);
			return true;
		}
		return false;
	}
	
	public int getBankNumber() {
		return bankNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public Customer getCustomer(int id) {
		for (var c : customers) {
			if (c.getId() == id) {
				return c;
			}
		}
		System.out.println("Customer not found...");
		return null;
	}
	
	@Override
	public String toString() {
		return bankNumber+", "+customers;
	}
}
