package com;

public abstract class Sbi {

	public void openAccount() {
		System.out.println("-- opening account");
	}

	public void closeAccount() {
		System.out.println("-- closing account");
	}

	//public void withDraw() {
	//	System.out.println("-- withdrawing");
	//}

	//public void deposit() {
		//System.out.println("-- depositing");
	//}
	
	public abstract void deposit();
	public abstract void withDraw();
	public abstract void clearkOperation();
}
