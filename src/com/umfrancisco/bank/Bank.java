package com.umfrancisco.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private int bankNumber;
	private List<Customer> customers = new ArrayList<>();
	
	public Bank(int bankNumber) {
		this.bankNumber = bankNumber;
	}
	
	public void addCustomer(Customer customer) {
		if (!customers.contains(customer)) {
			System.out.println("Adding new customer...");
			customers.add(customer);
		} else {
			System.out.println("Existing customer...");
		}
	}
	
	public int getBankNumber() {
		return bankNumber;
	}
}
