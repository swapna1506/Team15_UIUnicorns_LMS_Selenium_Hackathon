package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Utils;


public class DeletePgmConfirmPopupPage{
	WebDriver driver = Helper.getDriver();
	
	public DeletePgmConfirmPopupPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy (xpath =("//a[text = 'Confirm']"))
	@CacheLookup WebElement cnfmPageTitle;
	
	@FindBy (xpath = ("//a[text() = 'Yes']"))
	@CacheLookup WebElement Yes;
	
	@FindBy (xpath = ("//a[text() = 'No']"))
	@CacheLookup WebElement No;
	
	@FindBy (xpath = ("//a[text() = 'close']"))
	@CacheLookup WebElement Close;

	
	public String getPageTitle() {
		return cnfmPageTitle.getText();
	}
	
	public void clickNoBtn() {
		Utils.webClick(No);
	}
	
	public void clickYesBtn() {
		Utils.webClick(Yes);
	} 
	
	public void clickCloseBtn() {
		Utils.webClick(Close);
	}
	
	public String getYesBtnName() {
		return Yes.getText();
	}
	
	public String getNoBtnName() {
		return No.getText();
	}
}