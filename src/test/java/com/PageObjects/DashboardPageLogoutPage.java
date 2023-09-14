package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;

public class DashboardPageLogoutPage {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public DashboardPageLogoutPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }
	 
	 @FindBy(name = "Dashboard")
	 WebElement dashboardElement;
	 
	  public boolean isOnDasgboard() {
		  return dashboardElement.isDisplayed();
	  }
	 
	 @FindBy(id="logoutButton")
	 WebElement logoutButton;
	  
	 public void clickLogoutButton() {
	        logoutButton.click();
	 }

	public String getPageTitle() {
		return driver.getTitle().trim();
	}
	        
		 
}
