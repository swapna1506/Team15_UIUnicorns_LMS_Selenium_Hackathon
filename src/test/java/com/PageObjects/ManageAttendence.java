package com.PageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.*;

public class ManageAttendence {
	WebDriver driver = Helper.getDriver();
	String url;
	public ManageAttendence(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = "//button[text() = 'Attendence']")
	@CacheLookup WebElement attendenceBtn;
	
	@FindBy(xpath = "//a[text()='Manage Attendance']") 	
	@CacheLookup 	WebElement attendanceHeader;

	@FindBy(xpath = "//a[text()= 'LMS-Learning Management System']")
	@CacheLookup WebElement titlePage;
	
	@FindBy(xpath= "//*[@id = 'delete'] ")
	@CacheLookup WebElement deleteIcon;
	
	@FindBy(xpath = "//a[text()= 'Student']")
	@CacheLookup WebElement student;
	
	@FindBy(xpath = "//a[text()= 'Program']")
	@CacheLookup WebElement program;
	
	@FindBy(xpath = "//a[text()= 'Batch']")
	@CacheLookup WebElement Batch;
	
	@FindBy(xpath = "//a[text()= 'Class']")
	@CacheLookup WebElement Class;
	
	@FindBy(xpath = "//a[text()= 'User']")
	@CacheLookup WebElement user;
	
	@FindBy(xpath = "//a[text()= 'Assignment']")
	@CacheLookup WebElement assignment;
	
	@FindBy(xpath = "//a[text()= 'Attendance']")
	@CacheLookup WebElement attendance;
	
	@FindBy(xpath = "//a[text()= 'Logout']")
	@CacheLookup WebElement logout;
	
	@FindBy(xpath = "//a[text() = '+ A New Attendance']")
	@CacheLookup WebElement newAttendance;
	
	@FindBy(xpath = "//a[text() = 'Search...']")
	@CacheLookup WebElement search;
	
	@FindBy(xpath = "/table/tbody/tr[1]/th")
	@CacheLookup WebElement headers;
	
	
	
	@FindBy(xpath ="/table/tbody/tr[1]/td")
	@CacheLookup WebElement rowData;
	
	@FindBy(xpath = "\"//a[text() = 'edit']")
	@CacheLookup WebElement EditIcon;
	
	@FindBy(xpath = "\"//a[text() = 'delete']")
	@CacheLookup WebElement deleteIconrow;
	
	@FindBy(xpath = "//[@id = 'sort']")
	@CacheLookup WebElement sortIcon;
	
	@FindBy(xpath = "//a[text()= 'checkbox']")
	@CacheLookup WebElement checkbox; 
	
	@FindBy(xpath = "//a[text()= 'entries']")
	@CacheLookup WebElement numberEntries;
	
	@FindBy(xpath = "//a[text() = 'total number']")
	@CacheLookup WebElement totalAttendences;
	
	
	public void clickattendenceBtn() {
		
		//Loggerload.info("click on attendence " +attendenceBtn.getText()+" button");
		//Utils.webClick(attendenceBtn);
		attendenceBtn.click();
	}
	
	public String validateHeader() {
		String text = attendanceHeader.getText();
		return text;
	}
	

	public String validateTitle() {
		String text = titlePage.getText();
		return text;
	}
	
	public void verifyDeleteIcon() {
		if(deleteIcon.isEnabled()) {
			System.out.println("Delete is Enabled");
		}
		else {
			System.out.println("Delete is disabled");
		}
		
	}

	public String validateStuField() {
		String text = student.getText();
		return text;
	}
	
	public String validateBatchField() {
		String text = Batch.getText();
		return text;
	}
	public String validateClassField() {
		String text = Class.getText();
		return text;
	}
	public String validateUserField() {
		String text = user.getText();
		return text;
	}
	public String validateAssignmentField() {
		String text = assignment.getText();
		return text;
	}
	public String validateAttendanceField() {
		String text = attendance.getText();
		return text;
	}
	public String validateLogoutField() {
		String text = logout.getText();
		return text;
	}

	public String validateProgramField() {
		String text = program.getText();
		return text;
	}

	public String verifyNewAttendance() {
		String text = newAttendance.getText();
		return text;
	}
	public String verifySearchbar() {
		String text = search.getText();
		return text;
	}
	
	public void validateBrokenLink() throws IOException {
		URL link = new URL(url);
		   HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
		   int response = httpcon.getResponseCode();
		   if(response == 400) {
			   System.out.println("broken link");
		   }
	}
	public List ValidateColumnHeaders() {
		List<WebElement> elements = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/table/tbody/tr[1]/th")));
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		return elements;
	}
	public void validateEditIcon() {
		if(rowData.isDisplayed()) {
			EditIcon.isEnabled();
		}
		else {
			System.out.println("Edit icon  is not present");
		}
		
	}
	public void validateDeleteIcon() {
		if(rowData.isDisplayed()) {
			deleteIconrow.isEnabled();
		}
		else {
			System.out.println("delete icon  is not present");
		}
		
	}
	
	public void validateSortIcon() {
		
		List<WebElement> elements =  new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/table/tbody/tr[1]/th")));
		for(WebElement element : elements) {
			if(element.getText()!= "Edit/Delete") {
		      sortIcon.isDisplayed();
	          }
		}
		
	}
	
	public void validateCheckbox() {
		List<WebElement> row =  new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/table/tbody/tr")));
		for(WebElement element:row) {
			checkbox.isDisplayed();
		}
		
	}
	public long validateNavTime(){
		long start = System.currentTimeMillis();
	   
	    WebDriverWait wait = new WebDriverWait(driver,null);
	    Utils.webClick(attendenceBtn);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("+New Attendance")));
	   
	    long end = System.currentTimeMillis();
	  long  navigationTime = end - start;
	  
	  return navigationTime;
		
	}
	
	public String validateEntries() {
		String text = numberEntries.getText();
		return text;
	}
	public String validateTotalAttendances() {
		String text = totalAttendences.getText();
		return text;
	}
	public void validatePagination() {
		List<WebElement> pagination =(List<WebElement>) driver.findElement(By.xpath("//div[@class='nav-pages']//a")); 
	

		if(pagination .size()>0){ 
		System.out.println("pagination exists"); 

		for(int i=0; i<pagination .size(); i++){ 
		pagination.get(i).isDisplayed();
		
		} 
		} else { 
		System.out.println("pagination not exists"); 
		} 
	}
}
