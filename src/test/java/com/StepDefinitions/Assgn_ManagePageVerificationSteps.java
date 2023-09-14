package com.StepDefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.Assgn_ManagePgVerificationPage;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assgn_ManagePageVerificationSteps 
{
	private WebDriver driver = Helper.getDriver();
	private Assgn_ManagePgVerificationPage AssgnMngPgVrf = new Assgn_ManagePgVerificationPage();
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() 
	{
		AssgnMngPgVrf.openLmlPortal();
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) 
	{
		AssgnMngPgVrf.clickOnNavigationBar();
		}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) 
	{
		Assert.assertEquals("User cannot see url Manage Assignment","Manage assignment",ConfigReader.getPageurl());		
	}

	@Then("Get the response time for navigation from dashboard page to manage assignment page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page()
	{
		AssgnMngPgVrf.getResponsetime();
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string)
	{
		AssgnMngPgVrf.clickOnAssignmentBtn();
		String HeaderName=AssgnMngPgVrf.getPageHeader();
		Assert.assertEquals("User cannot see header in Manage Assignment","Manage assignment",HeaderName);			
	}

	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) 
	{
		AssgnMngPgVrf.clickOnNavigationBar();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields()
	{
		 String stuText = AssgnMngPgVrf.validateStuField();
		    Assert.assertEquals(stuText, "Student");
		    
		    String pgmText = AssgnMngPgVrf.validateProgramField();
		    Assert.assertEquals(pgmText, "Program");
		    String batchText = AssgnMngPgVrf.validateBatchField();
		    Assert.assertEquals(batchText, "Batch");
		    
		    String classText = AssgnMngPgVrf.validateClassField();
		    Assert.assertEquals(classText, "Class");
		    
		    String userText = AssgnMngPgVrf.validateUserField();
		    Assert.assertEquals(userText, "User");
		    
		    String assText= AssgnMngPgVrf.validateAssignmentField();
		    Assert.assertEquals(assText, "Assignment");
		    
		    String attText = AssgnMngPgVrf.validateAttendanceField();
		    Assert.assertEquals(attText, "Attendance");
		    
		    String logoutText = AssgnMngPgVrf.validateLogoutField();
		    Assert.assertEquals(logoutText, "Logout");
		    
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) 
	{
		boolean disabledValue=AssgnMngPgVrf.DeleteIconDisabled();
		Assert.assertEquals("diabled delete icon not seen","True", disabledValue);
	}
//
	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() 
	{
		boolean searchBarvalue = AssgnMngPgVrf.searchBar();
		Assert.assertEquals("Search Bar on Manage assignment is not seen", "True",searchBarvalue);
	}
	
//
	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() 
	{
		boolean SeeNewAssgnValue=AssgnMngPgVrf.seeNewAssgBtn();
		Assert.assertEquals("New Assignmnet button not seen", "true",SeeNewAssgnValue);
	}
//
	@Then("Admin should see data table on the manage assignment page With following column headers. \\(check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers_check_box_symbol_assignment_name_assignment_description_assignment_date_assignment_grade_edit_delete() 
		{
			List Elements = AssgnMngPgVrf.ValidateColumnHeader();
			Assert.assertEquals(Elements, "(check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)");
	   	}
	@Then("Edit Icon in each row of data table only when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() 
	{
		boolean EditIconPresent=AssgnMngPgVrf.validateEditIcon();
		Assert.assertTrue(EditIconPresent);
	}
	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() 
	{
		boolean EditIconNotPresent=AssgnMngPgVrf.validateEditIcon();
		Assert.assertTrue(EditIconNotPresent);

	}	
	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() 
	{
		boolean DeleteIconpresent =AssgnMngPgVrf.validateDeleteIcon();
		Assert.assertTrue(DeleteIconpresent);

	}
	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() 
	{
		boolean DeleteIconNotpresent = 	AssgnMngPgVrf.validateDeleteIcon();
		Assert.assertTrue(DeleteIconNotpresent);
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() 
	{
		boolean SortIconPresent =AssgnMngPgVrf.validateSortIcon();
		Assert.assertTrue(SortIconPresent);		
	 }

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() 
	{
		boolean paginationctrls=AssgnMngPgVrf.validatePagination();
		Assert.assertTrue(paginationctrls);		
	}

	@Given("Admin is on manage assignment page")
	public void admin_is_on_manage_assignment_page() 
	{
		AssgnMngPgVrf.ManageAssignPageUrl();
	}

	@Then("Admin should see the text with total number assignments in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table(String string) 
	{
		String totalAssInDataTable= AssgnMngPgVrf.TotalAssgInDataTable();
		Assert.assertEquals(" In total there are number of assignments", totalAssInDataTable);
	}

	@When("Admin enters assignment name into search box")
	public void admin_enters_assignment_name_into_search_box() throws IOException
	{
		AssgnMngPgVrf.EnterAssignName();
	}

//	@Then("Displays entries with that assignment name")
//	public void displays_entries_with_that_assignment_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
	@When("Admin enters assignment name is not existing the table into search box")
	public void admin_enters_assignment_name_is_not_existing_the_table_into_search_box() throws IOException 
	{
		AssgnMngPgVrf.EnterWrongAssignName();
	}

//	@Then("Displays empty details in the data table")
//	public void displays_empty_details_in_the_data_table() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Admin enters assignment description into search box")
	public void admin_enters_assignment_description_into_search_box() throws IOException 
	{
		AssgnMngPgVrf.EnterAssignDescription();
	}

//	@Then("Displays entries with that assignment description")
//	public void displays_entries_with_that_assignment_description() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Admin enters assignment description which is not existing the table into search box")
	public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box() throws IOException 
	{
		AssgnMngPgVrf.EnterWrongAssignDescription();
	}

//	@When("Admin enters assignment due date into search box")
//	public void admin_enters_assignment_due_date_into_search_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Displays entries with that assignment due date")
//	public void displays_entries_with_that_assignment_due_date() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin enters assignment due date which is not existing the table into search box")
//	public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin enters grade value  into search box")
//	public void admin_enters_grade_value_into_search_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Displays entries with that assignment  grade")
//	public void displays_entries_with_that_assignment_grade() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Admin enters grade value which is not existing the table into search box")
//	public void admin_enters_grade_value_which_is_not_existing_the_table_into_search_box() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
