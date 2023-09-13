package com.StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.PageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaginationAttendanceStepDef extends BaseClass{
	
	WebDriver driver = Helper.getDriver();
	
	
	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
	    pa.ClickAttendance();
	}
	
	@Then("Data table should display first page when entries available")
	public void data_table_should_display_first_page_when_entries_available() {
	    pa.DisplayfirstPage();
	}
	

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	   pa.EnableRightarrow();
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	    pa.DisableLeftArrow();
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
	    pa.RightLeftArrowsPage2();
	}

	@Then("Left arrow should be enabled in page two when entries are more than {int} available")
	public void left_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
	   pa.RightLeftArrowsPage2();
	}
	
	@Then("Data table should display  page one when entries available")
	public void data_table_should_display_page_one_when_entries_available() {
	   pa.DisableRightArrow();
	}



	@Then("when entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
	    pa.EnableDisablePagination();
	}

	@Then("when entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
		
		pa.EnableDisablePagination();
	    
	}

	@Given("Admin is in attendance details pop up after clicking +Add New attendance")
	public void admin_is_in_attendance_details_pop_up_after_clicking_add_new_attendance() {
	   pa.newattendance();
	}

	@When("Admin creates {int} new attendance")
	public void admin_creates_new_attendance(Integer int1) throws IOException {
	    nap.create6NewAttendance();
	}

	@Then("when total attendance entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_attendance_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
	    pa.NextPageEnable();
	}

	@When("Admin creates less than or equal to {int} new attendance")
	public void admin_creates_less_than_or_equal_to_new_attendance(Integer int1) throws IOException {
	 nap.validateAddNewAttendance();   
	}

	@Then("when total attendance entries  {int} or below next page is disabled")
	public void when_total_attendance_entries_or_below_next_page_is_disabled(Integer int1) {
	    pa.disablerightarrow();
	}

}
