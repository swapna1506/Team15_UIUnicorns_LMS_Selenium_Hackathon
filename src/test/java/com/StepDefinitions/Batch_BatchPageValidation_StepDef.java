package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Batch_BatchPageValidation_PageObj;

import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Batch_BatchPageValidation_StepDef {
	WebDriver driver = Helper.getDriver();
	
	 Batch_BatchPageValidation_PageObj b=new Batch_BatchPageValidation_PageObj(driver);
	
	//background
	@Given("Logged on the LMS portal")
	public void logged_on_the_lms_portal() {
	   Helper.driver.get(ConfigReader.getApplicationUrl("url"));
	}
	
	//scenarios
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		 Helper.driver.get(ConfigReader.getApplicationUrl("dashboard_url"));   
	}

@When("Admin clicks Batch from navigation bar")
public void Admin_clicks_Batch_from_navigation_bar() {
	b.batchClick();
}

  @Then("Admin should see the Manage Batch in the URL")
  public void Admin_should_see_the_Manage_Batch_in_the_URL() {
	  String m=Helper.driver.getTitle();
	  Assert.assertEquals(m,"Manage Batch");
  }

	
	
	//scenarios

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
	   String mb=b.manageBatch();
	   Assert.assertEquals(mb,"Manage Batch");
	    
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		
		Assert.assertEquals(b.pagination.isDisplayed(),"True");
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
	   b.verifypageheaders();
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
      b.deleteIconDisplayed();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    b.newBatchButton();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		b.checkCheckbox();
		   }  
	

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	   b.isEnable();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	   b.isEnableDelete();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	   b.anewbutton();
	}



}
