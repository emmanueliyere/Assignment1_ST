package com.emmanueliyere.finances;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class UserDomainTest {

	@Test
	public void testSave() throws Exception{


		CalService cal = Mockito.mock(CalService.class);
		UserDomain UserDomain = new UserDomain(cal);
		UserDomain.save("Account Owner");
		
		Mockito.verify(cal).save("Account Owner");
	}

}

