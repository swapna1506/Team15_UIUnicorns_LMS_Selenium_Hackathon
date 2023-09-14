package com.PageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;

public class EditClass_obj extends BaseClass {

	public EditClass_obj(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver = Helper.getDriver();
	
	boolean status;
	
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
	
	public void editbtnclkmehtod()
	{
		editBtnclk.click();
	}


	public void chkEditpopage()
	{
		try {
			status = editpopupchk.isDisplayed();
			assertTrue(status);

			Loggerload.info("edit page is displayed");

		} catch (AssertionError e) {
			Loggerload.error("edit page is not displayed");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void chkallrws()
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
}
