package com.StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Login_HomePageVerification_PageObj;
import com.Utils.ConfigReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_HomePageVerificationStepDef {
	 
	WebDriver driver = Helper.getDriver();
	Login_HomePageVerification_PageObj hppo= new Login_HomePageVerification_PageObj(driver);
	
	//FeatureFile:HOMEPAGEVERIFICATION
	
	//Scenario:Verify admin is able to land on home page
	
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
	   //Helper.getDriver();
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
	 Helper.driver.get(ConfigReader.getApplicationUrl("url"));
	 
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
	 String lmslinkexp=Helper.driver.getTitle();
	 System.out.println(lmslinkexp);
	 Assert.assertEquals(lmslinkexp, "LMSHomePage");
	
	}
	
	// Scenario:Verify admin is able to land on home page with invalid URL
	
	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
		 Helper.driver.get(ConfigReader.getApplicationUrl("inv_url"));
	} 

	@Then("Admin should receive {int} page not found error")
	public void admin_should_receive_page_not_found_error(Integer int1) {
		String lmslinkexp1=Helper.driver.getTitle();
		 System.out.println(lmslinkexp1);
	Assert.assertNotEquals("404 Message",lmslinkexp1,"LMSHomePage");  
	}
	
	//Scenario:Verify for broken link
	
	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
		String lmslinkexp2=Helper.driver.getTitle();
		 System.out.println(lmslinkexp2);
	Assert.assertNotEquals("HTTP response >= 400",lmslinkexp2,"LMSHomePage"); 
	}
	
	//Scenario:Verify the text spelling in the page  
	
	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		
	Assert.assertEquals(hppo.correct(),"Login"); 
	}
	
	//Scenario:Verify the logo of the LMS
	
	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
	   
	}
	
	//Scenario:Verify the logo properly aligned
	
	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
	   Assert.assertEquals(hppo.allign(),"proprely aligned");
	}
	
	//Scenario:Verify login button is present
	
	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		
		Assert.assertEquals( hppo.seeloginbutton(),"buttonElement");
	}
	
	//Scenario:Verify login button is clickable
	
	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
		hppo.buttonclickable();
		String lngbutt=Helper.driver.getTitle();
		 System.out.println(lngbutt);
		Assert.assertEquals(lngbutt,"LoginPage");
	}

	
	

	
	
	

}
