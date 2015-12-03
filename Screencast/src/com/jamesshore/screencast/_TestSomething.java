package com.jamesshore.screencast;

import static org.junit.Assert.*;

import org.junit.Test;

public class _TestSomething {
	
	/*
	 * Test1: First test
	 */

	@Test
	public void nothing() {
		
	}
	/*
	 * Test2: is to tract the transaction of a Saving account, 
	 * such as: it deposit
	 */
	@Test
	public void savingsAccount(){
		SavingsAccount account = new SavingsAccount();
		account.deposit(100);
		assertEquals(100, account.balance());
	}

}

