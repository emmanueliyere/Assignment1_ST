package com.emmanueliyere.finances;

public class Main {
	
	public static void main(String[] arrgs){
		SavingsAccount account = new SavingsAccount();
		account.deposit(10000);
		for(int i = 0; i < 60; i++){
			System.out.println(i + ": $" + account.balance());
			account = account.nextYear(10);
		}
	}

}
