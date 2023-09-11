package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class UserPageDeleteUser {
	
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);

	@Given("Admin is on the dashboard page")
	public void admin_is_on_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin has navigated to {string} from the navigation bar")
	public void admin_has_navigated_to_from_the_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The delete icon on row level in the data table is enabled")
	public void the_delete_icon_on_row_level_in_the_data_table_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("An alert appears with {string} and {string} options")
	public void an_alert_appears_with_and_options(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the {string} option on the confirmation alert")
	public void admin_clicks_the_option_on_the_confirmation_alert(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("A {string} alert pops up")
	public void a_alert_pops_up(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user is no more available in the data table")
	public void the_user_is_no_more_available_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin has triggered the delete confirmation alert")
	public void admin_has_triggered_the_delete_confirmation_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the {string} option")
	public void admin_clicks_the_option(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user is still listed in the data table")
	public void the_user_is_still_listed_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
