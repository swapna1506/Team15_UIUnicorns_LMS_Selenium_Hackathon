package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageObjects.DashboardPage;
import com.PageObjects.StudentPage;
import com.Utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class StudentPageHeaderValidation {
	
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	StudentPage stPg =new StudentPage(driver);
	DashboardPage dashboardPage =new DashboardPage(driver);
	
	@Given("Admin is logged into the LMS portal")
	public void admin_is_logged_into_the_lms_portal() {
	  //open dashboard url
		dashboardPage.visit_LMS_url();
		//click login
		dashboardPage.clickMainPageLogin_btn();
		//enter u/pswd
		dashboardPage.enterUsername(ConfigReader.getUserName());
    	dashboardPage.enterPassword(ConfigReader.getPassword());
		//click login
    	dashboardPage.clickLogin();
		//click student link 
    	
	}

	@Given("Admin is on the student details page")
	public void admin_is_on_the_student_details_page() {
		dashboardPage.clickStudentLink();
	    Assert.assertEquals("Student Details Page", dashboardPage.getCurrentPageTitle());
	}

	@When("Admin clicks on the Program link on the student page")
	public void admin_clicks_on_the_program_link_on_the_student_page() {
		stPg.clickProgramLink();
		 Assert.assertEquals("Manage Program Page", stPg.getCurrentPageTitle());
	}
		
	@Then("Admin is redirected to the Program page")
	public void admin_is_redirected_to_the_program_page() {
		Assert.assertEquals("Manage Program Page", stPg.getCurrentPageTitle());
	
	}

	@When("Admin clicks on the Batch link on the student page")
	public void admin_clicks_on_the_batch_link_on_the_student_page() {
		stPg.clickBatchLink();
		 Assert.assertEquals("Manage Batches Page", stPg.getCurrentPageTitle());
	}

	@Then("Admin is redirected to the Batch page")
	public void admin_is_redirected_to_the_batch_page() {
		Assert.assertEquals("Manage Batches Page", stPg.getCurrentPageTitle());
	}

	@When("Admin clicks on the Class link on the student page")
	public void admin_clicks_on_the_class_link_on_the_student_page() {
	   stPg.clickClassLink();
	   Assert.assertEquals("Manage Class Page", stPg.getCurrentPageTitle());
	}

	@Then("Admin is redirected to the Class page")
	public void admin_is_redirected_to_the_class_page() {
		Assert.assertEquals("Manage Class Page", stPg.getCurrentPageTitle());
	}

	@When("Admin clicks on the User link on the student page")
	public void admin_clicks_on_the_user_link_on_the_student_page() {
	    stPg.clickUserLink();
	    Assert.assertEquals("Manage User Page", stPg.getCurrentPageTitle());
	}

	@Then("Admin is redirected to the Student page")
	public void admin_is_redirected_to_the_student_page() {
		 Assert.assertEquals("Manage User Page", stPg.getCurrentPageTitle());
	}

	@When("Admin clicks on the Assignment link on the student page")
	public void admin_clicks_on_the_assignment_link_on_the_student_page() {
	    stPg.clickAssignmentLink();
	    Assert.assertEquals("Manage Assignment Page", stPg.getCurrentPageTitle());
	}

	@Then("Admin is redirected to the Assignment page")
	public void admin_is_redirected_to_the_assignment_page() {
		Assert.assertEquals("Manage Assignment Page", stPg.getCurrentPageTitle());
	}

	@When("Admin clicks on the Attendance link on the student page")
	public void admin_clicks_on_the_attendance_link_on_the_student_page() {
		 	stPg.clickAttendanceLink();
		    Assert.assertEquals("Manage Attendance Page", stPg.getCurrentPageTitle());
	}

	@Then("Admin is redirected to the Attendance page")
	public void admin_is_redirected_to_the_attendance_page() {
		Assert.assertEquals("Manage Attendance Page", stPg.getCurrentPageTitle());
	}

	@When("Admin clicks on the Logout link on the student page")
	public void admin_clicks_on_the_logout_link_on_the_student_page() {
	stPg.clickLogoutLink();
	Assert.assertEquals("Please login to LMS Application", stPg.getCurrentPageTitle());
	
	}

	@Then("Admin is redirected to the Login page")
	public void admin_is_redirected_to_the_logout_page() {
		Assert.assertEquals("Please login to LMS Application", stPg.getCurrentPageTitle());
	}

}
