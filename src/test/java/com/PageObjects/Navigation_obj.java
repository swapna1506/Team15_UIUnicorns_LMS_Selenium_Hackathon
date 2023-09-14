package com.PageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.Helper;
import com.Utils.Loggerload;
import com.Utils.BaseClass;


public class Navigation_obj  extends BaseClass {

	public Navigation_obj(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriver driver = Helper.getDriver();
	
	boolean status;
	
	
	@FindBy(xpath = "//a[@id ='Student']")
	WebElement StudntClick;
	@FindBy(xpath = "//a[@id ='Program']")
	WebElement prgmclick;
	@FindBy(xpath = "//a[@id ='Batch']")
	WebElement btchClick;
	@FindBy(xpath = "//a[@id ='User']")
	WebElement usrClick;
	@FindBy(xpath = "//a[@id ='Assignment']")
	WebElement assgnClick;
	@FindBy(xpath = "//a[@id ='Attendance']")
	WebElement attdnClick;
	@FindBy(xpath = "//a[@id ='Logout']")
	WebElement LogoutClick;
	@FindBy(xpath = "//a[@id ='Class']")
	WebElement classClick;
	@FindBy(xpath = "//pre[@id='message']")
	WebElement OutputChk;
	
	public void studntclickmethod()
	{
		StudntClick.click();
	}
	public void classclickmethod()
	{
		classClick.click();
	}
	public void prgmclickmethod()
	{
		prgmclick.click();
	}
	public void btchclickmethod()
	{
		btchClick.click();
	}
	public void usrclickmethod()
	{
		usrClick.click();
	}
	public void assgnclickmethod()
	{
		assgnClick.click();
	}
	public void attnclickmethod()
	{
		attdnClick.click();
	}
	public void logoutclickmethod()
	{
		LogoutClick.click();
	}
	
	public void msgchckstdnchk()
	{
		try {
			status = StudntClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Student is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Student is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	public void msgclasschk()
	{
		try {
			status = classClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("class is displayed");

		} catch (AssertionError e) {
			Loggerload.error("class is not displayed");
			System.out.println(e.getMessage());
		}
	}
	public void msgchckprgmchk()
	{
		try {
			status = prgmclick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Program is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Program not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	
	public void msgchckbtchmchk()
	{
		try {
			status = btchClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Batch is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Batch is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	public void msgchcusrmchk()
	{
		try {
			status = usrClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("User is displayed");

		} catch (AssertionError e) {
			Loggerload.error("User is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	public void msgchckassignmchk()
	{
		try {
			status = assgnClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Assignment is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Assignment is not displayed");
			System.out.println(e.getMessage());
		}
	}
	public void msgchckattdnmchk()
	{
		try {
			status = attdnClick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Attendance is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Attendance is not displayed");
			System.out.println(e.getMessage());
		}
	}
		public void msgchlogoutchk()
		{
			try {
				status = LogoutClick.isDisplayed();
				assertTrue(status);

				Loggerload.info("Logout is displayed");

			} catch (AssertionError e) {
				Loggerload.error("Logout is not displayed");
				System.out.println(e.getMessage());
			}
		}
	}
	
