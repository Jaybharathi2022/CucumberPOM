package com.testleaf.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewLeadPage extends ProjectSpecificMethods {

	public static String leadName;
	public static String dupLeadName;

	@Then("View Lead Page should be displayed")
	public void verifyViewLeadPage() {
		verifyPage(props.getProperty("ViewLead_titleName"));
	}
	public ViewLeadPage confirmFirstName(String fName) {
		Assert.assertEquals(fName, getDriver().findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	@And("Capture the name of the lead")
	public ViewLeadPage getLeadName() {
		leadName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(leadName);
		return this;
	}

	@And("Verify duplicated lead")
	public ViewLeadPage verifyDupLeadName() throws InterruptedException {

		Thread.sleep(3000);
		dupLeadName = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(leadName, dupLeadName);
		return this;
	}

	@Then("Verify {string}  is updated")
	public ViewLeadPage verifyUpdate(String updName) {
		boolean contains = getDriver().findElement(By.id("viewLead_companyName_sp")).getText().contains(updName);
		Assert.assertTrue(contains);
		return this;
	}
	
	@When("Click on Duplicate Lead link")
	public DuplicateLeadPage clickDuplicateLead() {
		clickLinkText(props.getProperty("Duplicate_Lead_link-text"));
		return new DuplicateLeadPage();
	}
	
	@When("Click on Edit link")
	public EditLeadPage clickEdit() {
		clickLinkText(props.getProperty("Edit_link-text"));
		return new EditLeadPage();
	}
	
	@When("Click on Delete link")
	public MyLeadsPage clickDelete() {
		clickLinkText(props.getProperty("Delete_link-text"));
		return new MyLeadsPage();
	}
}
