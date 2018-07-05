package com.skilldistillery.makechange;

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
////		User Story #1
////		The user is prompted asking for the price of the item.
////
////		User Story #2
////		The user is then prompted asking how much money was tendered by the customer.
////
////		User Story #3
////		Display an appropriate message if the customer provided too little money or the 
//			exact amount.
////
////		User Story #4
////		If the amount tendered is more than the cost of the item, display the number of 
//			bills and coins that should be given to the customer.
//-----------------------------------------------------------------------------------------------
		
		//variables here
		double purchasePrice;
		double customerAmt;
		
		double billTotal; //is this already in "customerAmt"?
		
		double billNum1; //1's, 5's, 10's, 20's, 100's
		double billNum2;
		double billNum3;
		double billNum4;
		double billNum5;
		
		double coinTotal;
		
		double coinNum1;
		double coinNum2;
		double coinNum3;
		
		double coinType; //quarters, dimes, nickels, pennies, half-dollar
		double coinType1;//quarters
		double coinType2;//dimes
		double coinType3;//nickels
		double coinType4;//pennies
						//half-dollar
		
		//user prompt for price of item
		System.out.println("Please enter the price of the item you are purchasing: ");
		//user prompt for money tendered by customer
		System.out.println("Please enter the amount of money given: ");
		//message to user if too little or correct amount
		System.out.println("Amount required: " + purchasePrice +/*purchasePrice -(subtract)
		customerAmt = returnCash */ 
				"Amount given: " + customerAmt );
		System.out.println("Please provide more money for your purchase: ");
		//message for money returned to customer
		System.out.println("Change returned to customer: " + billTotal + (1 - 5) + "bills & " 
		+ coinTotal + coinType1,2,3,4);  //check if half dollar is still in circulation
		
		
		
		//call methods as needed for math operations
		
	}
		//methods down here
		
	
	
}
