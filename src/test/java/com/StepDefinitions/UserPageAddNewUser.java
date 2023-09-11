package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class UserPageAddNewUser {
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);
	
	@Given("Admin is logged on the LMS portal")
	public void admin_is_logged_on_the_lms_portal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks {string} from the navigation bar")
	public void admin_clicks_from_the_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks the {string} button")
	public void admin_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("A popup with user details appears")
	public void a_popup_with_user_details_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The popup should have the following text boxes:")
	public void the_popup_should_have_the_following_text_boxes(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The popup should have the following drop-downs:")
	public void the_popup_should_have_the_following_drop_downs(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin fill in all fields except MN, LinkedIn Url, Email, User comments, Undergraduate, Postgraduate, and Time zone with valid values and click submit")
	public void admin_fill_in_all_fields_except_mn_linked_in_url_email_user_comments_undergraduate_postgraduate_and_time_zone_with_valid_values_and_click_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The newly added user should be visible in the data table on the Manage User page")
	public void the_newly_added_user_should_be_visible_in_the_data_table_on_the_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin fill in all fields with valid values and click submit")
	public void admin_fill_in_all_fields_with_valid_values_and_click_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enter invalid values in any of the fields")
	public void admin_enter_invalid_values_in_any_of_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("An error message should appear")
	public void an_error_message_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin leave any of the mandatory fields blank")
	public void admin_leave_any_of_the_mandatory_fields_blank() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
