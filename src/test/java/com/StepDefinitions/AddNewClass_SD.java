package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewClass_obj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewClass_SD {
	
	
	
	WebDriver driver = Helper.getDriver();
	
	AddNewClass_obj objanw = new AddNewClass_obj(driver);
	
	@Given("Admin is in  class detail popup window")
	public void admin_is_in_class_detail_popup_window() {
	    objanw.checkpopmsg();
	}
	@When("Admin clicks  Batch ID dropdown")
	public void admin_clicks_batch_id_dropdown() {
		objanw.batchidDrpdwn();
	}
	@Then("Batch id in the drop down should match with Batch id manage batch page table")
	public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	    objanw.checkbatchdrpmsg();
	}
	@When("Admin enters all mandatory field values with valid data and clicks save button {string} and {string}")
	public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_and(String string, String string2) {
	    objanw.allfields();
	}
	@Then("Admin should see new class details is added in the data table")
	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
	    objanw.checfieldsmsg();
	}
	@When("Admin enters all mandatory field values with invalid data and clicks save button {string} and {string}")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_and(String string, String string2) {
	    objanw.savebtnclickmth();
	}
	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	    objanw.alertmsg();
	}
	@When("Admin enters values in all fields with valid data and clicks save button {string} and {string}")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_and(String string, String string2) {
		   objanw.savebtnclickmth();
	}
	@When("Admin enters with invalid data in optional fields and clicks save button {string} and {string}")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_and(String string, String string2) {
		   objanw.savebtnclickmth();
	}
	@When("Admin enters  data missing value in Batch ID and clicks save button {string} and {string}")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_and(String string, String string2) {
		   objanw.savebtnclickmth();
	}
	@Then("Batch Id is missing")
	public void batch_id_is_missing() {
	    objanw.checkbatchdrpmsg();
	}
	@When("Admin enters data missing value in No of class and clicks save button {string} and {string}")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_and(String string, String string2) {
		objanw.checkbatchdrpmsg();
	}
	@Then("No of classes is missing")
	public void no_of_classes_is_missing() {
		objanw.checknoclasspmsg();
	}
	@When("Admin enters data missing value in  class date and clicks save button {string} and {string}")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_and(String string, String string2) {
		objanw.savebtnclickmth();
	}
	@Then("class date is missing")
	public void class_date_is_missing() {
		objanw.checkclasdtmsg();
	}
	@When("Admin enters data missing value in staff id and clicks save button {string} and {string}")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_and(String string, String string2) {
		objanw.savebtnclickmth();
	}
	@Then("staff id is missing")
	public void staff_id_is_missing() {
		objanw.checkstaffidmsg();
	}
	@When("Admin enters passed date in the class date field and clicks save button {string} and {string}")
	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_and(String string, String string2) {
		objanw.savebtnclickmth();
	}
	@Then("class cannot be  created for the passed date")
	public void class_cannot_be_created_for_the_passed_date() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		objanw.checkclasdtmsg();
	}
	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		objanw.checkclasdtmsg();
	}
	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
		objanw.checkclasdtmsg();
	}
	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		objanw.checkclasdtmsg();
	}
	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    objanw.datepickerclickmeth();
	}
	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		objanw.checkclasdtmsg();
	}
	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
		objanw.checkclasdtmsg();
	}
	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    objanw.cancelclkmeth();
	}
	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
	}
	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		objanw.cancelclkmeth();
	}
	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
	    objanw.mangecalssnoentrychk();
	}
	
	
	
//	@Given("Admin is in  class detail popup window")
//	public void admin_is_in_class_detail_popup_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks  Batch ID dropdown")
//	public void admin_clicks_batch_id_dropdown() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Batch id in the drop down should match with Batch id manage batch page table")
//	public void batch_id_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//
//	@Then("Admin should see new class details is added in the data table")
//	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	
//	@Then("class cannot be  created for the passed date")
//	public void class_cannot_be_created_for_the_passed_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks date from date picker")
//	public void admin_clicks_date_from_date_picker() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("selected date should be their in class date text box")
//	public void selected_date_should_be_their_in_class_date_text_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("selected date should be in  mm\\/dd\\/yyyy format")
//	public void selected_date_should_be_in_mm_dd_yyyy_format() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks right arrow in the date picker near month")
//	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Next month calender should visible")
//	public void next_month_calender_should_visible() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks left arrow in the date picker near month")
//	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("previous month calender should visible")
//	public void previous_month_calender_should_visible() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks date picker button")
//	public void admin_clicks_date_picker_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Admin should see current date is highled in the date picker")
//	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin clicks date picker button and selects future date")
//	public void admin_clicks_date_picker_button_and_selects_future_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Admin should see selected date is highled in the date picker")
//	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
//	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Given("Admin is in Manage class page Admin is in Edit class detail popup window")
//	public void admin_is_in_manage_class_page_admin_is_in_edit_class_detail_popup_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin clicks Edit button in data table")
//	public void admin_clicks_edit_button_in_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Edit popup window appears with heading Class Details")
//	public void edit_popup_window_appears_with_heading_class_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Admin clicks Edit button from one of the row in data table")
//	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Edit popup window appears with same row values in the all fields")
//	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
















	
























}
