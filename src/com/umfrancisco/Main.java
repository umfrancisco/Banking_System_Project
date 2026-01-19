package com.umfrancisco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String mainMenu = """
				Welcome to National Bank. Choose one option:
					1 - New customer
					2 - Add amount
					3 - Remove amount
					3 - Quit""";
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(mainMenu);
			System.out.println("-".repeat(40));
			String option = scanner.nextLine();
			
			if (option.equals("1")) {
				System.out.println("New Customer");
			}
			if (option.equals("2")) {
				System.out.println("Add amount");
			}
			if (option.equals("3")) {
				System.out.println("Remove amount");
			}
			if (option.equals("4")) {
				System.out.println("Goodbye");
				break;
			}
			System.out.println("-".repeat(40));
		}
		scanner.close();
	}
}
