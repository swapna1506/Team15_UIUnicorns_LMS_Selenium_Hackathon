package com.PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;
import com.Utils.Helper;

public class Assgn_DeleteMultipleClassValidPage
{
		@FindBy(xpath = "//a[@id='row1checkbox']") WebElement row1checkbox;
		@FindBy(xpath = "//a[@id='deleteicon']") WebElement deleteicon;
		@FindBy(xpath = "//a[@href='DialogBox']") WebElement DialogBox;
		@FindBy(xpath = "//a[@href='YesButton']") WebElement YesBtnInDelete;
		@FindBy (xpath = ("//a[text()='Successful Assignment Deleted ")) @CacheLookup WebElement SuccessMsg;
		

	String Url= ConfigReader.getManageAssignPageurl();

	private WebDriver driver = Helper.getDriver();
	public Assgn_DeleteMultipleClassValidPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void ManageAssignPageUrl()
	{
		driver.get(Url);
	}
	public void Clickrow1chkbox()
	{
		row1checkbox.click();
	}
	public boolean deleteIconEnable()
	{
		if(deleteicon.isDisplayed())
		{
			if(deleteicon.isEnabled())
			{	
				return true;
			}
		}
		return false;

	}
	public void ShowDeleteAlertBox()
	{
		deleteicon.click();
		Alert alert = driver.switchTo().alert();
	      /*if(DialogBox.isDisplayed())
	      {
	    	  if(DialogBox.isEnabled())
	    	  {
	    		  return true;
	    	  }
	      }
		return false;	*/	       
	}
	public void AcceptAlert() 
	{
		//switch focus to alert
	     // Alert a = driver.switchTo().alert();
	      if(YesBtnInDelete.isDisplayed())
	      {
	    	  if(YesBtnInDelete.isEnabled())
	    	  {
	    		  YesBtnInDelete.click();	    	  }
	      }	 
	}
	public String SuccessMsg() {
		String text = SuccessMsg.getText();
		WebElement element =driver.findElement(By.xpath("//a/table/ tr[2]"));
		if(element.getText()== null) {
			System.out.println("not found");
		}
		
		return text;
		
	}
}
