package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.PageObjects.ClassDetail_obj;

public class ClassDetail_SD {
	
	 WebDriver driver = Helper.getDriver();
	
	ClassDetail_obj CD = new ClassDetail_obj(driver);
	
	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {
	    
	}

	@When("Admin click +Add New Class button")
	public void admin_click_add_new_class_button() {
		CD.AddNewClassbutton();
	}
	
	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
	    CD.AddClassPage();
	}

	@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    CD.AddClassDetail();
	}


	@Then("{int} textbox should be  present in Class details popup window")
	public void textbox_should_be_present_in_class_details_popup_window(Integer int1) {


	}

	@Then("Admin should see  dropdown option for Batch ID")
	public void admin_should_see_dropdown_option_for_batch_id() {
	    CD.BatchIdDropDown();
	}

	@Then("Admin should see  dropdown option for Staff Id")
	public void admin_should_see_dropdown_option_for_staff_id() {
	    CD.StaffIdDropDown();
		
	}

	@Then("Admin should see  calendar icon for class date")
	public void admin_should_see_calendar_icon_for_class_date() {
	    CD.CalendarIcon();
		
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	    CD.SaveButton();
		
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
	    CD.CancelButton();
		
	}

	@Then("Admin should see  close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
	    
		CD.CloseButton();
		
	}


}
