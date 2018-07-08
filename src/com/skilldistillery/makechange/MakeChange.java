package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price;
		int paid;
		int change;
		String continues = "continue";

		while (!continues.equalsIgnoreCase("quit")) {
			System.out.println();
			System.out.print("Enter the purchase price:");
			price = (int)(sc.nextDouble() * 100);
			System.out.print("Enter the amount given by the customer:");
			paid = (int)(sc.nextDouble() * 100);

			while (paid < price) {
				System.out.print("Please provide " + ((price - paid) / 100.00) + " to complete purchase.");
				paid = paid + (int)(sc.nextDouble() * 100);
				}
			if (paid > price) {
				System.out.println("The change is: " + ((paid - price) / 100.00));
				System.out.println("The customer should be given the change as follows:");
				System.out.println("---------------------------------------------------");
				change = paid - price;

				int twenties = change / 2000;
				if (twenties > 0) {
					change = change % 2000;
					System.out.println(twenties + " - $20 bill(s)");
				}
				
				int tens = change / 1000;
				if (tens > 0) {
					change = change % 1000;
					System.out.println(tens + " - $10 bill(s)");
				}
				
				int fives = change / 500;
				if (fives > 0) {
					change = change % 500;
					System.out.println(fives + " - $5 bill(S)");
				}

				int ones = change / 100;
				if (ones > 0) {
					change = change % 100;
					System.out.println(ones + " - $1 bill(s)");
				}

				int quarters = change / 25;
				if (quarters > 0) {
					change = change % 25;
					System.out.println(quarters + " - quarter(s)");
				}

				int dimes = change / 10;
				if (dimes > 0) {
					change = change % 10;
					System.out.println(dimes + " - dime(s)");
				}

				int nickels = change / 5;
				if (nickels > 0) {
					change = change % 5;
					System.out.println(nickels + " - nickel(s)");
				}
				int pennies = change;
				if (pennies > 0) {
					change = change % 1;
					System.out.println(pennies + " - penny(s)");
				}
			} System.out.println("---------------------------------------------------");
			if (paid == price) {
				System.out.print("No change necessary.");
			}
			System.out.println("Do you wish to continue? Enter 'continue' or 'quit': ");
			continues = sc.next();
				if (continues.equalsIgnoreCase("quit")) {
					System.out.println("Thank you. Have a nice day.");
				}
				else if (!continues.equalsIgnoreCase("quit") || !continues.equalsIgnoreCase("continue")) {
					System.out.println("This input is not valid. Please re-enter: ");
				}
		}sc.close();
	}
}
