package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class UserPageValidation {
	
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);

	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see {string} in the URL")
	public void admin_should_see_in_the_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a {string} icon button that is disabled")
	public void admin_should_see_a_icon_button_that_is_disabled(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the {string} button")
	public void admin_should_see_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the search text box")
	public void admin_should_see_the_search_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have an edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_an_edit_icon_that_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
