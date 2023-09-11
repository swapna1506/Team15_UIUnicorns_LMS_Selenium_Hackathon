package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class UserPageEditNewUser {
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);
	
	@Given("The edit icon on row level in the data table is enabled")
	public void the_edit_icon_on_row_level_in_the_data_table_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("A popup with user details should appear")
	public void a_popup_with_user_details_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin triggers the user details popup by clicking the edit icon")
	public void admin_triggers_the_user_details_popup_by_clicking_the_edit_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin updates the fields with valid values and clicks submit")
	public void admin_updates_the_fields_with_valid_values_and_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The updated user details should be reflected in the data table")
	public void the_updated_user_details_should_be_reflected_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin updates fields with invalid values and clicks submit")
	public void admin_updates_fields_with_invalid_values_and_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin erases data from a mandatory field and clicks submit")
	public void admin_erases_data_from_a_mandatory_field_and_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin erases data from the description field and clicks submit")
	public void admin_erases_data_from_the_description_field_and_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The updated user details, without the description, should be reflected in the data table")
	public void the_updated_user_details_without_the_description_should_be_reflected_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
