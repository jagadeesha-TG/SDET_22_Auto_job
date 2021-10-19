package com.crm.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContact()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println("3");
	}             
	
	
		@Test(groups="FullRegression")
		public void deleteContact()
		{
			System.out.println("4");
		}
	

}
