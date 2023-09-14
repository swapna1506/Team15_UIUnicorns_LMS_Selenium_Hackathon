package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;

public class Login_HomePageVerification_PageObj extends BaseClass {
	
	public Login_HomePageVerification_PageObj(WebDriver driver) 
	{
		
		super(driver);
	}
	@FindBy(xpath="//input[@id='login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='lmslogo']")
	WebElement lmslogo;
	
	
	@FindBy (xpath="//input[@id='lmslogo']")
	WebElement button;
	
	public String correct() {
		String logincorrectspell=login.getText();
		//System.out.println(logincorrectspell);
		return logincorrectspell;
	}
	
	public String allign() {
		String logoAlign=lmslogo.getCssValue("properly aligned");
		return logoAlign;
	}
	
	
public WebElement seeloginbutton() {
	WebElement loginButton=button;
	 //ScenarioContext.setContext("buttonElement", button);
	return loginButton;
}

public void buttonclickable() {
	login.click();
	
}
}
