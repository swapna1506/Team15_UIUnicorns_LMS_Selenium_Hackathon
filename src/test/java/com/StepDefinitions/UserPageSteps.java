

package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.DashboardPage;
import com.PageObjects.UserPage;
import com.Utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.driverFactory.DriverFactory;

public class UserPageSteps {
	
	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);
	UserPage uspg = new UserPage(driver);

	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
		Assert.assertEquals("Dashboard Page", dashboardPage.getCurrentPageTitle());
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
		dashboardPage.clickStudentLink();
		Assert.assertEquals("User Details Page", uspg.getCurrentPageTitle());
	}

	@Then("Admin should see {string} in the URL")
	public void admin_should_see_in_the_url(String string) {
	    Assert.assertTrue(uspg.SendURLText().contains(string));
	}

	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String string) {
		Assert.assertTrue(uspg.isPageTitleDisplayed());
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		Assert.assertTrue(uspg.isFooterPaginatorDisplayed());
	}

	@Then("Admin should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
		Assert.assertTrue(uspg.isUserPageRowHeadingsDisplayed());
	}

	@Then("Admin should see a Delete icon button that is disabled")
	public void admin_should_see_a_icon_button_that_is_disabled() {
		Assert.assertTrue(uspg.isDeleteAllUserBtnDisabled());
	}

	@Then("Admin should see the {string} button")
	public void admin_should_see_the_button(String string) {
		
		if(string=="+ A New User")
		Assert.assertTrue(uspg.isAddUserLinkDisplayed());
		if(string=="+ Assign staff")
			Assert.assertTrue(uspg.isAssignStaffLinkDisplayed());
	}

	@Then("Admin should see the search text box")
	public void admin_should_see_the_search_text_box() {
		Assert.assertTrue(uspg.isSearchBoxDisplayed());
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		Assert.assertTrue(uspg.isSelectAllCheckBoxDisplayed());
	}

	@Then("Each row in the data table should have an edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_an_edit_icon_that_is_enabled() {
		Assert.assertTrue(uspg.isEditRowButtonEnabled());
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		Assert.assertTrue(uspg.isDeleteRowButtonEnabledForEachRow());
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	   uspg.clickAddNewUser();
	}
	
	@Given("Admin is logged on the LMS portal")
	public void admin_is_logged_on_the_lms_portal() {
		
				dashboardPage.visit_LMS_url();
				dashboardPage.clickMainPageLogin_btn();
				dashboardPage.enterUsername(ConfigReader.getUserName());
				dashboardPage.enterPassword(ConfigReader.getPassword());
				dashboardPage.clickLogin();
				Assert.assertEquals("Dashboard Page", dashboardPage.getCurrentPageTitle());
	}

	@Given("Admin clicks {string} from the navigation bar")
	public void admin_clicks_from_the_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks the {string} button")
	public void admin_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("A popup with user details appears")
	public void a_popup_with_user_details_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The popup should have the following text boxes:")
	public void the_popup_should_have_the_following_text_boxes(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The popup should have the following drop-downs:")
	public void the_popup_should_have_the_following_drop_downs(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin fill in all fields except MN, LinkedIn Url, Email, User comments, Undergraduate, Postgraduate, and Time zone with valid values and click submit")
	public void admin_fill_in_all_fields_except_mn_linked_in_url_email_user_comments_undergraduate_postgraduate_and_time_zone_with_valid_values_and_click_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The newly added user should be visible in the data table on the Manage User page")
	public void the_newly_added_user_should_be_visible_in_the_data_table_on_the_manage_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin fill in all fields with valid values and click submit")
	public void admin_fill_in_all_fields_with_valid_values_and_click_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enter invalid values in any of the fields")
	public void admin_enter_invalid_values_in_any_of_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("An error message should appear")
	public void an_error_message_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin leave any of the mandatory fields blank")
	public void admin_leave_any_of_the_mandatory_fields_blank() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

		
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
		 Assert.assertTrue(uspg.isUserDetailPopupDisplayed());
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

		@Given("Admin is on the dashboard page")
		public void admin_is_on_the_dashboard_page() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("Admin has navigated to {string} from the navigation bar")
		public void admin_has_navigated_to_from_the_navigation_bar(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("The delete icon on row level in the data table is enabled")
		public void the_delete_icon_on_row_level_in_the_data_table_is_enabled() {
		   uspg.isDeleteRowButtonEnabled();
		}

		@When("Admin clicks the delete icon for user {string}")
		public void admin_clicks_the_delete_icon(String name) {
		   uspg.clickFirstRowDeleteButton(name);
		}

		@Then("An alert appears with {string} and {string} options")
		public void an_alert_appears_with_and_options(String string, String string2) {
		    Assert.assertTrue(uspg.alertAppearsWithYesAndNo(string, string2));
		}

		@When("Admin clicks the {string} option on the confirmation alert")
		public void admin_clicks_the_option_on_the_confirmation_alert(String string) {
		    uspg.ClickYes_NoOnAlert(string);
		}

		@Then("A {string} alert pops up")
		public void a_alert_pops_up(String string) {
		    Assert.assertTrue(uspg.alertAppearsWithUserDeletedMessage(string));
		}

		@Then("The user {string} is no more available in the data table")
		public void the_user_is_no_more_available_in_the_data_table(String name) {
			Assert.assertTrue(uspg.CheckUserExistInTable(name));
		}
		
		@Then("The user {string} is still listed in the data table")
		public void the_user_is_still_listed_in_the_data_table(String name) {
			Assert.assertFalse(uspg.CheckUserExistInTable(name));
		}


		@When("Admin clicks the {string} option")
		public void admin_clicks_the_option(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		
	}

