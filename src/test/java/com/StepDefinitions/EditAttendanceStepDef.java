package com.StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewAttendance;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.PageObjects.*;
public class EditAttendanceStepDef extends BaseClass{
	
	WebDriver driver = Helper.getDriver();
	/*AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(driver);
	AttendanceDetails1 adp1 = new AttendanceDetails1(driver);
	AddNewAttendance nap = new AddNewAttendance(driver);
	EditAttendance eap = new EditAttendance(driver);*/
	
	@When("Admin fills all the values and click save to update")
	public void admin_fills_all_the_values_and_click_save_to_update() throws IOException {
	    eap.UpdateAttendance();
	}

	@Then("Admin should see success message in popup window and sees updated attendance details in manage attendance details DB")
	public void admin_should_see_success_message_in_popup_window_and_sees_updated_attendance_details_in_manage_attendance_details_db() {
	   eap.UpdateSuccessMsg(); 
	}

	@When("Admin fills values missing program name and click save to update")
	public void admin_fills_values_missing_program_name_and_click_save_to_update() throws IOException {
	   eap.UpdateAttMissingPgmName();
	}

	@When("Admin fills values missing class name and click save to update")
	public void admin_fills_values_missing_class_name_and_click_save_to_update() throws IOException {
	    eap.UpdateAttMissingClsName();
	}

	@When("Admin fills values missing student name and click save to update")
	public void admin_fills_values_missing_student_name_and_click_save_to_update() throws IOException {
	    eap.UpdateAttMissingstuName();
	}

	@When("Admin fills values missing attendance and click save to update")
	public void admin_fills_values_missing_attendance_and_click_save_to_update() throws IOException {
	    eap.UpdateAttMissingAttendance();
	}

	@When("Admin fills values missing attendance date  and click save to update")
	public void admin_fills_values_missing_attendance_date_and_click_save_to_update() throws IOException {
	    eap.UpdateAttMissingattDate();
	}

	@When("Admin fills values with future date  and click save to update")
	public void admin_fills_values_with_future_date_and_click_save_to_update() throws IOException {
	    eap.UpdateAttinvaliddate();
	}

}
