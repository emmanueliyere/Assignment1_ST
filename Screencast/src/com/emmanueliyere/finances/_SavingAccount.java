package com.emmanueliyere.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingAccount {

	/*
	 * Test2: is to tract the transaction of a Saving account, 
	 * such as: it deposit
	 */

	@Test
	public void testdeposit() {
		
			SavingsAccount account = new SavingsAccount();
			account.deposit(100);
			assertEquals(100, account.balance());
			}

	/*
	 * Test3: Create the withdrawal method to the savings account, 
	 * without specifying what to be returned when amount 50 is withdrawn from the total of 100, 
	 * the test did gave an error ad expected to fail, but once the correction was made, 
	 * the test was re-ran and it passed successfully.
	 */
	
	@Test
	public void testWithrawal() {
		
			SavingsAccount account = new SavingsAccount();
			account.deposit(100);
			assertEquals("after deposit", 100, account.balance());
			account.withdraw(50);
			assertEquals("after withdraw", 50, account.balance());
			}
	
	@Test
	public void negativeBalanceIsJustFine(){
		SavingsAccount account = new SavingsAccount();
		account.withdraw(75);
		assertEquals(-75, account.balance());
	}
	
	
}
