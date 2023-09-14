package com.PageObjects;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Utils.Helper;

public class AttendanceDetails {

	WebDriver driver = Helper.getDriver();
	String url;
	int winHeight = driver.manage().window().getSize().getHeight();
	int winWidth = driver.manage().window().getSize().getWidth();
	public AttendanceDetails(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = "//a[text() = '+ A New Attendance']")
	@CacheLookup WebElement newAttendance;
	
	@FindBy(xpath = "//a[text() = 'Attendance Details']")
	@CacheLookup WebElement AttendanceDetails;
	
	@FindBy(xpath = "//a[text() = 'ProgramName']")
	@CacheLookup WebElement ProgramName;
	
	@FindBy(xpath = "//a[text() = 'ClassName']")
	@CacheLookup WebElement Classname;
	@FindBy(xpath = "//a[text() = 'StudentName']")
	@CacheLookup WebElement Studentname;
	
	@FindBy(xpath = "//a[text() = 'Attendance']")
	@CacheLookup WebElement Attendance;
	
	@FindBy(xpath = "//a[text() = 'Attendance Date']")
	@CacheLookup WebElement Attendancedate;
	
	@FindBy(xpath = "//select[options]")
	@CacheLookup WebElement dropdown;
	
	@FindBy(xpath = "//select[options][text()='Select a Program name']")
	@CacheLookup WebElement Programnamedropdown;
	
	@FindBy(xpath = "//select[options][text()='Select Class name']")
	@CacheLookup WebElement classnamedropdown;
	
	@FindBy(xpath = "//select[options][text()='Select students']")
	@CacheLookup WebElement studentsdropdown;
	
	@FindBy(xpath = "//select[options][text()='Select attendance']")
	@CacheLookup WebElement Attendancedropdown;
	 
	@FindBy(xpath = "(//button[@type='button'][text[] = 'save'])")
	@CacheLookup WebElement savebutton;
	
	@FindBy(xpath = "(//button[@type='button'][text[] = 'cancel'])")
	@CacheLookup WebElement cancelbutton;
	
	
	
	@FindBy(xpath = "(//button[@type='button'])")
	@CacheLookup WebElement closebutton;
	
	public void ClickNewAttendance() {
		newAttendance.click();
	}
	public String ValidateAttendanceDetails() {
		String text = AttendanceDetails.getText();
		return text;
	}
	
	public String ValidateProgramName() {
		String text = ProgramName.getText();
		return text;
	}
	
	public String ValidateClassName() {
		String text = Classname.getText();
		return text;
	}
	
	public String ValidateStudentName() {
		String text = Studentname.getText();
		return text;
	}
	
	public String ValidateAttendance() {
		String text = Attendance.getText();
		return text;
	}
	
	public String ValidateAttendancedate() {
		String text = Attendancedate.getText();
		return text;
	}
	
	public void ValidateDropdown() {
		List<WebElement> elements = new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[options]")));
		for(WebElement element : elements) {
			if(element.isEnabled()) {
				System.out.println("dropdown is enabled");
			}
			else {
				System.out.println("dropdown is not enabled");
			}
		}
	}
	
	public void ValidateClosebutton() {
		closebutton.isDisplayed();
	}
	
	public void validateAlignmentClose(){
		int x = closebutton.getLocation().getX();
		int y = closebutton.getLocation().getY();
		int eleHeight = closebutton.getSize().getHeight();
		int eleWidth =closebutton.getSize().getWidth();
		boolean rightAlignment = (((x+eleWidth)<= winWidth/2) && (y + eleHeight)<= winHeight/2);
		Assert.assertTrue(rightAlignment);
		
	}
	
	public void ValidateProgramNameDropdown() {
		Programnamedropdown.isDisplayed();
	}
	
	public void ValidateClassNameDropdown() {
		classnamedropdown.isDisplayed();
	}
	
	public void ValidateStudentsNameDropdown() {
		studentsdropdown.isDisplayed();
	}
	public void ValidateAttendanceDropdown() {
		Attendancedropdown.isDisplayed();
	}
	
	public void validateColor() {
		List<WebElement> elements = driver.findElements(By.xpath("\"//select[options][value]\""));
		for(WebElement element:elements) {
			String color =element.getCssValue("color");
			if(color == "Grey") {
				System.out.println(element.getText()+"is in grey color");
			}
			else {
				System.out.println(element.getText()+"is  not in grey color");
			}
		}
		
	}
	
	public String validateSaveButton() {
		String text = savebutton.getText();
		return text;
	}
	
	public String validateCancelButton() {
		String text = cancelbutton.getText();
		return text;
	}
	
	public void VerifyDetailsOrder() {
		ArrayList<String> list = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//select[options]"));
		for(WebElement we:elements) {
			list.add(we.getText());
		}
		ArrayList<String> actualList =new ArrayList<>();
		actualList.add("Program Name");
		actualList.add("Class Name");
		actualList.add("Student Name");
		actualList.add("Attendance");
		actualList.add("Attendance Date");
		
		Assert.assertEquals(actualList,list);
		
		
	}
}
