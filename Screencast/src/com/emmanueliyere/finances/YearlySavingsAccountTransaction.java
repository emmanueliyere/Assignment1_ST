package com.emmanueliyere.finances;

public class YearlySavingsAccountTransaction {
	
	private int balance = 0;
	private int interestRate = 0;
	
	public YearlySavingsAccountTransaction(){}
	
	public YearlySavingsAccountTransaction(int startingBalance, int interestRate){
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

	public YearlySavingsAccountTransaction nextYear(int interestRate) {
		YearlySavingsAccountTransaction result = new YearlySavingsAccountTransaction();
		result.deposit(balance() + (balance()*interestRate /100));
		return result;
}


		public int endingBalance(){
			return balance() + (balance() * interestRate / 100);

		}
	


}
