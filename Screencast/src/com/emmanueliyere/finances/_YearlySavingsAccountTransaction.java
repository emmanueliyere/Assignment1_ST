package com.emmanueliyere.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _YearlySavingsAccountTransaction {

	@Test
	public void endingBalance() {
		YearlySavingsAccountTransaction account = new YearlySavingsAccountTransaction(10000, 10);
		assertEquals(11000, account.endingBalance());
		}
}
