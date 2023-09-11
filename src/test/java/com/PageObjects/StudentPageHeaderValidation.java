package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;

public class StudentPageHeaderValidation {
	
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public StudentPageHeaderValidation(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }
	 
	 //Program Link -Assumption
	 @FindBy(name = "Program")
	 WebElement programLink;
	 
	 //Batch Link -Assumption
	 @FindBy(name = "Batch")
	 WebElement batchLink;
	 
	 //Class Link -Assumption
	 @FindBy(name = "Class")
	 WebElement classLink;
	 
	 //User Link -Assumption
	 @FindBy(name = "User")
	 WebElement userLink;
	 
	 //Assignment Link -Assumption
	 @FindBy(name = "Assignment")	
	 WebElement assignmetLink;
	 
	 //Attendance Link -Assumption
	 @FindBy(name = "Attendance")
	 WebElement attendanceLink;
	  
	 //Logout Link -Assumption
	 @FindBy(name = "Logout")
	 WebElement logoutBtn; 
	 


public void clickProgramLink() {
	programLink.click();

}
	
public void clickBatchLink() {
	batchLink.click();
}

public void clickClassLink() {
	classLink.click();
	
}

public void clickUserLink() {
	userLink.clear();

}

public void clickAssignmentLink() {
	assignmetLink.click();
}
	
public void clickAttendanceLink() {
attendanceLink.click();
}

public void clickLogoutLink() {
	logoutBtn.click();
}
}
	
