package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.EditClass_obj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditClassValidation_SD {
	
	WebDriver driver = Helper.getDriver();
	
	EditClass_obj objedc = new EditClass_obj(driver);
	
	@Given("Admin is in Manage class page Admin is in Edit class detail popup window")
	public void admin_is_in_manage_class_page_admin_is_in_edit_class_detail_popup_window() {
	}
	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	    objedc.editbtnclkmehtod();
	}
	@Then("Edit popup window appears with heading Class Details")
	public void edit_popup_window_appears_with_heading_class_details() {
	    objedc.chkEditpopage();
	}
	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
		  objedc.editbtnclkmehtod();
	}
	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
	    objedc.chkallrws();
	}
	@Given("Admin is in  Edit class detail popup window")
	public void admin_is_in_edit_class_detail_popup_window() {
		 objedc.chkEditpopage();
	}
	@Then("Admin should see particular class details is updated in the data table")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table() {
		objedc.chkallrws();
	}
	@Then("class cannot be updated for the passed date")
	public void class_cannot_be_updated_for_the_passed_date() {
		//objew.checkclasdtmsg();
	}
	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
	}















}
//	@Given("Admin is in Manage class page Admin is in Edit class detail popup window")
//	public void admin_is_in_manage_class_page_admin_is_in_edit_class_detail_popup_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks Edit button in data table")
//	public void admin_clicks_edit_button_in_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Edit popup window appears with heading Class Details")
//	public void edit_popup_window_appears_with_heading_class_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks Edit button from one of the row in data table")
//	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Edit popup window appears with same row values in the all fields")
//	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Given("Admin is in  Edit class detail popup window")
//	public void admin_is_in_edit_class_detail_popup_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters all mandatory field values with valid data and clicks save button {string} and {string}")
//	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Admin should see particular class details is updated in the data table")
//	public void admin_should_see_particular_class_details_is_updated_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters all mandatory field values with invalid data and clicks save button {string} and {string}")
//	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Error message should appear in alert")
//	public void error_message_should_appear_in_alert() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters values in all fields with valid data and clicks save button {string} and {string}")
//	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters with invalid data in optional fields and clicks save button {string} and {string}")
//	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters  data missing value in Batch ID and clicks save button {string} and {string}")
//	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Batch Id is missing")
//	public void batch_id_is_missing() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters data missing value in No of class and clicks save button {string} and {string}")
//	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("No of classes is missing")
//	public void no_of_classes_is_missing() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters data missing value in  class date and clicks save button {string} and {string}")
//	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("class date is missing")
//	public void class_date_is_missing() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters data missing value in staff id and clicks save button {string} and {string}")
//	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("staff id is missing")
//	public void staff_id_is_missing() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin enters passed date in the class date field and clicks save button {string} and {string}")
//	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("class cannot be updated for the passed date")
//	public void class_cannot_be_updated_for_the_passed_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin clicks Cancel button without entering values in the fields")
//	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Admin should land on Manage Class page")
//	public void admin_should_land_on_manage_class_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin clicks Cancel button entering values in the fields")
//	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
//	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
//

