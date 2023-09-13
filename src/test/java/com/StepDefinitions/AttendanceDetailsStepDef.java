package com.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PageObjects.AttendanceDetails;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;
import com.PageObjects.ManageAttendence;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AttendanceDetailsStepDef extends BaseClass {
	WebDriver driver = Helper.getDriver();

	
	@Given("Admin is in manage attendance page")
	public void admin_is_in_manage_attendance_page() {
	  mp.clickattendenceBtn(); 
	}

	@When("Admin clicks + a new attendance")
	public void admin_clicks_a_new_attendance() {
	    adp.ClickNewAttendance();
	}

	@SuppressWarnings("deprecation")
	@Then("Admin should dee correct spellings in the label")
	public void admin_should_dee_correct_spellings_in_the_label() {
		
		String attdettext = adp.ValidateAttendanceDetails();
		Assert.assertEquals(attdettext, "Attendance Details");
		
		String pgmtext = adp.ValidateProgramName();
		Assert.assertEquals(pgmtext, "Program Name");
		
		String classtext = adp.ValidateClassName();
		Assert.assertEquals(classtext, "Class Name");
		
		String stutext = adp.ValidateStudentName();
		Assert.assertEquals(stutext, "Student Name");
		
		String atttext = adp.ValidateAttendance();
		Assert.assertEquals(atttext, "Attendance");
		
		String attdatetext = adp.ValidateAttendancedate();
		Assert.assertEquals(attdatetext, "AttendanceDate");
		
	}

	@Then("{int} dropdown should be preasent")
	public void dropdown_should_be_preasent(Integer int1) {
		adp.ValidateDropdown();
	    	}

	@Then("Admin should see close button on attendance details pop up window")
	public void admin_should_see_close_button_on_attendance_details_pop_up_window() {
	    adp.ValidateClosebutton();
	}

	@Then("Close button should on the top right corner")
	public void close_button_should_on_the_top_right_corner() {
	   adp.validateAlignmentClose();
	}

	@Then("First dropdown box {string} text  should be present")
	public void first_dropdown_box_text_should_be_present(String string) {
	    adp.ValidateProgramNameDropdown();
	}

	@Then("Second dropdown box {string} text  should be present")
	public void second_dropdown_box_text_should_be_present(String string) {
	    adp.ValidateClassNameDropdown();
	}

	@Then("Third dropdown box {string} text  should be present")
	public void third_dropdown_box_text_should_be_present(String string) {
	    adp.ValidateStudentsNameDropdown();
	}

	@Then("Fourth dropdown box {string} text  should be present")
	public void fourth_dropdown_box_text_should_be_present(String string) {
	    adp.ValidateAttendanceDropdown();
	}

	@Then("Admin  should text in gray color")
	public void admin_should_text_in_gray_color() {
	   adp.validateColor();
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	   adp.validateSaveButton();
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
	   adp.validateCancelButton();
	}

	@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date")
	public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date() {
	   adp.VerifyDetailsOrder();
	}


}
