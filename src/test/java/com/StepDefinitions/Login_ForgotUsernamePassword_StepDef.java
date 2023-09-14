package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Login_ForgotUsernamePassword_PageObj;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_ForgotUsernamePassword_StepDef {
	
	WebDriver driver = Helper.getDriver();
	Login_ForgotUsernamePassword_PageObj lf=new Login_ForgotUsernamePassword_PageObj(driver);
	
	
	@Given("Admin is in login page")
	public void admin_is_in_login_page() {
	   Helper.driver.get(ConfigReader.getApplicationUrl("lgn_url"));
	}

	@When("Admin clicks forgot username or password link")
	public void admin_clicks_forgot_username_or_password_link() {
		lf.forusepass();
	}

	@Then("Admin should land on forgot username or password page")
	public void admin_should_land_on_forgot_username_or_password_page() {
	    String fup=lf.forgot();
	    Assert.assertEquals(fup,"forgot username or password page");
	}
	
	@Then("Admin should see {string} text in gray color")
	public void admin_should_see_text_in_gray_color(String string) {
		lf.gray();
	}

	@Then("Admin should see {string} in text field")
	public void admin_should_see_in_text_field(String e) {
		String text=lf.textField();
	    Assert.assertEquals(text,e);
	}

	@Then("Admin should see {string}  button")
	public void admin_should_see_button(String sendl) {
	 String sendlinkk=lf.sendLink();
		Assert.assertEquals(sendlinkk,sendl);
	}

	@Then("Admin should see asterik symbol need Email")
	public void admin_should_see_asterik_symbol_need_email() {
		String a=lf.astrik();
		Assert.assertEquals(a,"Email*");
		
	    
	}

	@Then("Admin should see send link button in center of the page")
	public void admin_should_see_send_link_button_in_center_of_the_page() {
		String c=lf.centerallign();
		Assert.assertEquals(c,"center aligned");
	}
	
	//second background
	
		@Given("Admin Clicks forgot username and password after reaching login page")
		public void admin_clicks_forgot_username_and_password_after_reaching_login_page() {
		   Helper.driver.get(ConfigReader.getApplicationUrl("lgn_url"));
		   lf.fruspa();
		}
		
		//these are from scenarios
		
		@Given("Admin is in forgot username and password page")
		public void admin_is_in_forgot_username_and_password_page() {
			 Helper.driver.get(ConfigReader.getApplicationUrl("forgot_url"));  
		}

		@When("Admin enters valid {string} id and clicks send link button")
		public void admin_enters_valid_id_and_clicks_send_link_button(String e) {
		   lf.emil(e);
		   lf.sendLink();
		}
		@Then("Admin should receive link in mail for reset username \\/ password")
		public void admin_should_receive_link_in_mail_for_reset_username_password() {
			 Helper.driver.get(ConfigReader.getApplicationUrl("forgot_url"));
			 String fup=lf.forgot();
			    Assert.assertEquals(fup,"forgot username or password page");
			
		}

		@When("Admin enters invalid {string} id and clicks send link button")
		public void admin_enters_invalid_id_and_clicks_send_link_button(String ine) {
			
				   lf.emil(ine);
				   lf.sendLink(); 
		}

		@Then("Admin should not receive link in mail for reset username \\/ password")
		public void admin_should_not_receive_link_in_mail_for_reset_username_password() {
			Helper.driver.get(ConfigReader.getApplicationUrl("forgot_url"));
			 String fup=lf.forgot();
			    Assert.assertEquals(fup,"forgot username or password page");
		}



		

	}




