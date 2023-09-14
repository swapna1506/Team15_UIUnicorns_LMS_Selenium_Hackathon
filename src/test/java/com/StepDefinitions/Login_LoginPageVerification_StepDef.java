package com.StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Login_HomePageVerification_PageObj;
import com.PageObjects.Login_LoginPageVerification_PageObj;
import com.Utils.ConfigReader;
import com.Utils.ExcelReader;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login_LoginPageVerification_StepDef {
	
	WebDriver driver = Helper.getDriver();
	Login_LoginPageVerification_PageObj lp_1=new Login_LoginPageVerification_PageObj(driver);
	Login_HomePageVerification_PageObj hppo= new Login_HomePageVerification_PageObj(driver);
ExcelReader er=new ExcelReader();

	//FeatureFile:1_LOGINPAGEVERIFICATION
	
	//Scenario:Verify the login page
	@Given("Admin is in home page")
	public void admin_is_in_home_page() {
		 Helper.driver.get(ConfigReader.getApplicationUrl("url")); 
	}
	
	
	@When("Admin clicks Login button")
	public void admin_clicks_login_button() {
	    hppo.buttonclickable();
	}
	
	
	
	@Then("Admin should land on the login page")
	public void admin_should_land_on_the_login_page() {
	String lgnpge=Helper.driver.getTitle();
		Assert.assertEquals(lgnpge,"LoginPage");
	   
	}
	
	//Scenario:Verify for broken link
	
	
	
	
	
	
	
	//Scenario:Verify tht header of the login page
	
	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String string) {
		
		
	 Assert.assertEquals(string,"Please Login To LMS Application");  
	}
	
    //Scenario:Verify the text spelling in login page
	
	
	
	
	
	
	//Scenario:Verify text field is present
	

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
		
		Assert.assertTrue("Text Field1 is displayed",lp_1.textfield1.isDisplayed());
		Assert.assertTrue("Text Field1 is displayed",lp_1.textfield2.isDisplayed());
	}
	
	
	
	
	//Scenario:Verify text on the first text field
	
	@Then("Admin should {string} in the first text field")
	public void admin_should_in_the_first_text_field(String string) {
	   Assert.assertEquals(string,"user");
	}
	
	
	//Scenario:Verify asterik next to user text
	
	@Then("Admin should see * symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text() {
		String u="user*";
		Assert.assertEquals(u,"user*");
	   
	}
	
	
	
	//Scenario: Verify text on the second text field
	
	@Then("Admin should {string} in the second text field")
	public void admin_should_in_the_second_text_field(String string) {
	    Assert.assertEquals(string,"password");
	}
	
	
	//Scenario: Verify asterik next to password text
	
	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
	    String p="password*";
	    Assert.assertEquals(p,"password*");
	}
		
	
	
	//Scenario:Verify the alignment input field for the login
	
	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
		
	    Assert.assertEquals(lp_1.centerAllignTextfield1(),"center alligned");
	    Assert.assertEquals(lp_1.centerAllignTextfield2(),"center alligned");
	}
	
	
	//Scenario:verify Login is present
	
	
	
	
	
		//Scenario:Verify the alignment of the login button
	
	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
		  Assert.assertEquals(lp_1.lgcenterallign(),"center alligned");
	}
		
		
		
		
		//Scenario:Verify forgot username or password link
	
	@Then("Admin should see forgot username or password link")
	public void admin_should_see_forgot_username_or_password_link() {
	   Assert.assertEquals(lp_1.forgot(),"Forgot Username or Password");
	}
	
	//Scenario:Verify for the Reset password link
	
	@Then("Admin should see reset password link")
	public void admin_should_see_reset_password_link() {
	    Assert.assertEquals(lp_1.reset(),"Reset Password");
	}
	
	//Scenario:Verify input descriptive test in user field
	
	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
	    lp_1.usergray();
	}
	
	
	//Scenario:Verify input descriptive test in password field
	
	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
	    lp_1.passgray();
	}
	

    //FeatureFile:2_Login page verification
	
	//background
	
	
	//scenarios
	
	@When("Admin enter valid {string} {string} and clicks login button")
	public void admin_enter_valid_and_clicks_login_button(String sheetname, int Testcase) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData= er.getData("src\\test\\java\\com\\Utils\\ExcelReader.java",sheetname);
		  String uname= testData.get(Testcase).get("username");
		  String pword= testData.get(Testcase).get("password");
		lp_1.sendvalues(uname, pword);
	   lp_1.l();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		String d=Helper.driver.getTitle();
	   Assert.assertEquals(d,"Dashboard");
	}

	@When("Admin enter invalid {string} {string} and clicks login button")
	public void admin_enter_invalid_and_clicks_login_button(String sheetname, int Testcase) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData= er.getData("src\\test\\java\\com\\Utils\\ExcelReader.java",sheetname);
		  String uname= testData.get(Testcase).get("username");
		  String pword= testData.get(Testcase).get("password");
		lp_1.sendvalues(uname, pword);
		lp_1.l();
	}

	
	@Then("Error message please check username password")
	public void error_message_please_check_username_password() {
	  String er=lp_1.erroruserpass();
		Assert.assertEquals(er,"Error Message please check Username and Password"); 
	}

	@Then("Error message please check password")
	public void error_message_please_check_password() {
		 String er1=lp_1.errorp();
			Assert.assertEquals(er1,"Error Message please check Password"); 
		 
	}

	@When("Admin enter valid {string} {string} and clicks a login button")
	public void admin_enter_valid_and_clicks_a_login_button(String sheetname, int Testcase) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData= er.getData("src\\test\\java\\com\\Utils\\ExcelReader.java",sheetname);
		  String uname= testData.get(Testcase).get("username");
		  String pword= testData.get(Testcase).get("password");
		lp_1.sendvalues(uname, pword);
		lp_1.l();
	}

	@Then("Error message please check username")
	public void error_message_please_check_username() {
		 String er2=lp_1.errorun();
			Assert.assertEquals(er2,"Error Message please check username"); 
		 
	}

	@When("Admin enter blank in {string} \"4negative\"and clicks login button")
	public void admin_enter_blank_in_4negative_and_clicks_login_button(String string) {
	   
	}

	@When("Admin enter blank in {string} \"5negative\"and clicks a login button")
	public void admin_enter_blank_in_5negative_and_clicks_a_login_button(String string) {
	   
	}

	@When("Admin clicks Login button with empty values in {string} {string} columns")
	public void admin_clicks_login_button_with_empty_values_in_columns(String sheetname, int Testcase) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData= er.getData("src\\test\\java\\com\\Utils\\ExcelReader.java",sheetname);
		  String uname= testData.get(Testcase).get("username");
		  String pword= testData.get(Testcase).get("password");
		lp_1.sendvalues(uname, pword);
		lp_1.l();
	}

	@When("Admin enter valid {string} {string} and clicks login button through keyboard")
	public void admin_enter_valid_and_clicks_login_button_through_keyboard(String string, String string2) {
	  
	}

	@When("Admin enter valid {string} {string} and clicks login button through mouse")
	public void admin_enter_valid_and_clicks_login_button_through_mouse(String string, String string2) {
	   
	
	
	

}
	
}
