package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Assgn_DeleteMultipleClassValidPage;
import com.PageObjects.Assgn_ManagePgVerificationPage;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assgn_DeleteMultipleClassValidSteps 
{
	private WebDriver driver = Helper.getDriver();
	private Assgn_DeleteMultipleClassValidPage DltMultipleClass = new Assgn_DeleteMultipleClassValidPage();
	//@Given("Admin is in manage assignment page")
/*	public void admin_is_in_manage_assignment_page() 
	{
		DltMultipleClass.ManageAssignPageUrl();
	}*/

/*	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() 
	{
		DltMultipleClass.Clickrow1chkbox();
	}*/

	/*@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() 
	{
		boolean str= DltMultipleClass.deleteIconEnable();	
		Assert.assertTrue(str);
	}*/
/*	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() 
	{
		DltMultipleClass.ShowDeleteAlertBox();
	}*/

	/*@When("Admin clicks yes button")
	public void admin_clicks_yes_button() 
	{
		DltMultipleClass.AcceptAlert();
	}*/
//
//	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
//	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
//	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
