package com.emmanueliyere.finances;

public class SAYear {
	
	private int balance = 0;
	private int interestRate = 0;
	
	public SAYear(){}
	
	public SAYear(int startingBalance, int interestRate){
		this.balance = startingBalance;
		this.interestRate = interestRate;
		
	}
	
	public void deposit(int amount) {
		balance += amount;
		
	}

	public int balance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		balance -=amount;
	}

	public SAYear nextYear(int interestRate) {
		SAYear result = new SAYear();
		result.deposit(balance() + (balance()*interestRate /100));
		return result;
}


		public int endingBalance(){
			return balance() + (balance() * interestRate / 100);

		}
	


}
