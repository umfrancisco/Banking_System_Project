package com.umfrancisco;

import com.umfrancisco.bank.Bank;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		bank.newCustomer(1, "Ana", 2000);
		bank.newCustomer(2, "Beatriz", 3000);
		bank.newCustomer(3, "Carlos", 1200);
		System.out.println(bank);
		
		bank.doTransaction(bank.getCustomer(1), bank.getCustomer(2), 500);
		System.out.println(bank);
	}
}
