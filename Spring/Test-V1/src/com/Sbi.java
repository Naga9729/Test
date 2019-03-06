package com;

public class Sbi implements Customer,Manager,Cleark {

	public void openAccount() {
		System.out.println("-- opening account");
	}

	public void closeAccount() {
		System.out.println("-- closing account");
	}

	public void withDraw() {
		System.out.println("-- withdrawing");
	}

	public void deposit() {
		System.out.println("-- depositing");
	}

	public void lockerAccess() {
		System.out.println("---- Locker access given");
	}

	public void cleakOperations() {
	System.out.println("--- Clerkal operations");
		
	}
}
