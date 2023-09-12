package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewAttendance;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.EditAttendance;
import com.PageObjects.ManageAttendence;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import com.PageObjects.*;
public class DeleteAttendanceStepDef {
	
	WebDriver driver = Helper.getDriver();
	AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(driver);
	AttendanceDetails1 adp1 = new AttendanceDetails1(driver);
	AddNewAttendance nap = new AddNewAttendance(driver);
	EditAttendance eap = new EditAttendance(driver);
	DeleteAttendance dp = new DeleteAttendance(driver);
	
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	  dp.ValidateDeleteAlert();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
	   dp.DisplayAlert();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
	   dp.yesnoEnabled();
	}

	@Given("Admin is in delete alert after clicking row level delete button")
	public void admin_is_in_delete_alert_after_clicking_row_level_delete_button() {
	    dp.DisplayAlert();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    dp.ClickYes();
	}

	@Then("Success message and selected attendance details are deleted from the data table")
	public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table() {
	    String actualtext = dp.SuccessMsg();
	    Assert.assertEquals(actualtext, "succesful Attendance Deleted");
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	    dp.ClickNo();
	}

	@Then("Redirected attendance page and selected attendance details are not deleted from the data table")
	public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
	   dp.Navigatetoattemdancepage();
	}

}
