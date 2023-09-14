package com.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;

public class Login_LoginPageVerification_PageObj extends BaseClass {
WebDriver driver;
	public Login_LoginPageVerification_PageObj(WebDriver driver) {
		super(driver);
	
	
	}
	
	@FindBy(xpath="//input[@id='login']")
	WebElement login;
	

	@FindBy (xpath="//input@[id='Please Login To LMS Application'")
	WebElement lgnHeader;
	
	@FindBy(xpath = "//button[@id='txtfield1']")
	public 
	WebElement textfield1;
	
	@FindBy(xpath = "//button[@id='txtfield2']")
	public
	WebElement textfield2;
	
	
	@FindBy(xpath = "//button[@id='forgot']")
	
	WebElement forgotup;

@FindBy(xpath = "//button[@id='reset']")
	
	WebElement resetp;

@FindBy(xpath = "//button[@id='dash']")

WebElement dashboard;

@FindBy(xpath = "//button[@id='username']")

WebElement userName;

@FindBy(xpath = "//button[@id='password']")

WebElement passWord;

@FindBy(xpath="//button[@id='err'")
WebElement errUnPass;

@FindBy(xpath="//button[@id='err1'")
WebElement errUn;

@FindBy(xpath="//button[@id='err2'")
WebElement errp;



public void sendvalues(String username,String password) {
	userName.sendKeys(username);
	passWord.sendKeys(password);
	
	
}

public void l() {
	login.click();
}
	
	

public String lgnheader() {
		String loginHeader= lgnHeader.getText();
		return loginHeader;
	}
	
	public String lgcenterallign() {
		String cAlign=login.getCssValue("center aligned");
		return cAlign;
	}
	
	public String centerAllignTextfield1() {
		String cAlignText1=textfield1.getCssValue("center aligned");
		return cAlignText1;
	}
	
	public String centerAllignTextfield2() {
		String cAlignText2=textfield2.getCssValue("center aligned");
		return cAlignText2;
	}
	
	public String forgot() {
		String f=forgotup.getText();
		return f;
	}
	
	public void forusepass() {
		forgotup.click();
		
	}
		
		public String reset() {
			String rp=resetp.getText();
			return rp;
			
	}
		public String erroruserpass() {
			String e=errUnPass.getText();
			return e;
			
	}
		
		public String errorun() {
			String e=errUn.getText();
			return e;
			
	}

		public String errorp() {
			String e=errp.getText();
			return e;
		}
			public void usergray() {
				textfield1.sendKeys("swapna");
				String textColor =textfield1.getCssValue("color");
				Assert.assertTrue("gray", textColor.contains("rgb(128, 128, 128)"));	
				  
			}
			public void passgray() {
				textfield2.sendKeys("1234");
				String textColor =textfield2.getCssValue("color");
				Assert.assertTrue("gray", textColor.contains("rgb(128, 128, 128)"));	
				  
			
	}	
}
