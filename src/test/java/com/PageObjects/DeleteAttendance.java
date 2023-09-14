package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;
import com.Utils.Utils;

public class DeleteAttendance {
	WebDriver driver = Helper.getDriver();
	
	public DeleteAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy (xpath =("//a[contains(text(),'Delete'][2]"))
	@CacheLookup WebElement Delete;
	
	@FindBy (xpath = ("//a[text() = 'Confirm']"))
	@CacheLookup WebElement alert;
	
	@FindBy (xpath = ("//a[text() = 'Yes']"))
	@CacheLookup WebElement Yes;
	
	@FindBy (xpath = ("//a[text() = 'No']"))
	@CacheLookup WebElement No;
	
	@FindBy (xpath = ("//a[text()='Successful Attendance Deleted "))
	@CacheLookup WebElement SuccessMsg;
	
	@FindBy (xpath = ("//a[text = 'Manage attendance']"))
	@CacheLookup WebElement attendancePage;
	
	public void ValidateDeleteAlert() {
		Utils.webClick(Delete);
	}
	public void DisplayAlert() {
		Utils.webClick(alert);
		alert.isDisplayed();
	}
	
	public void yesnoEnabled() {
		Yes.isEnabled();
		No.isEnabled();
	}
	public void ClickYes() {
		Utils.webClick(Yes);
	}
	public void ClickNo() {
		Utils.webClick(No);
	}
	
	public String SuccessMsg() {
		String text = SuccessMsg.getText();
		WebElement element =driver.findElement(By.xpath("//a/table/ tr[2]"));
		if(element.getText()== null) {
			System.out.println("not found");
		}
		
		return text;
		
	}
	public void Navigatetoattemdancepage() {
		attendancePage.isDisplayed();
		WebElement element =driver.findElement(By.xpath("//a/table/ tr[2]"));
		if(element.getText()!= null) {
			System.out.println("Attendance not deleted");
		}
		
	}

}
