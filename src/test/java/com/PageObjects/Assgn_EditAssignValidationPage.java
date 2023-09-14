package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;

public class Assgn_EditAssignValidationPage 
{
	private WebDriver driver = Helper.getDriver();
	@FindBy(xpath = "//a[@href='EditButton']") WebElement editBtn;

	public Assgn_EditAssignValidationPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void Editpopupwdw()
	{
		editBtn.click();
		
	}
	public void EditAssgPopupwdw()
	{
		driver.getWindowHandle().;
	}

}
