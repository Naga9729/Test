package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item04", "Item05" };

		
		
		//-----------------------------------
		
		PriceMatrix price=new PriceMatrixImpl(); // dependency class obj
		
		//-----------------------------------

		BillingImpl bill = new BillingImpl(); // dependenct class obj
		bill.setPrice(price); // DI-> Injecting dependency to the dependent 
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);
		
		
		//---------------------
		
		total = bill.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);
		
		
		
		
		
		
		
		
		
		
		

	}

}
