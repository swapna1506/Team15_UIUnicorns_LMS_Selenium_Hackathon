package com.StepDefinitions;
import org.openqa.selenium.WebDriver;

import com.Utils.Helper;
import com.PageObjects.ClassDetail_obj;
import com.PageObjects.Pagination_obj;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pagination_SD {
	
	
	 WebDriver driver = Helper.getDriver();
	Pagination_obj objpg = new Pagination_obj(driver);
	
	@When("Admin clicks class button on the navigation bar")
	public void admin_clicks_class_button_on_the_navigation_bar() {
		objpg.ClassbtnclickMethod();
	}
	@Then("Data table should display one page  when entries available")
	public void data_table_should_display_one_page_when_entries_available() {
	    objpg.dataMessagedisplayed();
	}
	@Then("Right arrow should be enabled in page one  when entries are more than five available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_five_available() {
	    objpg.rightarrowchk();
	}
	@Then("Left arrow should be disabled in page one  when entries are more than five available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_five_available() {
	    objpg.leftarrowchk();
	}
	@Then("Right arrow should be enabled in page two when entries are more than ten available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_ten_available() {
	    objpg.rightdblClick();
	}
	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
	    objpg.leftarrowchk();
	}
	@Then("Data table should display  pageone when entries available")
	public void data_table_should_display_pageone_when_entries_available() {
		  objpg.dataMessagedisplayed();
	}
	@Then("if entries are more than five in data table pagination controls enabled")
	public void if_entries_are_more_than_five_in_data_table_pagination_controls_enabled() {
	    objpg.arrenabledmethd();
	}
	@Then("if entries are less than five in data table pagination controls disabled")
	public void if_entries_are_less_than_five_in_data_table_pagination_controls_disabled() {
	    objpg.arrdisbledmethd();
	}
	@Given("Admin is in add class details popup window")
	public void admin_is_in_add_class_details_popup_window() {
	}
	@When("Admin creates six new class")
	public void admin_creates_six_new_class() {
	}
	@Then("If total class entries above five next page is enabled")
	public void if_total_class_entries_above_five_next_page_is_enabled() {
	}
	@When("Admin creates less than or equal to five new class")
	public void admin_creates_less_than_or_equal_to_five_new_class() {
	}
	@Then("If total class entries  five or below next page is disabled")
	public void if_total_class_entries_five_or_below_next_page_is_disabled() {
		objpg.arrdisbledmethd();
	}
}



//@Then("Data table should display {int} page  when entries available")
//public void data_table_should_display_page_when_entries_available(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
//public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//@Then("Left arrow should be disabled in page one  when entries are more than {int} available")
//public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//@Then("Right arrow should be enabled in page two when entries are more than {int} available")
//public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//@Then("Left arrow should be enabled in page two")
//public void left_arrow_should_be_enabled_in_page_two() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//
//@Then("if entries are more than {int} in data table pagination controls enabled")
//public void if_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//@Then("if entries are less than {int} in data table pagination controls disabled")
//public void if_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Given("Admin is in add class details popup window")
//public void admin_is_in_add_class_details_popup_window() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@When("Admin creates {int} new class")
//public void admin_creates_new_class(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@Then("If total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
//public void if_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//
//@When("Admin creates less than or equal to {int} new class")
//public void admin_creates_less_than_or_equal_to_new_class(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//@Then("If total class entries  {int} or below next page is disabled")
//public void if_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//}
