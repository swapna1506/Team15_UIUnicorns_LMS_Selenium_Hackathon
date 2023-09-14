package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;

public class Login_ResetPassword_PageObj extends BaseClass{

	public Login_ResetPassword_PageObj(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='login']")       //this is from lmslogin page
	WebElement login;
	
	
	
	@FindBy(xpath="//input[@id='resetp']")       //this is from login page
	WebElement resetpass;
	
	
	
	@FindBy(xpath="//input[@id='submit']")       
	WebElement submit;
	
	@FindBy(xpath = "//button[@id='rptxtfield1']")
	public 
	WebElement rptextfield1;
	
	@FindBy(xpath = "//button[@id='rptxtfield2']")
	public
	WebElement rptextfield2;
	
	
	
	public void resetPassword() {            //this is from login page
		resetpass.click();
}
	
	
	public void buttonclickable() {            //this is from lmslogin page
		login.click();
}
	
	public String txtfld1() {           
		String tf1=rptextfield1.getText();
		return tf1;
}
	
	public String txtfld2() {           
		String tf2=	rptextfield2.getText();
		return tf2;
}
	
	public void disable1() {           
		rptextfield1.sendKeys("    ");
		rptextfield1.click();
	}
	
	public void disable2() {           
		rptextfield2.sendKeys("1234");
		rptextfield2.click();
	}
	
	public String centerAllignSubmit() {
		String cAlignSubmit=submit.getCssValue("center aligned");
		return cAlignSubmit;
	}
	

	public void newpassword() {           
		rptextfield1.click();
		
}
	
	public void retypepassword() {           
		rptextfield2.click();
	}
		
		public void box1() {           
			rptextfield1.sendKeys("1234");
			
		}
		
		public void box2() {           
			rptextfield2.sendKeys("1234");
			
		}
		

		public void rset() {             // this is for reset password page
			submit.click();
	}
		
		
}
