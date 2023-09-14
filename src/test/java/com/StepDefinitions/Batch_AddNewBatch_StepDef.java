package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.Batch_BatchPageValidation_PageObj;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Batch_AddNewBatch_StepDef {
	
	WebDriver driver = Helper.getDriver();
	
	 Batch_BatchPageValidation_PageObj b=new Batch_BatchPageValidation_PageObj(driver);
	
	//background
	@Given("Logged on the LMS portal.Admin is on dashboard page after Login")
	public void logged_on_the_lms_portal_admin_is_on_dashboard_page_after_login() {
		Helper.driver.get(ConfigReader.getApplicationUrl("url"));
		Helper.driver.get(ConfigReader.getApplicationUrl("dashboard_url"));
		
	}
	//scenarios
	@Given("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
	   b.anewbutton();
	}

	@Then("The pop up should include the fields Name, Number of classes and Description as text box, Program Name as drop down Status as radio button Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() {
	   b.popupField();
	}

	@When("Fill in all the fields except description with valid values and click save")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save() {
	    
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() {
	   
	}

	@When("Fill in all the fields with valid values and click save")
	public void fill_in_all_the_fields_with_valid_values_and_click_save() {
	   
	}

	@When("any of the fields have invalid values")
	public void any_of_the_fields_have_invalid_values() {
	   
	}

	@Then("Error message should appear")
	public void error_message_should_appear() {
	  b.errorMessage(); 
	}

	@When("Any of the mandatory fields are blank")
	public void any_of_the_mandatory_fields_are_blank() {
	   
	}

	


}
