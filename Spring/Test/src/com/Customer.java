package com;

public class Customer extends Sbi {
	
	public void test() {
		System.out.println("---- testing");
	}
	
	public static void main(String[] args) {
		
		/*
		Customer c=new Customer();
		c.openAccount();
		c.closeAccount();
		c.deposit();
		c.withDraw();
		*/
		
		Sbi s=new Customer();
		//s.test();
		//s.openAccount();
		
		
	
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearkOperation() {
		// TODO Auto-generated method stub
		
	}

	public void openAccount() {
			System.out.println("-- opening account");
		}

}
