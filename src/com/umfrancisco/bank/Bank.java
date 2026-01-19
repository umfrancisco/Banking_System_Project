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
	
	public Customer newCustomer(int id, String name, double amount) {
		Customer customer = new Customer(id, name, amount);
		this.addCustomer(customer);
		return customer;
	}
	
	protected boolean addCustomer(Customer customer) {
		for (var c : customers) {
			if (c.getId() == customer.getId()) {
				System.out.println(customer.getName()+" is already a customer...");
				return false;
			}
		}
		customers.add(customer);
		return true;
	}
	
	public boolean addAmount(Customer c, double amount) {
		if (customers.contains(c) && amount > 0) {
			c.add(amount);
			return true;
		}
		return false;
	}
	
	public boolean removeAmount(Customer c, double amount) {
		if (customers.contains(c) && amount > 0) {
			c.remove(amount);
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
