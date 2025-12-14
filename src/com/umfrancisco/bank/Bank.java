package com.umfrancisco.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private int bankNumber;
	private List<Customer> customers = new ArrayList<>();
	
	public Bank(int bankNumber) {
		this.bankNumber = bankNumber;
	}
	
	public Customer newCustomer(int id, String name, double amount) {
		Customer customer = new Customer(id, name, amount);
		this.addCustomer(customer);
		return customer;
	}
	
	public void addCustomer(Customer customer) {
		for (var c : customers) {
			if (c.getId() == customer.getId()) {
				System.out.println(customer.getName()+" is already a customer...");
				return;
			}
		}
		customers.add(customer);
	}
	
	public int getBankNumber() {
		return bankNumber;
	}
	
	@Override
	public String toString() {
		return bankNumber+", "+customers;
	}
}
