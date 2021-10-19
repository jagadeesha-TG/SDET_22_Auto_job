package com.crm.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="RegionalRegression")
	public void createOrg()
	{
		System.out.println("1");
	}
	
	@Test(groups="FullRegression")
	public void deleteOrg()
	{
		System.out.println("2");
	}

}
