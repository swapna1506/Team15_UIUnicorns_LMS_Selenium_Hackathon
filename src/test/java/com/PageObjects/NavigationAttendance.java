package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Helper;

public class NavigationAttendance {
	
WebDriver driver = Helper.getDriver();
	
	public NavigationAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = ("//a8[@id = 'Student']"))
	@CacheLookup WebElement stu;
	
	@FindBy(xpath = ("//a8[@id = 'Program']"))
	@CacheLookup WebElement pgm;
	
	@FindBy(xpath = ("//a8[@id = 'Batch']"))
	@CacheLookup WebElement btch;
	
	@FindBy(xpath = ("//a8[@id = 'class']"))
	@CacheLookup WebElement cls;
	
	@FindBy(xpath = ("//a8[@id = 'Assignment']"))
	@CacheLookup WebElement assignment;
	
	@FindBy(xpath = "//a[text()='Student Deatails']") 	
	@CacheLookup 	WebElement studentHeader;
	
	@FindBy(xpath = "//a[text()='Manage Program']") 	
	@CacheLookup 	WebElement programHeader;
	
	@FindBy(xpath = "//a[text()='Manage Batch']") 	
	@CacheLookup 	WebElement batchHeader;
	
	@FindBy(xpath = "//a[text()='Manage class']") 	
	@CacheLookup 	WebElement classHeader;
	
	@FindBy(xpath = "//a[text()='Manage Assignment']") 	
	@CacheLookup 	WebElement assignmentHeader;
	
	@FindBy(xpath = "//a[text()='Please login to LMs Application']") 	
	@CacheLookup 	WebElement login;
	
	
	
	public void clickStudent() {
		stu.click();
	}
	public void clickprogram() {
		pgm.click();
	}
	
	public void clickbatch() {
		btch.click();
	}
	public void clickclass() {
		cls.click();
	}
	
	public void clickAssignment() {
		assignment.click();
	}
	public String validateStudent() {
		String text = studentHeader.getText();
		return text;
	}
	public String validateProgram() {
		String text = programHeader.getText();
		return text;
	}
	
	public String validateBatch() {
		String text = batchHeader.getText();
		return text;
	}
	
	public String validateClass() {
		String text = classHeader.getText();
		return text;
	}
	public String validateAssignment() {
		String text = assignmentHeader.getText();
		return text;
	}
	public String validateLogin() {
		String text = login.getText();
		return text;
	}
	
}

