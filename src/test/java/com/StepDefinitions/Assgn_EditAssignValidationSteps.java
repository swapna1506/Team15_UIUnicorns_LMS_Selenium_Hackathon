package com.StepDefinitions;

import com.PageObjects.Assgn_EditAssignValidationPage;
import com.Utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assgn_EditAssignValidationSteps 
{
	//String Url= ConfigReader.getEditAssignPageurl();
	private Assgn_EditAssignValidationPage editassgnvalid= new Assgn_EditAssignValidationPage();
	@Given("Admin is in  Edit assignment detail popup window")
	public void admin_is_in_edit_assignment_detail_popup_window() 
	{
		editassgnvalid.EditAssgPopupwdw();
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() 
	{
		editassgnvalid.Editpopupwdw();
	}

	@Then("Edit popup window appears with heading Assignment Details")
	public void edit_popup_window_appears_with_heading_assignment_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data and clicks save button \\( Program name, batch number,Assignment Name, grade by, Assignment due date)")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see updated assignment details is added in the data table")
	public void admin_should_see_updated_assignment_details_is_added_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with invalid data and clicks save button \\(Program name, batch number,Assignment Name, grade by, Assignment due date )")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters values in all fields with valid data and clicks save button \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button \\(Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters  data missing value in program name and clicks save button \\(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Program Name is missing")
	public void program_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	/*@When("Admin enters data missing value in Batch number and clicks save button \\(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
	public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment due date is missing")
	public void assignment_due_date_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
	public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Grade by is missing")
	public void grade_by_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment cannot be updated for the passed date")
	public void assignment_cannot_be_updated_for_the_passed_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	/*@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
