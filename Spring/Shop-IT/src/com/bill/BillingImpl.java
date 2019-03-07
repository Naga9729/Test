package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;
//Dependent
public class BillingImpl {
	
	/*
	 * Design Issues
	 * --------------------
	 * 	-> too many dependency objects created.
	 * 		-> memory issues
	 * 		-> perf goes down
	 * 
	 * 	Why this issue happened?
	 * --------------------------
	 * 	-> Dependent class is creating dependency class object
	 * 
	 *  What is the solution?
	 *  -----------------------
	 *  -> Do not create dependency object in the dependent class
	 *  -> Insted of creating in dependenct class, search for the dependency objects
	 *  
	 *  How can I Search Dependency objects?
	 *  --------------------------------------
	 *  -> JNDI -> using look up technique
	 *  
	 *  Issues with JNDI
	 *  -----------------
	 *  -> JNDI location is tightly binded with depenedent class.
	 *  
	 *  What is the best solution?
	 *  -------------------------------
	 *  	-> Do not find/ search, insted ask some one to craete and inject. (IoC)
	 *  How Can I implement Ioc? (Inversion of control)
	 *  -------------------------------------------------
	 *  -> By using DI (Dependency Injection technique)
	 *  2 ways
	 *  -------
	 *  1. using setter based injection
	 *  2. using constructor based injection
	 *  
	 *  
	 *	
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	private PriceMatrix price;
	
	
	public void setPrice(PriceMatrix price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {
	
		double total=0.0;
		
		//PriceMatrix price=new PriceMatrixImpl(); // dependency
		
		for(String itemCode:cart) {
			total=total+price.getItemPrice(itemCode);
		}
		
		
		return total;
		
	}

}
