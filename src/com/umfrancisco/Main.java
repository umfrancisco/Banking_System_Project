package com.umfrancisco;

import java.util.Scanner;
import com.umfrancisco.bank.Bank;
import com.umfrancisco.menu.MenuOptions;

public class Main {
	public static void main(String[] args) {
		Bank[] banks = {new Bank(100, "São Paulo"), new Bank(200, "New York"), new Bank(300, "Buenos Aires")};
		
		String bankMenu = """
				Hello! Welcome!
				Bank Numbers:
				
					São Paulo Bank -> 100
					New York Bank -> 200
					Buenos Aires Bank -> 300
					
				Type your bank number:
				""";
		
		String customerMenu = """
				Choose one option:
					1 - New customer
					2 - Existing customer
					3 - Quit
					""";
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = MenuOptions.showBankOptions(scanner, bankMenu, banks);
		MenuOptions.showCustomerOptions(scanner, customerMenu, bank);
		scanner.close();
	}
}
