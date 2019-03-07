package com.pricematrix;

//Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl Object created");
	}
	
	@Override
	public double getItemPrice(String itemCode) {	
		// code to connect to DB and fetch price for given item code
		
		return 100.0;
	}
	
	

}
