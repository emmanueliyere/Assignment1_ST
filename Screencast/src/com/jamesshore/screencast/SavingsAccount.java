package com.jamesshore.screencast;

public class SavingsAccount {
	
	private int balance = 0;

	public void deposit(int amount) {
		balance += amount;
		
	}

	public Object balance() {
		return balance;
	}

}
