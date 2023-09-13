package com.StepDefinitions;

import org.openqa.selenium.WebDriver;


import com.PageObjects.ManageClassPage_obj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageClass_SD {
	
	WebDriver driver = Helper.getDriver();
	
	ManageClassPage_obj MCP = new ManageClassPage_obj(driver);
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
	   MCP.Classbutton();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	    MCP.verifyGetUrl();
	}

	@Then("Get the response time for navigation from dashboard page to manage class page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
	    MCP.responseTimeChk();
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string) {
	    MCP.IconHeaderDisplay();
	}
	
	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	   MCP.ManageClassDetail();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    
		
	}
	
	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
	    MCP.DeleteIconDisplay();
	}
	
	@Then("Admin should see search bar on the class page")
	public void admin_should_see_search_bar_on_the_class_page() {
	    MCP.SearchBarDisplay();
	}

	@Then("Admin should see +Add New Class button on the class page")
	public void admin_should_see_add_new_class_button_on_the_class_page() {
	    MCP.AddNewClassDisplay();
	}

	@Then("Admin should see data table on the Manage Class Page With following column headers. \\(Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)")
	public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers_check_box_symbol_batch_id_class_no_class_date_class_topic_staff_id_description_comments_notes_recording_edit_delete() {
	    
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    MCP.EditIconchk();
	}
	
	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
		MCP.EditIconchk();
		
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	   MCP.DeleteIconchk();
	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() {
		 MCP.DeleteIconchk();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    MCP.IconHeaderDisplay();
	}

	@Then("Admin should see check box in the all rows  of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
	    
	}

	@Then("Above the footer Admin should see the text as {string} below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records  Note: with or without entries")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_pagey_ending_record_number_on_that_pagez_total_number_of_records_note_with_or_without_entries(String string) {
	    
		
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    MCP.paginationcontrols();
	}

	@Then("Admin should see the text with total number classes in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {
	    MCP.NoOfClass();
	}

	@When("Admin enters batch id into search box")
	public void admin_enters_batch_id_into_search_box() {
	    
	}

	@Then("Displays entries with that batch Id")
	public void displays_entries_with_that_batch_id() {
		MCP.PopUpBatchIDField();
	}

	@When("Admin enters batch id which is not existing the table into search box")
	public void admin_enters_batch_id_which_is_not_existing_the_table_into_search_box() {
	    
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
	    MCP.PopUpBatchIDField1(); 
	}

	@When("Admin enters class no into search box")
	public void admin_enters_class_no_into_search_box() {
	    
	}

	@Then("Displays entries with that class no")
	public void displays_entries_with_that_class_no() {
	    MCP.PopUpClassNumField();
	}

	@When("Admin enters class no which is not existing the table into search box")
	public void admin_enters_class_no_which_is_not_existing_the_table_into_search_box() {
	    MCP.PopUpClassNumField1();
	}

	@When("Admin enters class topic into search box")
	public void admin_enters_class_topic_into_search_box() {
	   
	}

	@Then("Displays entries with that  class topic")
	public void displays_entries_with_that_class_topic() {
	    MCP.PopUpClassTopicFeild() ;
	}

	@When("Admin enters class topic which is not existing the table into search box")
	public void admin_enters_class_topic_which_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters staff id into search box")
	public void admin_enters_staff_id_into_search_box() {
	    
	}

	@Then("Displays entries with that  staff id")
	public void displays_entries_with_that_staff_id() {
	   MCP. PopUpStaffIdField(); 
	}

	@When("Admin enters staff id which is not existing the table into search box")
	public void admin_enters_staff_id_which_is_not_existing_the_table_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters class date into search box")
	public void admin_enters_class_date_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Displays entries with that  class date")
	public void displays_entries_with_that_class_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters invalid class date into search box")
	public void admin_enters_invalid_class_date_into_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
