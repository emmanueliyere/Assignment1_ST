package com.emmanueliyere.finances;

import static org.junit.Assert.*;

import org.junit.Test;

public class _SAYearTest {

	@Test
	public void endingBalance() {
		
		SAYear account = new SAYear(1000, 10);
		assertEquals(11000, account.endingBalance());
		}
}
