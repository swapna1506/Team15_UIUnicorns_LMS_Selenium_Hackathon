package com.PageObjects;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import com.Utils.BaseClass;
import com.aventstack.extentreports.util.Assert;
import com.Utils.Helper;
import com.Utils.Loggerload;

import io.cucumber.core.logging.Logger;

public class ClassDetail_obj extends BaseClass {
	
	WebDriver driver = Helper.getDriver();
	
	public ClassDetail_obj(WebDriver driver) {
		super(driver);
		
	}
	boolean status;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement AddNewClass_WE;
	
	@FindBy(xpath = "//a[@id ='Edit class']")
	WebElement editBtnclk;
	@FindBy(xpath = "//a[Text() ='class details']")
	WebElement editpopupchk;
	@FindBy(xpath = "//a[@id ='batchid']")
	WebElement Batchidval;
	@FindBy(xpath = "//a[@id ='noofclasses']")
	WebElement noclassval;
	@FindBy(xpath = "//a[@id ='classdate']")
	WebElement clasdtval;
	@FindBy(xpath = "//a[@id ='staffid']")
	WebElement staffval;
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement BatchIdDropDown_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement StaffIdDropDown_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement CalendarIcon_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement SaveButton_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement CancelButton_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement CloseButton_WE;
	
	@FindBy(xpath = "//button[@class=\"btn\"]") WebElement AddNewClassButton_WE;
	
	
	
	
	public void AddClassPage() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
	}
	public void alertmsgno() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.dismiss();
	}
	
	
      public void AddNewClassbutton(){
		 
	    AddNewClassButton_WE.click();
	 }


			public void AddClassDetail()
	{
		
			Batchidval.getAttribute("value");
			noclassval.getText();
			clasdtval.getText();
			staffval.getText();
		
		try {
			status = editpopupchk.isDisplayed();
			assertTrue(status);
			Loggerload.info("edit page is displayed");
		} catch (AssertionError e) {
			Loggerload.error("edit page is not displayed");
			System.out.println(e.getMessage());
		}
	}
			public void BatchIdDropDown() {
				try {
			           status = BatchIdDropDown_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }
			
			public void StaffIdDropDown() {
				try {
			           status = StaffIdDropDown_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }
			
			public void CalendarIcon() {
				try {
			           status = CalendarIcon_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }
			
			public void SaveButton() {
				try {
			           status = SaveButton_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }
			
			public void CancelButton() {
				try {
			           status = CancelButton_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }
			
			public void CloseButton() {
				try {
			           status = CloseButton_WE.isDisplayed();
			           assertTrue(status);
			           Loggerload.info("Assert True in try editor block");

			       } catch (AssertionError e) {
			           Loggerload.error("Assert false in try editor block");
			           System.out.println(e.getMessage());
			       }
	        }			
}
	
	
 



