package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewAttendance;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.EditAttendance;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import com.PageObjects.*;
public class DeleteAttendanceStepDef extends BaseClass{
	
	public DeleteAttendanceStepDef(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = Helper.getDriver();
	
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	  dap.ValidateDeleteAlert();;
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
	   dap.DisplayAlert();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
	   dap.yesnoEnabled();
	}

	@Given("Admin is in delete alert after clicking row level delete button")
	public void admin_is_in_delete_alert_after_clicking_row_level_delete_button() {
	    dap.DisplayAlert();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    dap.ClickYes();
	}

	@Then("Success message and selected attendance details are deleted from the data table")
	public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table() {
	    String actualtext = dap.SuccessMsg();
	    Assert.assertEquals(actualtext, "succesful Attendance Deleted");
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	    dap.ClickNo();
	}

	@Then("Redirected attendance page and selected attendance details are not deleted from the data table")
	public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
	   dap.Navigatetoattemdancepage();
	}

}
