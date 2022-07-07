package com.testleaf.testcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC005MergeLeads extends ProjectSpecificMethods {

	@Test
	public void runMergeLeads() throws InterruptedException {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadToMerge()
		.clickToLeadToMerge()
		.clickMergeLink()
		.getLeadName();
		
		
	}
}
