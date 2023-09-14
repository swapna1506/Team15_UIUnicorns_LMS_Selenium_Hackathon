package com.StepDefinitions;

import com.Utils.BaseClass;
import com.Utils.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.PageObjects.*;


public class DeletePgmStepDef extends BaseClass {

	public DeletePgmStepDef(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	

	/*Login_LoginPageVerification_PageObj lp_1=new Login_LoginPageVerification_PageObj(driver);
	
	
	public DeletePgmStepDef(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	@Given("user is in LMS portal")
	public void admin_is_on_Manage_Program_Page() {
		ConfigReader.loadConfig();
		driver.get(ConfigReader.getApplicationUrl());
	//	lp = new loginPage(driver);
		dp = new DashboardPage(driver);
		dpp = new DeletePgmConfirmPopupPage(driver);
	}
	
	@When("^user enters admin (.*) and (.*) and clicks login button$")
	public void user_enters_username_pwd(String username, String password) throws InterruptedException {
		//	lp.enterUsername(username);
		lp_1.sendvalues(username, password);
		
		Thread.sleep(1000);
		lp_1.l();
		Thread.sleep(1000);
	}
	
	@And("Admin clicks {String} on the navigation bar")
	public void admin_clicks_program() throws InterruptedException {
		dp.clickUserLink();
		Thread.sleep(1000);
	}
	
	@Then("Admin should be on manage programe page with title {String}")
	public void validate_program_page_ttile(String expTitle) {
		String actTitile = mpp.getPageTite();
		Assert.assertTrue(actTitile.contains(expTitle));
	}
	
	
	@When("Admin clicks Delete button on the data table for row {String}")
	public void Admin_clicks_delete_btn() throws InterruptedException {
		mpp.clickDeleteBtn();
		Thread.sleep(1000);
	}
	
	@Then("Admin should see a alert page with heading {String} along with YES and NO button for deletion")
	public void validate_delete_operation_for_each_row(String expPageTitle) {
		String actPageTitle = dpp.getPageTitle();
		String actYesBtnName = dpp.getYesBtnName();
		String actNoBtnName = dpp.getYesBtnName();
		Assert.assertTrue(actPageTitle.contains(expPageTitle));
		Assert.assertTrue(actYesBtnName.contains("Yes"));
		Assert.assertTrue(actNoBtnName.contains("No"));
	}

	
	@Then("Admin should see a message {String}")
	public void delete_confirmation_message(String expMsg) {
		String actMsg =dpp.getYesBtnName();
		Assert.assertTrue(actMsg.contains(expMsg));
	}
	
	@When("Admin clicks YES button on the alert")
	public void admin_clicks_yes_button(){
		
	}
	
    @Given("Admin is on Confirm Deletion alert")
	public void Admin_is_on_Confirm_Deletion () {
	
	}
	

	@When("Admin clicks <YES> button on the alert")
    public void Admin_clicks_<YES>_button_on_the_alert () {
			}*/


}
	






