package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Utils.Helper;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.PageObjects.Navigation_obj;
public class Navigation_SD {

	WebDriver driver = Helper.getDriver();
	
	Navigation_obj objng = new Navigation_obj(driver);
	
	

/*@When("Admin clicks Student button in the navigation bar")
public void admin_clicks_student_button_in_the_navigation_bar() {
 
	objng.studntclickmethod();
}

@When("Admin clicks Program button in the navigation bar")
public void admin_clicks_program_button_in_the_navigation_bar() {
   objng.prgmclickmethod();
}

@When("Admin clicks Batch button in the navigation bar")
public void admin_clicks_batch_button_in_the_navigation_bar() {
    objng.btchclickmethod();
}

@When("Admin clicks User button in the navigation bar")
public void admin_clicks_user_button_in_the_navigation_bar() {
    objng.usrclickmethod();
}

@When("Admin clicks Assignment button in the navigation bar")
public void admin_clicks_assignment_button_in_the_navigation_bar() {
    objng.assgnclickmethod();
}

@When("Admin clicks Attendance button in the navigation bar")
public void admin_clicks_attendance_button_in_the_navigation_bar() {
   objng.attnclickmethod();
}

@When("Admin clicks Logout button in the navigation bar")
public void admin_clicks_logout_button_in_the_navigation_bar() {
   objng.logoutclickmethod();
}


@Then("Admin should able to land on student page")
public void admin_should_able_to_land_on_student_page() {
    objng.msgchckstdnchk();
    
}

@Then("Admin should able to land on program page")
public void admin_should_able_to_land_on_program_page() {
    objng.msgchckprgmchk();
    
}

@Given("Admin is in Manage class")
public void admin_is_in_manage_class() {
    
    
}

@Then("Admin should able to land on batch page")
public void admin_should_able_to_land_on_batch_page() {
    objng.msgchckbtchmchk();
    
}

@Then("Admin should able to land on user page")
public void admin_should_able_to_land_on_user_page() {
    objng.msgchcusrmchk();
    
}

@Then("Admin should able to land on Assignment page")
public void admin_should_able_to_land_on_assignment_page() {
    objng.msgchckassignmchk();
    
}

@Then("Admin should able to land on Attendance page")
public void admin_should_able_to_land_on_attendance_page() {
    objng.msgchckattdnmchk();
    
}

@Then("Admin should able to land on login page")
public void admin_should_able_to_land_on_login_page() {
    
    objng.msgchlogoutchk();
}*/


}
