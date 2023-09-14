package com.PageObjects;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.ArrayList;

import com.Utils.Helper;
import com.Utils.Utils;

import junit.framework.Assert;

import java.text.*;
public class AttendanceDetails1 {
	
	WebDriver driver = Helper.getDriver();
	AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(Helper.getDriver());
	public AttendanceDetails1(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = ("//[text() = 'Select a Program name']"))
	@CacheLookup WebElement pgmnamedropdown;
	
	@FindBy(xpath = ("//[text() = 'Select a class name']"))
	@CacheLookup WebElement clsnamedropdown;
	
	@FindBy(xpath = ("//[text() = 'Select Attendance']"))
	@CacheLookup WebElement attendancedropdown;
	
	@FindBy(xpath = ("//form/input[@name = 'Attendance Date']"))
	@CacheLookup WebElement Datepicker;
	
	@FindBy(xpath = ("//[text() = 'Select Attendance date']"))
	@CacheLookup WebElement DateDropdown;
	
	@FindBy(xpath = ("//div[@class='datepicker-arrow']//button[2]"))
	@CacheLookup WebElement DateRightarrow;
	
	@FindBy(xpath = ("//div[@class='datepicker-arrow']//button[1]"))
	@CacheLookup WebElement DateLeftarrow;
	
	@FindBy(xpath = ("//a[@id ='btn-current-date'][@color='highlighted']"))
	@CacheLookup WebElement HighlightedDate;
	
	
	public void verifyAllprogramNames() {
		Select select= new Select(driver.findElement(By.xpath("//*[@id = 'Program Name']")));
		ArrayList<String> list = new ArrayList<>();
		for(WebElement element: select.getOptions()) {
			list.add(element.getText());
			
		}
	}
	public void verifyAllclassNames() {
		Select select= new Select(driver.findElement(By.xpath("//*[@id = 'Class Name']")));
		ArrayList<String> list1 = new ArrayList<>();
		for(WebElement element: select.getOptions()) {
			list1.add(element.getText());
			
		}
	}
	
	public void ClickProgramnamedropdown() {
		Utils.webClick(pgmnamedropdown);
		
	}
	public void ClickClassnamedropdown() {
		Utils.webClick(clsnamedropdown);
		
	}
	public void ClickAttendancedropdown() {
		Utils.webClick(attendancedropdown);
		
	}
	public List verifyAllattendances() {
		Select select= new Select(driver.findElement(By.xpath("//*[@id = 'Attendances']")));
		ArrayList<String> list2 = new ArrayList<>();
		for(WebElement element: select.getOptions()) {
			list2.add(element.getText());
			
		}

return list2;
	}
	public void ClickDatePicker() {
		Datepicker.click();
	}
	
	public void ValidateSelecteddate() {
		String date ="" ;
		List<WebElement> columns = Datepicker.findElements(By.tagName("td"));
		for(WebElement cell: columns) {
			if(cell.getText().equals("4")) {
				cell.findElement(By.linkText("4")).click();
				break;
			}
			date = cell.getText();
		}
		
		Assert.assertEquals(date, DateDropdown.getText());
	}
	public void ValidateDateFormat()  {
		Date date = null;
		DateFormat dateformat = new SimpleDateFormat("mm/dd/yyyy");
		
		try {
			date = dateformat.parse(DateDropdown.getText());
			System.out.println("Valid Format");
		} catch (ParseException e) {
			System.out.println("inValid Format");
		}
		
		}
	public void validateRightarrow() {
		DateRightarrow.click();
				Assert.assertEquals(driver.getTitle(), "next month");
	}
	
	public void validateLeftarrow() {
		DateLeftarrow.click();
	}
	
	public String validateHighlightedDate() {
		 HighlightedDate.isSelected();
	String date = HighlightedDate.getText();
	return date;
	}
	
	public void ValidateHighlighteddateSelect() {
		HighlightedDate.isSelected();
		
	}
	
}
