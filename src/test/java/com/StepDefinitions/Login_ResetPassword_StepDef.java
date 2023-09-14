package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Login_ResetPassword_PageObj;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_ResetPassword_StepDef {
	WebDriver driver = Helper.getDriver();
	Login_ResetPassword_PageObj lrp=new Login_ResetPassword_PageObj(driver);
	
	//first background
	@Given("Admin in login page after clicking login button in home page")
	public void admin_in_login_page_after_clicking_login_button_in_home_page() {
		 Helper.driver.get(ConfigReader.getApplicationUrl("url"));  
		 lrp.buttonclickable();
	}
	
	//scenarios
	@When("Admin clicks reset password link")
	public void admin_clicks_reset_password_link() {
	   lrp.resetPassword();
	}

	@Then("Admin should land on reset password page")
	public void admin_should_land_on_reset_password_page() {
		
		 String rp=Helper.driver.getTitle();
		 System.out.println(rp);
		 Assert.assertEquals(rp,"Reset Password Page");
		
	}

	@Then("Admin should see submit button in center of the page")
	public void admin_should_see_submit_button_in_center_of_the_page() {
		 Assert.assertEquals(lrp.centerAllignSubmit(),"center alligned"); 
	}

	@Then("Admin should see two text box")
	public void admin_should_see_two_text_box() {
	   String tbox1=lrp.txtfld1();
	   Assert.assertEquals(tbox1,"TextBox1");
	   String tbox2=lrp.txtfld2();
	   Assert.assertEquals(tbox2,"TextBox2");
	}

	@Then("Admin should see {string} in the first label text")
	public void admin_should_see_in_the_first_label_text(String typenew) {
	   String typenewpass=lrp.txtfld1();
		Assert.assertEquals(typenewpass,typenew);
	}
	

	@Then("Admin should see {string} in the second label text")
	public void admin_should_see_in_the_second_label_text(String retypepass) {
		 String resetpassword=lrp.txtfld2();
			Assert.assertEquals(resetpassword,retypepass);
	}

	
	  @Then("Admin should see text box in disabled state")
	  public void admin_should_see_text_box_in_disabled_state() {
	  lrp.disable1();
	  
	  lrp.disable2();
	  
	  }
	 
	
	  
	//second background
	
	//background
	
		@Given("Admin clicks reset password link after  reaching in login page")
		public void admin_clicks_reset_password_link_after_reaching_in_login_page() {
			 Helper.driver.get(ConfigReader.getApplicationUrl("lgn_url"));
			 lrp.resetPassword();
		}
	//these are scenarios
		
		@Given("Admin reset password page")
		public void admin_reset_password_page() {
			Helper.driver.get(ConfigReader.getApplicationUrl("reset_url"));
		}

		@When("Admin clicks on type in new password field")
		public void admin_clicks_on_type_in_new_password_field() {
		    lrp.newpassword();
		    
		}

		@Then("Admin should see text box is enabled state")
		public void admin_should_see_text_box_is_enabled_state() {
		   String np=lrp.txtfld1();
		   Assert.assertEquals(np,"Type in new password");
		   String retypepas=lrp.txtfld2();
		   Assert.assertEquals(retypepas,"Retype password");
		}

		@When("Admin clicks on retype password field")
		public void admin_clicks_on_retype_password_field() {
		   lrp.resetPassword();
		}

		@When("Admin enters same password on both field and clicks submit button")
		public void admin_enters_same_password_on_both_field_and_clicks_submit_button() {
		   lrp.box1();
		   lrp.box2();
		   lrp.rset();
		}

		@Then("Admin should recieve  : {string}. Please click here to login")
		public void admin_should_recieve_please_click_here_to_login(String string) {
		   
		}

		@When("Admin enters same password on both field with invalid details and clicks submit button")
		public void admin_enters_same_password_on_both_field_with_invalid_details_and_clicks_submit_button() {
		   
		}

		@Then("Error message {string}")
		public void error_message(String string) {
		   
		}

		@When("Admin enters  empty details on both fieldand clicks submit button")
		public void admin_enters_empty_details_on_both_fieldand_clicks_submit_button() {
		   
		}

		@When("Admin enters  mismatch values and clicks submit button")
		public void admin_enters_mismatch_values_and_clicks_submit_button() {
		    
		}
		
	}




