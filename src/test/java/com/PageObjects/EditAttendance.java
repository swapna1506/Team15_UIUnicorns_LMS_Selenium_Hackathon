package com.PageObjects;
import com.PageObjects.AddNewAttendance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ExcelReader;
import com.Utils.Helper;

import junit.framework.Assert;

public class EditAttendance  {
	
	static ExcelReader excelUtils = new ExcelReader();
	 static String excelFilePath = ".\\src\\test\\resources\\ExcelData\\Team15_UIUnicorns_DataExcel.xlsx";
	WebDriver driver = Helper.getDriver();
	AttendanceDetails adp = new AttendanceDetails(driver);
	ManageAttendence mp =new ManageAttendence(Helper.getDriver());
	public EditAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy (xpath = ("//[@id = 'Edit']"))
	@CacheLookup WebElement Edit;
	
	@FindBy(xpath = ("//[@id = 'checkbox']"))
	@CacheLookup WebElement checkbox;
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
	
	@FindBy(xpath = "\"//div[text()='Thanks for updating the form']")
	@CacheLookup WebElement updateSuccessMessage;
	
	public void UpdateAttendance() throws IOException {
		
		checkbox.click();
		Edit.click();
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.sendKeys(excelUtils.getCellData(3,0));
		clsName.sendKeys(excelUtils.getCellData(3,1));
		stuName.sendKeys(excelUtils.getCellData(3,2));
		att.sendKeys(excelUtils.getCellData(3,3));
		attDate.sendKeys(excelUtils.getCellData(3,4));
		
		save.click();
		
	}
	public void UpdateSuccessMsg() {
		updateSuccessMessage.isDisplayed();
		
	}
	
public void UpdateAttMissingPgmName() throws IOException {
		
		checkbox.click();
		Edit.click();
		excelUtils.setExcelFile(excelFilePath,"Attendance");
		pgmName.clear();
		clsName.sendKeys(excelUtils.getCellData(4,1));
		stuName.sendKeys(excelUtils.getCellData(4,2));
		att.sendKeys(excelUtils.getCellData(4,3));
		attDate.sendKeys(excelUtils.getCellData(4,4));
		
		save.click();
		
	}

public void UpdateAttMissingClsName() throws IOException {
	
	checkbox.click();
	Edit.click();
	excelUtils.setExcelFile(excelFilePath,"Attendance");
	clsName.clear();
	pgmName.sendKeys(excelUtils.getCellData(4,0));
	stuName.sendKeys(excelUtils.getCellData(4,2));
	att.sendKeys(excelUtils.getCellData(4,3));
	attDate.sendKeys(excelUtils.getCellData(4,4));
	
	save.click();
	
}

public void UpdateAttMissingstuName() throws IOException {
	
	checkbox.click();
	Edit.click();
	excelUtils.setExcelFile(excelFilePath,"Attendance");
	stuName.clear();
	clsName.sendKeys(excelUtils.getCellData(4,1));
	pgmName.sendKeys(excelUtils.getCellData(4,0));
	att.sendKeys(excelUtils.getCellData(4,3));
	attDate.sendKeys(excelUtils.getCellData(4,4));
	
	save.click();
	
}

public void UpdateAttMissingAttendance() throws IOException {
	
	checkbox.click();
	Edit.click();
	excelUtils.setExcelFile(excelFilePath,"Attendance");
	att.clear();
	clsName.sendKeys(excelUtils.getCellData(4,1));
	stuName.sendKeys(excelUtils.getCellData(4,2));
	pgmName.sendKeys(excelUtils.getCellData(4,0));
	attDate.sendKeys(excelUtils.getCellData(4,4));
	
	save.click();
	
}

public void UpdateAttMissingattDate() throws IOException {
	
	checkbox.click();
	Edit.click();
	excelUtils.setExcelFile(excelFilePath,"Attendance");
	attDate.clear();
	clsName.sendKeys(excelUtils.getCellData(4,1));
	stuName.sendKeys(excelUtils.getCellData(4,2));
	att.sendKeys(excelUtils.getCellData(4,3));
	pgmName.sendKeys(excelUtils.getCellData(4,0));
	
	save.click();
	
}
public void UpdateAttinvaliddate() throws IOException {
	
	checkbox.click();
	Edit.click();
	excelUtils.setExcelFile(excelFilePath,"Attendance");
	pgmName.sendKeys(excelUtils.getCellData(4,0));
	clsName.sendKeys(excelUtils.getCellData(4,1));
	stuName.sendKeys(excelUtils.getCellData(4,2));
	att.sendKeys(excelUtils.getCellData(4,3));
	attDate.sendKeys(excelUtils.getCellData(4,4));
	
	save.click();
	
}

}
