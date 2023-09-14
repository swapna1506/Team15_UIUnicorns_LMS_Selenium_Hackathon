package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.Batch_BatchPageValidation_PageObj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Batch_DeleteMultipleBatches_StepDef {
	
	WebDriver driver = Helper.getDriver();
	
	 Batch_BatchPageValidation_PageObj b=new Batch_BatchPageValidation_PageObj(driver);
	
	
	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	   b.batchClick();
	}

	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	   b.isCheckBoxSelected();
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
	    b.Deleteicon_manageProgram();
	}

	@Given("One of the checkbox row is selected")
	public void one_of_the_checkbox_row_is_selected() {
	   b.selectCheck();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
	    b.clickDelete_manageProgram();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
	   b.checkCheckboxDeleted();
	}

	@Given("Two or more checkboxes row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
	    b.checkenable();
	}


}
