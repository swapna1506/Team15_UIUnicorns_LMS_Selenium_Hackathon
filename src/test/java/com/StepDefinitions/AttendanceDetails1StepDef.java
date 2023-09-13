package com.StepDefinitions;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttendanceDetails1StepDef extends BaseClass {
	
	WebDriver driver = Helper.getDriver();
	/*AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(Helper.getDriver());
	AttendanceDetails1 adp1 = new AttendanceDetails1(driver);*/
	
	@Given("Admin is in  attendance details popup window")
	public void admin_is_in_attendance_details_popup_window() {
		adp.ClickNewAttendance();
	}

	@When("Admin clicks  program name dropdown")
	public void admin_clicks_program_name_dropdown() {
	    adp1.ClickProgramnamedropdown();
	}

	@Then("Program Name in the drop down should match with  program name in  manage program page table")
	public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table() {
	    adp1.verifyAllprogramNames();
	}

	@When("Admin clicks class name dropdown")
	public void admin_clicks_class_name_dropdown() {
	   adp1.ClickClassnamedropdown();
	}

	@Then("Class Name in the drop down should match with  class name in  manage class page table")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table() {
	    adp1.verifyAllclassNames();
	}

	@When("Admin clicks attendance dropdown")
	public void admin_clicks_attendance_dropdown() {
	   adp1.ClickAttendancedropdown();
	}

	@Then("Attendance field should have keywords such as - present, absent, late, excused")
	public void attendance_field_should_have_keywords_such_as_present_absent_late_excused(List attlist) {
	    List list = adp1.verifyAllattendances();
	   ArrayList<String> actuallist = new ArrayList<>();
	   actuallist.add("present");
	   actuallist.add("absent");
	   actuallist.add("late");
	   actuallist.add("excused");
	   Assert.assertTrue(actuallist.equals(list));
	   
	}
	@Then("Admin should see correct spellings in dropdown text")
	public void admin_should_see_correct_spellings_in_dropdown_text() {
		 List list = adp1.verifyAllattendances();
		   ArrayList<String> actuallist = new ArrayList<>();
		   actuallist.add("present");
		   actuallist.add("absent");
		   actuallist.add("late");
		   actuallist.add("excused");
		   Assert.assertTrue(actuallist.equals(list));
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
	    adp1.ClickDatePicker();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    adp1.ValidateSelecteddate();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
	   adp1.ValidateDateFormat(); 
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	   adp1.validateRightarrow();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	    Assert.assertEquals(driver.getTitle(), "next month");
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	   adp1.validateLeftarrow();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		  Assert.assertEquals(driver.getTitle(), "Previous month");
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	    adp1.ClickDatePicker();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		LocalDateTime currentdate = LocalDateTime.now();
	    String date = adp1.validateHighlightedDate();
	    Assert.assertEquals(date, currentdate);
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
	    adp1.ValidateHighlighteddateSelect();
	}

}
