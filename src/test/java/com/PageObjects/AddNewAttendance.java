package com.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ExcelReader;
import com.Utils.Helper;

import junit.framework.Assert;

public class AddNewAttendance  {
	static ExcelReader excelUtils = new ExcelReader();
	 static String excelFilePath = ".\\src\\test\\resources\\ExcelData\\Team15_UIUnicorns_DataExcel.xlsx";
	WebDriver driver = Helper.getDriver();
	AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(Helper.getDriver());
	public AddNewAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = "//[@id = 'Program Name']")
	@CacheLookup WebElement pgmName;
	
	@FindBy(xpath = "//[@id = 'Class Name']")
	@CacheLookup WebElement clsName;
	
	@FindBy(xpath = "//[@id = 'Student Name']")
	@CacheLookup WebElement stuName;
	
	@FindBy(xpath = "//[@id = 'Attendance']")
	@CacheLookup WebElement att;
	
	@FindBy(xpath = "//[@id = 'Attendance Date']")
	@CacheLookup WebElement attDate;
	
	@FindBy(xpath = "//[@id = 'save']")
	@CacheLookup WebElement save;
	
	@FindBy(xpath = "\"//div[text()='Thanks for submitting the form']")
	@CacheLookup WebElement SuccessMessage;
	
	public void validateAddNewAttendance() throws IOException{
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(1,0));
		clsName.sendKeys(excelUtils.getCellData(1,1));
		stuName.sendKeys(excelUtils.getCellData(1,2));
		att.sendKeys(excelUtils.getCellData(1,3));
		attDate.sendKeys(excelUtils.getCellData(1,4));
		
		save.click();
	}
	public void validatesuccessmsg() {
		SuccessMessage.isDisplayed();
		Assert.assertEquals("SEP-23-UI-Unicorns-SDET-200", pgmName.getText());
	}
	
	public void NewAttendanceMissingPgmName() throws IOException {
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		
		clsName.sendKeys(excelUtils.getCellData(1,1));
		stuName.sendKeys(excelUtils.getCellData(1,2));
		att.sendKeys(excelUtils.getCellData(1,3));
		attDate.sendKeys(excelUtils.getCellData(1,4));
		
		save.click();
	}
	public void MissingPgmNameMsg() {
		WebElement MissingPgmName = driver.findElement(By.xpath("//div[text()='Program Name is missing']"));
		MissingPgmName.getText();
	}
	
	public void NewAttendanceMissingClsName() throws IOException {
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		
		pgmName.sendKeys(excelUtils.getCellData(1,0));
		stuName.sendKeys(excelUtils.getCellData(1,2));
		att.sendKeys(excelUtils.getCellData(1,3));
		attDate.sendKeys(excelUtils.getCellData(1,4));
		
		save.click();
	}
	public void MissingclsNameMsg() {
		WebElement MissingclsName = driver.findElement(By.xpath("//div[text()='Class Name is missing']"));
		MissingclsName.getText();
	}
	
	public void NewAttendanceMissingStuName() throws IOException{
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(1,0));
		clsName.sendKeys(excelUtils.getCellData(1,1));
		
		att.sendKeys(excelUtils.getCellData(1,3));
		attDate.sendKeys(excelUtils.getCellData(1,4));
		
		save.click();
	}
	
	public void NewAttendanceMissingAtt() throws IOException{
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(1,0));
		clsName.sendKeys(excelUtils.getCellData(1,1));
		stuName.sendKeys(excelUtils.getCellData(1,2));
		
		attDate.sendKeys(excelUtils.getCellData(1,4));
		
		save.click();
	}
	public void NewAttendanceMissingAttDate() throws IOException{
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(1,0));
		clsName.sendKeys(excelUtils.getCellData(1,1));
		stuName.sendKeys(excelUtils.getCellData(1,2));
		att.sendKeys(excelUtils.getCellData(1,3));
		
		
		save.click();
	}
	
	public void MissingstuNameMsg() {
		WebElement MissingStuName = driver.findElement(By.xpath("//div[text()='Student Name is missing']"));
		MissingStuName.getText();
	}
	public void MissingattMsg() {
		WebElement Missingatt = driver.findElement(By.xpath("//div[text()='attendance is missing']"));
		Missingatt.getText();
	}
	public void MissingattDate() {
		WebElement MissingattDate = driver.findElement(By.xpath("//div[text()='Attendance Date is missing']"));
		MissingattDate.getText();
	}
	public void validateAddNewAttendanceFutureDate() throws IOException{
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(2,0));
		clsName.sendKeys(excelUtils.getCellData(2,1));
		stuName.sendKeys(excelUtils.getCellData(2,2));
		att.sendKeys(excelUtils.getCellData(2,3));
		attDate.sendKeys(excelUtils.getCellData(2,4));
		
		save.click();
	}
	public void InvalidattDateMsg() {
		WebElement Invalidmsg = driver.findElement(By.xpath("//div[text()='Invalid attendance date']"));
		Invalidmsg.getText();
	}
	
}
