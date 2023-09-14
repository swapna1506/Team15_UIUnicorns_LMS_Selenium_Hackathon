package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;
import com.PageObjects.DashboardPageLogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class DashboardPageLogoutStep {

	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPageLogoutPage dashboardPageLogout = new DashboardPageLogoutPage(driver);
	DashboardPage dashboardPage =new DashboardPage(driver);
		
	@Given("Admins is in dashboard page after logged in")
	public void admins_is_in_dashboard_page_after_logged_in() {
		dashboardPage.visit_LMS_url();
		 Assert.assertEquals("LMS Main Page", dashboardPage.getCurrentPageTitle());
	}

	@When("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
	    dashboardPageLogout.clickLogoutButton();
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
	    Assert.assertEquals("Please login to LMS application", dashboardPageLogout.getPageTitle()); // Assuming there's a method isOnLoginPage in your LoginPage object
	}

}
