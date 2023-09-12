package com.StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.ManageAttendence;
import com.Utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.PageObjects.AddNewAttendance;

public class AddNewAttendancestepDef {
	WebDriver driver = Helper.getDriver();
	AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(driver);
	AttendanceDetails1 adp1 = new AttendanceDetails1(driver);
	AddNewAttendance nap = new AddNewAttendance(driver);
	
	@When("Admin fills all the values and click save")
	public void admin_fills_all_the_values_and_click_save() throws IOException {
	    nap.validateAddNewAttendance();
	}

	@Then("Admin should see success message in popup window and sees new attendance details in manage attendance details DB")
	public void admin_should_see_success_message_in_popup_window_and_sees_new_attendance_details_in_manage_attendance_details_db() {
	    nap.validatesuccessmsg();
	}

	@When("Admin fills values missing program name and click save")
	public void admin_fills_values_missing_program_name_and_click_save() throws IOException {
	    nap.NewAttendanceMissingPgmName();
	}

	@Then("Program name is missing")
	public void program_name_is_missing() {
	    nap.MissingPgmNameMsg();
	}

	@When("Admin fills values missing class name and click save")
	public void admin_fills_values_missing_class_name_and_click_save() throws IOException {
	   nap.NewAttendanceMissingClsName();
	}

	@Then("class name is missing")
	public void class_name_is_missing() {
	    nap.MissingclsNameMsg();
	}

	@When("Admin fills values missing student name and click save")
	public void admin_fills_values_missing_student_name_and_click_save() {
	   nap.MissingstuNameMsg();
	}

	@Then("student name is missing")
	public void student_name_is_missing() {
	    nap.MissingstuNameMsg();
	}

	@When("Admin fills values missing attendance and click save")
	public void admin_fills_values_missing_attendance_and_click_save() throws IOException {
	    nap.NewAttendanceMissingAtt();
	}

	@Then("Attendance is missing")
	public void attendance_is_missing() {
	    nap.MissingattMsg();
	}

	@When("Admin fills values missing attendance date  and click save")
	public void admin_fills_values_missing_attendance_date_and_click_save() throws IOException {
	    nap.NewAttendanceMissingAttDate();
	}

	@Then("Attendance date is missing")
	public void attendance_date_is_missing() {
	   nap.MissingattMsg();
	}

	@When("Admin fills values with future date  and click save")
	public void admin_fills_values_with_future_date_and_click_save() throws IOException {
	    nap.validateAddNewAttendanceFutureDate();
	}

	@Then("Invalidate attendance date")
	public void invalidate_attendance_date() {
	    nap.InvalidattDateMsg();
	}
}
