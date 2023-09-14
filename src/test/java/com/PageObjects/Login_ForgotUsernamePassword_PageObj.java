package com.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;

public class Login_ForgotUsernamePassword_PageObj extends BaseClass {
	
WebDriver driver;	
	 
	public Login_ForgotUsernamePassword_PageObj(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='sendlink']")
	WebElement sendlink;

	@FindBy(xpath="//input[@id='text']")
	WebElement textfield;
	
@FindBy(xpath = "//button[@id='forgot']")   //this forgot is from forgot page
	
	WebElement forgotup;

@FindBy(xpath = "//button[@id='frgtuspa']")       //this forgot is from login page

WebElement frg;


public void fruspa() {                           //this forgot is from login page

	frg.click();
}
public void emailgray() {
String script = "arguments[0].style.color='gray';";
((JavascriptExecutor) driver).executeScript(script);


}
	
	public void forusepass() {    //this forgot is from forgot page
		forgotup.click();
		
	}
	
	public void emil(String e1) {
		 textfield.sendKeys(e1);	
	}
	
	
	public String forgot() {
		String f=forgotup.getText();
		return f;
	}
	
	public String textField() {
		String t=textfield.getText();
		return t;
	}
	
	public String astrik() {
		String t=textfield.getText();
            boolean	ash=t.contains("*");
            return t;
		/*
		 * String [] "spilthestar=t.split("l"); String astrikk=spilthestar[1];
		 * System.out.println(astrikk); return astrikk;
		 */
	}
	

	
	public String centerallign() {
		String cAlign=sendlink.getCssValue("center aligned");
		return cAlign;
	}
	

	public String sendLink() {
		String sl=sendlink.getText();
		return sl;
	}
		public void gray() {
			String textColor =textfield.getCssValue("color");
			Assert.assertTrue("gray", textColor.contains("rgb(128, 128, 128)"));
		}
	}
		

