package com.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;
import com.Utils.Helper;

public class Assgn_DeleteAssgnValidationPage 
{
	@FindBy(xpath = "//a[@href='DeleteButton']") WebElement deleteBtn;
	@FindBy(xpath = "//a[@href='YesButton']") WebElement YesBtnInDelete;
	@FindBy(xpath = "//a[@href='NoButton']") WebElement NoBtnInDelete;
	@FindBy(xpath = "//a[@href='DialogBox']") WebElement DialogBox;

	String Url= ConfigReader.getApplicationUrl();
	private static WebDriver driver = Helper.getDriver();
	public Assgn_DeleteAssgnValidationPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void openLmlPortal()
	{
		driver.get(Url);
	}
	
	public boolean ShowDialogBox()
	{
		deleteBtn.click();
		Alert alert = driver.switchTo().alert();
	      if(DialogBox.isDisplayed())
	      {
	    	  if(DialogBox.isEnabled())
	    	  {
	    		  return true;
	    	  }
	      }
		return false;		       
	}
	
	public void deleteButtonindatatable() 
	{
		deleteBtn.click();
	}
	public boolean AcceptAlert() 
	{
		//switch focus to alert
	      //Alert a = driver.switchTo().alert();
	      if(YesBtnInDelete.isDisplayed())
	      {
	    	  if(YesBtnInDelete.isEnabled())
	    	  {
	    		  return true;	    	
	    	  }
	      }
		return false;		 
	      
	}
	public boolean RejectAlert() 
	{
		 //Alert a = driver.switchTo().alert();
	      if(NoBtnInDelete.isDisplayed())
	      {
	    	  if(NoBtnInDelete.isEnabled())
	    	  {
	    		  return true;
	    	  }
	      }
		return false;	     
	}
	public void ClickYesBtn() 
	{
		deleteBtn.click();
	}
	public void ClickNoBtn() 
	{
		deleteBtn.click();
	}
}
