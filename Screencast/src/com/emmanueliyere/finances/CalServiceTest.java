package com.emmanueliyere.finances;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalServiceTest {

	CalService calService;
	/*@Before 
	public void setup(){
		calService = new CalService();
		
	}*/
	@Test
	public void testAddTwoNumbers() {
		
		Assert.assertEquals(6, calService.addTwoNumbers(3, 3));
	}

}
