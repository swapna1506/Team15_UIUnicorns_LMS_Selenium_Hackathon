package com.PageObjects;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;


public class Pagination_obj extends BaseClass {
	
	int columnIndex = 0;
	public Pagination_obj(WebDriver driver) {
		super(driver);
		
	}

	WebDriver driver = Helper.getDriver();

	

	boolean status;

	@FindBy(xpath = "//a[@id ='dashboardsmsg']")
	WebElement dashboardlandmsg;
	
	List<WebElement> tableHeaders = (List<WebElement>) dashboardlandmsg;
	
	@FindBy(xpath = "//a[@id ='paginationbutton']")
	WebElement Btnclick;
	@FindBy(xpath = "//pre[@id='datadisplay']")
	WebElement OutputChk;
	
	 @FindBy(xpath ="//td[value() ='1']") 
			 WebElement data1;
			
	
	@FindBy(xpath = "//a[title ='>']")
	WebElement rigtclick;
	
	@FindBy(xpath = "//a[title='<']")
	WebElement lftclick;
	
	@FindBy(xpath = "//a[title='>>']")
	WebElement rigtdblclick;
	@FindBy(xpath = "//a[title='<<']")
	WebElement lftdblclick;
	@FindBy(xpath = "//a[@id='isEnabled']")
	WebElement arrwenabled;
	@FindBy(xpath = "//a[@id='isDisabled']")
	WebElement arrwdisabled;
	
	public void paginationchk()
	{
		 Object colName = null;
		 List<WebElement> result = null;
        for (int i = 0; i < tableHeaders.size(); i++) {
           
			if (tableHeaders.get(i).getText().equals(colName)) {
                break;
            }
        }
        
        boolean goNext = false;
        do { 
        	for (int i = 0; i < tableHeaders.size(); i++) {
                data1.getText();
                             
	        }
        	 boolean paginationNext = false;
			goNext = paginationNext;
             if (paginationNext) {
                 data1.click();
             }
           } while (goNext);
             return ;
        }
	
	
	public void DashboardLandingPage() {
		try {
			status = dashboardlandmsg.isDisplayed();
			assertTrue(status);

			Loggerload.info("Dashboard page is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Dashboard page is not displayed");
			System.out.println(e.getMessage());
		}
	}
	
	public void ClassbtnclickMethod()
	{
		Btnclick.click();
	}
	
	public void dataMessagedisplayed() {

		try {
			status = OutputChk.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}

	}
	
	public void rightarrowchk()
	{
		try {
			status = rigtclick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//rigtclick.click();
	}
	
	public void leftarrowchk()
	{
		try {
			status = lftclick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//lftclick.click();
	}
	
	public void rightdblClick()
	{
		
		try {
			status = lftdblclick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//rigtdblclick.click();
	}
	
	public void lftdblarr() {
		
		try {
			status = rigtdblclick.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//lftdblclick.click();
	}
	
	
	public void arrenabledmethd() {
		
		try {
			status = arrwenabled.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//lftdblclick.click();
	}
public void arrdisbledmethd() {
		
		try {
			status = arrwdisabled.isDisplayed();
			assertTrue(status);

			Loggerload.info("Alert is displayed");

		} catch (AssertionError e) {
			Loggerload.error("Alert is not displayed");

		}
		//lftdblclick.click();
	}
}
