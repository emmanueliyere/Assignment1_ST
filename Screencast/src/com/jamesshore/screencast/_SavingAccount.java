package com.jamesshore.screencast;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SavingAccount {

	/*
	 * Test2: is to tract the transaction of a Saving account, 
	 * such as: it deposit
	 */

	@Test
	public void test() {
		
			SavingsAccount account = new SavingsAccount();
			account.deposit(100);
			assertEquals(100, account.balance());
			}

}
