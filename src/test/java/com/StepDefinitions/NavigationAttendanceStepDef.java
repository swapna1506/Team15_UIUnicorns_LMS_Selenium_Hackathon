package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.AddNewAttendance;
import com.PageObjects.AttendanceDetails;
import com.PageObjects.AttendanceDetails1;
import com.PageObjects.DeleteAttendance;
import com.PageObjects.DeleteMultipleAttendance;
import com.PageObjects.EditAttendance;
import com.PageObjects.ManageAttendence;
import com.Utils.BaseClass;
import com.Utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import com.PageObjects.*;
public class NavigationAttendanceStepDef extends BaseClass {
	public NavigationAttendanceStepDef(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = Helper.getDriver();
	
	
	
	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String string) {
	    na.clickStudent();
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
	    String actualtext = na.validateStudent();
	    Assert.assertEquals(actualtext,"Manage Student");
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		
		String actualtext = na.validateProgram();
	    Assert.assertEquals(actualtext,"Manage Program");
	   
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		String actualtext = na.validateClass();
	    Assert.assertEquals(actualtext,"Manage Batch");
	}

	@Then("Admin should able to land on Assignment page")
	public void admin_should_able_to_land_on_assignment_page() {
		String actualtext = na.validateAssignment();
	    Assert.assertEquals(actualtext,"Manage Assignment");
	}

	@Then("Admin should able to land on class page")
	public void admin_should_able_to_land_on_class_page() {
		String actualtext = na.validateClass();
	    Assert.assertEquals(actualtext,"Manage Class");
	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
		String actualtext = na.validateLogin();
	    Assert.assertEquals(actualtext,"Please login to LMS Application");
	}

}
