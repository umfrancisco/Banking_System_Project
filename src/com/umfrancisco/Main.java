package com.umfrancisco;

import com.umfrancisco.bank.Bank;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank(100);
		bank.newCustomer(1, "Ana", 2000);
		bank.newCustomer(2, "Beatriz", 3000);
		System.out.println(bank);
		
		bank.newCustomer(3, "ana", 2000);
		System.out.println(bank);
	}
}
