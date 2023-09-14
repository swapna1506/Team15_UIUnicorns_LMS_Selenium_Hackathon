package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;

public class DeleteMultipleAttendance {
	
WebDriver driver = Helper.getDriver();
	
	public DeleteMultipleAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = ("//table/tr[5]input[type = 'checkbox']"))
	@CacheLookup WebElement checkbox;
	@FindBy(xpath = ("//table/tr[i]input[type = 'checkbox']"))
	@CacheLookup WebElement multiplecheckbox;
	
	@FindBy(xpath = ("//*[@id = 'content']/div[1]/div[2]/button[@id = 'delete']"))
	@CacheLookup WebElement Delete;
	
	@FindBy (xpath = ("//a[@id = 'confirm']"))
	@CacheLookup WebElement Alert;
	
	@FindBy (xpath = ("//a[text()='Successful Attendance Deleted "))
	@CacheLookup WebElement successMsg;
	
	@FindBy (xpath = ("//a[text = 'Manage attendance']"))
	@CacheLookup WebElement AttendancePage;
	
	public void ClickCheckbox() {
		checkbox.click();
		
		checkbox.isSelected();
	}
	
	public void EnableDelete() {
		Delete.isEnabled();
	}
	
	public void ClickMultipleRow() {
		for(int i=0; i<=2;i++) {
			multiplecheckbox.click();
			
		}
	}
	
	public void SelectCheckbox() {
		if(multiplecheckbox.isSelected()) {
			multiplecheckbox.getText();
		}
	}
	
	public void Alertbox() {
		Delete.click();
		Alert.isDisplayed();
		
	}
	public String ConfirmsingleDeletionMsg() {
		String text = successMsg.getText();
		return text;
	}
	
	public String ConfirmMsg() {
		String text = successMsg.getText();
		WebElement element =driver.findElement(By.xpath("//a/table/ tr/[@id = 'Checkbox][i]"));
		for(int i=0;i<=2;i++) {
		if(element.getText()== null) {
			System.out.println("not found");
		}
		else {
			AttendancePage.isDisplayed();
			System.out.println("not deleted");
		}
		}
		
		return text;
		
	}	
	public void AlertMultipleCheckBox() {
		
		WebElement element =driver.findElement(By.xpath("//a/table/ tr/[@id = 'checkbox'][i]"));
		
		for(int i=0;i<=2;i++) {
			element.click();
		}
		Alert.isDisplayed();
		
		
	}
	

}
