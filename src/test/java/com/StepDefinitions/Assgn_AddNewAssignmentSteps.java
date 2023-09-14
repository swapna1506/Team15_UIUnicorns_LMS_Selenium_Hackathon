package com.StepDefinitions;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;

import com.PageObjects.Assgn_AddNewAssignmentPage;
import com.PageObjects.Assgn_ManagePgVerificationPage;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Assgn_AddNewAssignmentSteps 
{ 
	String Excelpath = ConfigReader.getexcelfilepath();
	private WebDriver driver = Helper.getDriver();
	private Assgn_AddNewAssignmentPage AddNewAssgnPgVrf = new Assgn_AddNewAssignmentPage();
	
/*	@Given("Admin is in  assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() 
	{
		AddNewAssgnPgVrf.AssDetailsPopupWnw();
	}*/

/*	@When("Admin enters all mandatory field values with invalid data and clicks save button \\(Program name, batch number,Assignment Name, grade by, Assignment due date )")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() throws IOException 
	{
		AddNewAssgnPgVrf.EnterProgramname();
		AddNewAssgnPgVrf.EnterBatchnumber();
		AddNewAssgnPgVrf.EnterAssignName();
		AddNewAssgnPgVrf.EnterGradeBy();
		AddNewAssgnPgVrf.EnterAssgnDueDate();
   	}*/

	@Then("Admin should see new assignment details is added in the data table")
	public void admin_should_see_new_assignment_details_is_added_in_the_data_table() 
	{
		AddNewAssgnPgVrf.FieldValuesindatatable();
	}

/*	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert()
	{
		String alertmsg=AddNewAssgnPgVrf.AlertMessage();
		Assert.assertEquals("InvalidData", alertmsg);
	}*/
	    

	/*@When("Admin enters values in all fields with valid data and clicks save button \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) throws IOException
	{
		AddNewAssgnPgVrf.EnterProgramname();
		AddNewAssgnPgVrf.EnterBatchnumber();
		AddNewAssgnPgVrf.EnterAssignName();
		AddNewAssgnPgVrf.EnterGradeBy();
		AddNewAssgnPgVrf.EnterAssgnDueDate();
	}*/
/*	@When("Admin enters with invalid data in optional fields and clicks save button \\(Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) throws IOException 
	{
		AddNewAssgnPgVrf.WrongEnterProgramname();
		AddNewAssgnPgVrf.WrongEnterBatchnumber();
		AddNewAssgnPgVrf.WrongEnterAssignName();
		AddNewAssgnPgVrf.WrongEnterGradeBy();
		AddNewAssgnPgVrf.WrongEnterAssgnDueDate();
	}*/
	

/*	@When("Admin enters  data missing value in program name and clicks save button \\(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) 
	{
		AddNewAssgnPgVrf.MissingPgmNameMsg();
	}*/

	/*@Then("Program Name is missing")
	public void program_name_is_missing() 
	{
		AddNewAssgnPgVrf.MissingPgmNameMsg();

	}*/

	@When("Admin enters data missing value in Batch number and clicks save button \\(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
	public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) 
	{
		AddNewAssgnPgVrf.MissingBatchNumberMsg();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() 
	{
		AddNewAssgnPgVrf.MissingBatchNumberMsg();
	}

	/*@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() 
	{
		AddNewAssgnPgVrf.MissingAssgnNameMsg();
	}*/

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() 
	{
		AddNewAssgnPgVrf.MissingAssgnNameMsg();
	}

	@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
	public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() 
	{
		AddNewAssgnPgVrf.MissingDueDateMsg();
	}

	/*@Then("Assignment due date is missing")
	public void assignment_due_date_is_missing()
	{
		AddNewAssgnPgVrf.MissingDueDateMsg();
	}*/

/*	@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
	public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() 
	{
		AddNewAssgnPgVrf.MissingGradeByMsg();
	}*/

	/*@Then("Grade by is missing")
	public void grade_by_is_missing() 
	{
		AddNewAssgnPgVrf.MissingGradeByMsg();
	}*/

//	@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
//	public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Assignment cannot be created for the passed date")
//	public void assignment_cannot_be_created_for_the_passed_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	/*@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() 
	{
		AddNewAssgnPgVrf.ClickDatePicker();
	}*/

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() 
	{
	   
	}

//	@Then("selected date should be in  mm\\/dd\\/yyyy format")
//	public void selected_date_should_be_in_mm_dd_yyyy_format() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() 
	{
		AddNewAssgnPgVrf.ClickRightArrowDatePicker();
	}
//
//	@Then("Next month calender should visible")
//	public void next_month_calender_should_visible() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
/*	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month()
	{
		AddNewAssgnPgVrf.ClickLeftArrowDatePicker();

	}*/
//
//	@Then("previous month calender should visible")
//	public void previous_month_calender_should_visible() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
/*	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() 
	{
		AddNewAssgnPgVrf.ClickDatePicker();
	}*/

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() 
	{
		LocalDateTime currentdate = LocalDateTime.now();
	    String date = AddNewAssgnPgVrf.validateHighlightedDate();
	    Assert.assertEquals(date, currentdate);   
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() 
	{
		AddNewAssgnPgVrf.ValidateSelecteddateHighlighted();
	}
//
//	@When("Admin clicks date picker button and selects future date")
//	public void admin_clicks_date_picker_button_and_selects_future_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Admin should land on manage assignment page")
//	public void admin_should_land_on_manage_assignment_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks Cancel button entering values in the fields")
//	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
//	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
