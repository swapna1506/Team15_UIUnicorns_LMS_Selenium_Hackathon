package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageObjects.DashboardPage;
import com.PageObjects.StudentPageVerificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class StudentPageVerificationStep {
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	StudentPageVerificationPage studentPageValidation =new StudentPageVerificationPage(driver);
	
	

@Given("Admin is on the dashboard page after login")
public void admin_is_on_the_dashboard_page_after_login() {
	String expectedTitle = "Dashboard - LMS Portal"; // assuming title for dashboard page
    String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedTitle, actualTitle);
}

@When("Admin clicks Student on the navigation bar")
public void admin_clicks_student_on_the_navigation_bar() {
        WebElement studentLink = driver.findElement(By.id("studentNavLink"));  // Replace with your actual locator for 'Student' link in navigation bar
        studentLink.click();
}

@Then("Admin should see the Student details Page Title")
public void admin_should_see_the_student_details_page_title() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see Maximum navigation time in milliseconds, defaults to {int} seconds")
public void admin_should_see_maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see LMS-Learning management system as title")
public void admin_should_see_lms_learning_management_system_as_title() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see Student Detail title in the center of the page")
public void admin_should_see_student_detail_title_in_the_center_of_the_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see Two dropdowns on the page")
public void admin_should_see_two_dropdowns_on_the_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see a search box inside the Student name dropdown")
public void admin_should_see_a_search_box_inside_the_student_name_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see a search box inside the batch ID dropdown")
public void admin_should_see_a_search_box_inside_the_batch_id_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see correct spelling for {string}")
public void admin_should_see_correct_spelling_for(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see select student name in gray color and the correct spelling")
public void admin_should_see_select_student_name_in_gray_color_and_the_correct_spelling() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see select batch ID in gray color and only numbers")
public void admin_should_see_select_batch_id_in_gray_color_and_only_numbers() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Then("Admin should see {string} in first dropdown")
public void adminShouldSeeLabelInFirstDropdown(String expectedLabel) {
    Assert.assertEquals(expectedLabel, studentPageValidation.firstDropDownTitle(expectedLabel));
}

@Then("Admin should see {string} in second dropdown")
public void adminShouldSeeLabelInSecondDropdown(String expectedLabel) {
	Assert.assertEquals(expectedLabel, studentPageValidation.secondDropDownTitle(expectedLabel));
}

//To be deleted
@Then("Admin should be able to scroll down to select the name")
public void adminShouldBeAbleToScrollDownToSelectTheName() {
	studentPageValidation.scrollStudentDropdown();
    // Additional verification can be added to ensure the last item is visible
}

//To be deleted
@Then("Admin should able to scroll down to select the batch id")
public void adminShouldAbleToScrollDownToSelectTheBatchId() {
	studentPageValidation.scrollBatchDropdown();
    // Additional verification can be added to ensure the last item is visible
}

@When("Admin selects student name from the student name dropdown")
public void admin_selects_student_name_from_the_student_name_dropdown() {
	studentPageValidation.clickStudentDropDown();
}

@Then("Admin should be able to scroll down to select the name")
public void admin_should_be_able_to_scroll_down_to_select_the_name() {
	Assert.assertEquals(studentPageValidation.selectNameFromStudentDropdown(), "Steve");
}


@Then("Admin should be able to scroll down to select the batch ID")
public void admin_should_be_able_to_scroll_down_to_select_the_batch_id() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Then("Admin should not see {string} text")
public void admin_should_not_see_text(String string) {
    Assert.assertNotEquals(studentPageValidation.selectNameFromStudentDropdown(), string);
}

@When("Admin selects batch ID from the batch ID dropdown")
public void admin_selects_batch_id_from_the_batch_id_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects x alphabet in the search box from the student name dropdown")
public void admin_selects_x_alphabet_in_the_search_box_from_the_student_name_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see student names starting with {string} listed below")
public void admin_should_see_student_names_starting_with_listed_below(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects x number in the search box from the batch ID dropdown")
public void admin_selects_x_number_in_the_search_box_from_the_batch_id_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see batch IDs starting with {string} listed below")
public void admin_should_see_batch_i_ds_starting_with_listed_below(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects only the student name from the student name dropdown")
public void admin_selects_only_the_student_name_from_the_student_name_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should not see student details displayed")
public void admin_should_not_see_student_details_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects only the batch ID from the batch ID dropdown")
public void admin_selects_only_the_batch_id_from_the_batch_id_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin selects both a student name and batch ID from their respective dropdowns")
public void admin_selects_both_a_student_name_and_batch_id_from_their_respective_dropdowns() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The selected student information should be displayed")
public void the_selected_student_information_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	

}
