package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.DeleteClassValidation_obj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteClassValidation_SD  {

	 WebDriver driver = Helper.getDriver();
	
	 DeleteClassValidation_obj obj = new DeleteClassValidation_obj(driver);

@Given("Admin is in Manage class page")
public void admin_is_in_manage_class_page() {
   
	obj.ManageclassLandingPage();
}


@When("Admin clicks delete button in data table row level")
public void admin_clicks_delete_button_in_data_table_row_level() {
	
	obj.DelBtnclick();
}


@Then("Alert should have yes button to accept")
public void alert_should_have_button_to_accept(String string) {
 
	obj.YesMessagedisplayed();
}


/*@When("Admin clicks yes button")
public void admin_clicks_yes_button() {
	  obj.alertmsgyes();
   obj.NoMessagedisplayed();
}*/

@Then("Admin should see alert")
public void admin_should_see_alert() {
    obj.Messagedisplayed();
}

@Then("Alert should have no button to reject")
public void alert_should_have_no_button_to_reject() {
  obj.alertmsgno();
}

@Then("Success message and validate particular class details are deleted from the data table")
public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
    obj.Messagedisplayed();
}

/*@When("Admin clicks single  row level check box in the data table")
public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	   obj.checkboxclickmethd();
}*/

@Then("Admin should see delete icon below the header is enabled")
public void admin_should_see_delete_icon_below_the_header_is_enabled() {
 obj.deletebtnenabledchk();
}

/*@Then("Admin should see tick mark in check box")
public void admin_should_see_tick_mark_in_check_box() {
obj.chkboxselectCheckmsg();
}*/

@When("Admin clicks multiple row level check box in the data table")
public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	obj.multichkboxclickmethod();
}

/*@Then("Admin should see tick mark in check box  of the selected rows")
public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
	obj.multichkboxselectCheckmsg();
}*/

/*@When("Admin clicks no button")
public void admin_clicks_no_button() {
    obj.alertmsgno();
}*/

@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
    obj.ManageclassLandingPage();
}


@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
obj.Messagedisplayed();
}


}
