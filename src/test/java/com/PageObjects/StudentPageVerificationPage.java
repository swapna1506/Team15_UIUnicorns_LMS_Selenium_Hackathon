package com.PageObjects;

import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
import com.Utils.ConfigReader;

public class StudentPageVerificationPage {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public StudentPageVerificationPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }
	 
	 	 //Page Title-Assumption
		 @FindBy(tagName = "title")
		 WebElement getPageTitle;
		 
		 public String getPageTitle() {
		 return getPageTitle.getText();
		    }
		 
		 //Student Detail Title
		 @FindBy(id="studentDetail")
		 WebElement studentDetailTitle;
		 
		 public Point locateStudentDetailTitle() {
			 return studentDetailTitle.getLocation();
		 }
		 			 
		 //Student Dropdown
		 @FindBy(id="studentDropdown")
		 WebElement selectStudentDropdown;
		 
		 public boolean checkStudentNameSpelling(String dropdownName) {
			boolean isCorrectName = selectStudentDropdown.getText().equals(dropdownName);
			return isCorrectName;
			 
		 }
		 		 		  		 
		//Batch Id Dropdown
		 @FindBy(id="batchIdDropdown")
		 WebElement selectbatchIdDropdown;
		 
		 public boolean checkBatchIdSpelling(String dropdownName) {
				boolean isCorrectName = selectbatchIdDropdown.getText().equals(dropdownName);
				return isCorrectName;
				 
			 }
		 
		 
		 public boolean isDropdownVisible(String dropdownName) {
			 if (dropdownName.equalsIgnoreCase("Student Name"))
				 return selectStudentDropdown!=null;
			 else
				 if (dropdownName.equalsIgnoreCase("Batch Id"))
					 return selectbatchIdDropdown!=null;
				 else
					 return false;
		 }
		 
		 
		 
		 //Student Search Box
		 @FindBy(id="studentSeachBox")
		 WebElement studentSeachBox;
		 
		 //BatchID Search Box
		 @FindBy(id="batchIdSeachBox")
		 WebElement batchIdSearchBox;
		 
		 public boolean isSearchBoxVisible(String dropdownName) {
			 if (dropdownName.equalsIgnoreCase("Student Name")) {
				 selectStudentDropdown.click();
				 return studentSeachBox!=null;
			 }
			 else
				 if (dropdownName.equalsIgnoreCase("Batch Id")) {
					 selectbatchIdDropdown.click();
					 return batchIdSearchBox!=null;
				 }
				 else
					 return false;
		 }
		 
		 
		
		 @FindBy(className ="select-item")
		 List<WebElement> selectItems; // Assuming LMS title has a class "navbar-text-container"
		 
		 
		 public String firstDropDownTitle(String expectedLabel) {
			return selectItems.get(0).getText();
		 }
		 
		 public String secondDropDownTitle(String expectedLabel) {
				return selectItems.get(1).getText();
			 }
		 
		 public void scrollStudentDropdown() {
			 	JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectStudentDropdown);
		 }
		 
		 public void scrollBatchDropdown() {
			 	JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", selectbatchIdDropdown);
		 }
		 
		 public String selectNameFromStudentDropdown() {
			 Select studentNameDropdown = new Select(selectStudentDropdown);

		        // Selecting a student name, e.g., "Steve" (replace with the desired name or parameterize this)
		        studentNameDropdown.selectByVisibleText("Steve");
		        if(studentNameDropdown.getFirstSelectedOption()==null)
		        	return ("failed");
		        else
		        	return("Steve");
		 }
		 
		 public void clickStudentDropDown() {
			 selectStudentDropdown.click();
		 }
		 
}
