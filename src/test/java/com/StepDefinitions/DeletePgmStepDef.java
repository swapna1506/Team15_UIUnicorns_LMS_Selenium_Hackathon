package com.StepDefinitions;

import com.Utils.BaseClass;
import com.Utils.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

import com.PageObjects.*;


public class DeletePgmStepDef extends BaseClass {
	
	
	
	@Given("user is in LMS portal")
	public void admin_is_on_Manage_Program_Page() {
		ConfigReader.loadConfig();
		driver.get(ConfigReader.getApplicationUrl());
		lp = new loginPage(driver);
		dp = new dashboadPage(driver);
		dpp = new DeletePgmConfirmPopupPage(driver);
	}
	
	@When("^user enters admin (.*) and (.*) and clicks login button$")
	public void user_enters_username_pwd(String username, String password) throws InterruptedException {
		lp.enterUsername(username);
		lp.enterPassword(password);
		Thread.sleep(1000);
		lp.clickLoginBtn();
		Thread.sleep(1000);
	}
	
	@And("Admin clicks {String} on the navigation bar")
	public void admin_clicks_program(String linkName) throws InterruptedException {
		dp.clickProgramLink();
		Thread.sleep(1000);
	}
	
	@Then("Admin should be on manage programe page with title {String}")
	public void validate_program_page_ttile(String expTitle) {
		String actTitile = mpp.getPageTite();
		Assert.assertTrue(actTitile.contains(expTitle));
	}
	
	
	@When("Admin clicks Delete button on the data table for row {String}")
	public void Admin_clicks_delete_btn(String btnName, String rowIndex) throws InterruptedException {
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
		String actMsg =dpp.getConfirmationMsg();
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
			}

	@Then("Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table")
//	 public void Admin_gets_a_message_"Successful_Program_Deleted"_alert_and_able_to_see_that_program_deleted_in_the_data_table(){
//	}
//	
//	@When("Admin clicks <NO> button on the alert")
//	public void Admin_clicks_<NO>_button_on_the_alert() {
//		
//	}
//	
//	@Then("Admin can see the deletion alert disappears without deleting")
//	public void Admin_can_see_the_deletion_alert_disappears_without_deleting() {
//}
//	
//	@When("Admin clicks Cancel/Close(X) Icon on Deletion alert")
//	public void Admin_clicks_Cancel/Close(X)_Icon_on_Deletion_alert() {
//		
//		
//	}
//	
//	 @Then(" Admin can see the deletion alert disappears without any changes")
//	
//	public void	  Admin_can_see_the_deletion_alert_disappears_without_any_changes() {
//		 
//	 }
	
	@When("Admin clicks Delete button on the data table for row {String}")
	public void Admin_clicks_delete_btn(String btnName, String rowIndex) throws InterruptedException {

	}
	
}
	






