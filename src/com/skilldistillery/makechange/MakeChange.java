package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------
////	In the cash register we will calculate the amount of change returned to a 
//		customer based on the purchase price and the amount tendered. We will also 
//		notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, 
//		.25c, .10c, .05c, .01c) is needed to make the change for the customer. 
//		Change should be provided using the largest bill and coin denominations as 
//		possible. Denominations that are not used should not be displayed.
////
////		Hint: Mod operator
////
////		X User Story #1
////		The user is prompted asking for the price of the item.
////			Part 2:  
				
////		X User Story #2
////		The user is then prompted asking how much money was tendered by the customer.
////			Part 2: 
		
////		X User Story #3
////		Display an appropriate message if the customer provided too little money or the 
//			exact amount.
////			Part 2: 
		
////		X User Story #4
////		If the amount tendered is more than the cost of the item, display the number of 
//			bills and coins that should be given to the customer.
//				Part 2: 
//-----------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		//variables here
		double price;//input from user
		double customer$;//input from user
		int items; //handling for multiple items? Error messages?
		
		double add$;
		
		double bills = 0; //is this already in "customerAmt"?
		//put bill types inside another variable/method call that prints out what bills 
		//are returned?
		
		//Do I need to initialize all the variables I am using here or just the ones used by
		//the code in main - or can I just initialize the variables used by the methods
		//in the methods themselves then just return the values to variables in main?
		double one$; 
		double five$;
		double ten$; 
		double twenty$; 
		double hundred$; 
	
		
		double coins = 0;
		
		double quarter;
		double dime;
		double nickel;
		double penny;
						//half-dollar??
		
		//user prompt for price of item
		System.out.println("Please enter the price of the item you are purchasing: ");
		price = sc.nextDouble();
		
		//user prompt for item amount
		System.out.println("Please enter the item quantity: ");
		items = sc.nextInt();
		
		//user prompt for money tendered by customer
		System.out.println("Please enter the amount of money given: ");
		customer$ = sc.nextDouble();
//----------------------------------------------------------------------------------------------
		//Start of if loops to figure out which method to call?
		//prompt to receive more money
		if (customer$ < price){
			System.out.println("Please provide more money for your purchase: ");
		}		//callMethod1();
		
		//message to user if too little or correct amount
		else if (price >= customer$) {		System.out.println("Amount required: " + price +/*Price -(subtract)
				customerAmt = returnCash */ "Amount given: " + customer$ );
		//returns user to initial prompt for price of item, amount, and money given?
				//callMethod2();
		
		//error message if incorrect format is entered
		} else {
		//message for additional money required from customer
		// do not show denominations not used!
		System.out.println("You presented " + bills 
					/* + billMethod*/ + " & " + coins + ". Please provide additional currency." );
			System.out.println("Please enter additional currency: ");
			add$ = sc.nextDouble();
		}
		
		// do not show denominations not used!
		System.out.println("Change returned to customer: " + bills /*method to handle bills*/
				/* + billMethod*/ + " dollar bills & " + coins + " cents in change." ); /*method to handle coins*/
				//callMethod3();
		
		//check if half dollar is still in circulation
		//call methods as needed for math operations here or inside strings of output.
		
		sc.close();
		
		}
	
		double one$; 
		double five$;
		double ten$; 
		double twenty$; 
		double hundred$; 
	
		//use modulus operator??
		//methods down here
	
		//bill method to return correct change in bills
		//can bill and coin methods be combined? Or do I need to keep separate?
		//is my logic correct?
		
		public static double billMethod(double customer$, double price) {
			double bills;
			bills = customer$ - price;
			if (bills <= customer$) {
				//do this math
				//can I calculate only the part of the number before the decimal?
			}	//do I need to do separate calculations for each type of bill?
			else if (bills >= customer$)  {
				//do this math
			}
			return bills;
			}
			// do not show denominations not used!
		
		
		double quarter;
		double dime;
		double nickel;
		double penny;
		
		//do I need to do separate calculations for each type of coin?
		//coin method to return correct change in coins
		public static double coinMethod(double customer$, double price) {
			double coins;
			coins = customer$ - price;
			if (coins <= customer$) {
				//do this math
				//can I calculate only the part of the number after the decimal? modulus?
			}
			else if (coins >= customer$)  {
				//do this math
			}
			return coins;
			}
			// do not show denominations not used!

}
