package com.StepDefinitions;

import com.PageObjects.Assgn_DeleteAssgnValidationPage;
import com.PageObjects.Assgn_ManagePgVerificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.junit.Assert;


public class Assgn_DeleteAssgnValidationSteps
{
	private Assgn_DeleteAssgnValidationPage deleteAssgn = new Assgn_DeleteAssgnValidationPage();

	/*@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() 
	{
		deleteAssgn.openLmlPortal();;
	}*/

	/*@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() 
	{
		deleteAssgn.deleteButtonindatatable();
	}*/

	@Then("Admin should see dialog box")
	public void admin_should_see_dialog_box() 
	{
	    boolean dialogBoxVisible=deleteAssgn.ShowDialogBox();
	    Assert.assertTrue(dialogBoxVisible);
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) 
	{
		boolean AcceptBtn=deleteAssgn.AcceptAlert();
		Assert.assertTrue(AcceptBtn);
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string)
	{
		boolean RejectBtn=deleteAssgn.RejectAlert();
		Assert.assertTrue(RejectBtn);
	}

	/*@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert()
	{
		deleteAssgn.ShowDialogBox();
	}*/

	/*@When("Admin clicks yes button")
	public void admin_clicks_yes_button() 
	{
		deleteAssgn.ClickYesBtn();
	}*/
	
//
//	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
//	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("Admin clicks no button")
	public void admin_clicks_no_button() 
	{
		deleteAssgn.ClickNoBtn();

   }
//
//	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
//	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
