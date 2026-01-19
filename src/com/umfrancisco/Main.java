package com.umfrancisco;

import java.util.Scanner;

import com.umfrancisco.bank.Bank;

public class Main {
	public static void main(String[] args) {
		Bank[] banks = {new Bank(100, "São Paulo"), new Bank(200, "New York"), new Bank(300, "Buenos Aires")};
		
		String bankMenu = """
				Hello! Welcome!
				Type your bank number:
				""";
		
		String customerMenu = """
				Choose one option:
					1 - New customer
					2 - Add amount
					3 - Remove amount
					4 - Quit
					""";
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = showBankOptions(scanner, bankMenu, banks);
		showCustomerOptions(scanner, customerMenu, bank);
		scanner.close();
	}
	
	public static Bank showBankOptions(Scanner scanner, String bankMenu, Bank[] banks) {
		while (true) {
			System.out.print(bankMenu);
			String option = scanner.nextLine();
			System.out.println("-".repeat(40));
			
			if (option.equals("100")) {
				return banks[0];
			} else if (option.equals("200")) {
				return banks[1];
			} else if (option.equals("300")) {
				return banks[2];
			} else {
				System.out.println("Bank number not found...");
			}
			
		}
	}
	
	public static void showCustomerOptions(Scanner scanner, String customerMenu, Bank bank) {
		while (true) {
			System.out.print("Welcome to "+bank.getName()+" Bank\n");
			System.out.print(customerMenu);
			String option = scanner.nextLine();
			System.out.println("-".repeat(40));
			
			if (option.equals("1")) {
				System.out.println("New Customer");
			} else if (option.equals("2")) {
				System.out.println("Add amount");
			} else if (option.equals("3")) {
				System.out.println("Remove amount");
			} else if (option.equals("4")) {
				System.out.println("Goodbye");
				break;
			} else {
				System.out.println("Try again...");
			}
			System.out.println("-".repeat(40));
		}
	}
}
