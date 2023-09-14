package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewAttendance;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.DeleteAttendance;
import com.PageObjects.EditAttendance;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import com.PageObjects.*;
public class DeleteMultipleAttendanceStepDef extends BaseClass{
	

	public DeleteMultipleAttendanceStepDef(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = Helper.getDriver();
	
	
	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	   dmp.ClickCheckbox();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
	   dmp.EnableDelete(); 
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() {
	    dmp.ClickCheckbox();
	    
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	    dmp.ClickMultipleRow();
	}

	@Then("Admin should see tick mark in check box  of the selected rows")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
	   dmp.SelectCheckbox();
	}

	@Given("Admin is in alert after Admin clicks delete button under header after selecting the check box in the data")
	public void admin_is_in_alert_after_admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data() {
	    dmp.Alertbox();
	}

	@Then("Success message and selected attendance detail are deleted from the data table")
	public void success_message_and_selected_attendance_detail_are_deleted_from_the_data_table() {
		String actualtext = dmp.ConfirmsingleDeletionMsg();
	    Assert.assertEquals(actualtext, "succesful Attendance Deleted");
	}

	@Then("Redirected to attendance page and selected attendance details are not deleted from the data table")
	public void redirected_to_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
	    dmp.ConfirmMsg();
	}

	@Given("Admin is in alert after Admin clicks delete button under header after selecting the multiple check box in the data table")
	public void admin_is_in_alert_after_admin_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {
	    dmp.AlertMultipleCheckBox();
	}

	@Then("Success message and validate particular attendance details are deleted from the data table")
	public void success_message_and_validate_particular_attendance_details_are_deleted_from_the_data_table() {
	    dmp.ConfirmMsg();
	}

}
