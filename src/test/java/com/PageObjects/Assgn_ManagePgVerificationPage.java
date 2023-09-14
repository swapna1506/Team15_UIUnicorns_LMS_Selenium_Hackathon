package com.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.StepDefinitions.$missing$;
import com.Utils.ConfigReader;
import com.Utils.ExcelReader;
import com.Utils.Helper;
import com.Utils.Utils;

//import com.PageObjects.;

public class Assgn_ManagePgVerificationPage 
{
	@FindBy(xpath = "//a[@href='NavigationBar']") WebElement NavigationBar;
	@FindBy(xpath = "//a[@href='Assignment']") WebElement AssignmentBtn;
	@FindBy(xpath = "//a[@href='Header']") WebElement Header;
	@FindBy(xpath = "//a[@href='DeleteIcon']") WebElement DeleteIcon;
	@FindBy(xpath ="//*[@name='searchbar']" ) WebElement SearchBar;
	@FindBy(xpath ="//*[@name='NewAssignment']" ) WebElement NewAssgnBtn;
	@FindBy(xpath ="/table/body/tr[1]/th") WebElement columnheaders;
	@FindBy(xpath = "//a[text()= 'Student']") @CacheLookup WebElement student;	
	@FindBy(xpath = "//a[text()= 'Program']") @CacheLookup WebElement program;
	@FindBy(xpath = "//a[text()= 'Batch']") @CacheLookup WebElement Batch;
	@FindBy(xpath = "//a[text()= 'Class']") @CacheLookup WebElement Class;
	@FindBy(xpath = "//a[text()= 'User']") @CacheLookup WebElement user;
	@FindBy(xpath = "//a[text()= 'Assignment']") @CacheLookup WebElement assignment;
	@FindBy(xpath = "//a[text()= 'Attendance']") @CacheLookup WebElement attendance;
	@FindBy(xpath = "//a[text()= 'Logout']") @CacheLookup WebElement logout;
	@FindBy(xpath ="/table/tbody/tr[1]/td") @CacheLookup WebElement rowData;
	@FindBy(xpath = "\"//a[text() = 'edit']") @CacheLookup WebElement EditIcon;
	@FindBy(xpath = "//[@id = 'sort']") @CacheLookup WebElement sortIcon;
	@FindBy(xpath = "//a[text() = 'total number']") @CacheLookup WebElement totalAssignments;
	@FindBy(xpath = "//a[@name='SearchBox']") WebElement SearchBox;
	
	static String excelFilePath = "./src/test/resources/ExcelSheetData/Assignment.xlsx";
	static ExcelReader excelUtils = new ExcelReader();

	String Url= ConfigReader.getApplicationUrl();
	String Url1= ConfigReader.getManageAssignPageurl();

	private WebDriver driver = Helper.getDriver();
	public Assgn_ManagePgVerificationPage()
	{
		PageFactory.initElements(driver, this);

	}
	public void openLmlPortal()
	{
		driver.get(Url);
	}
	public void ManageAssignPageUrl()
	{
		driver.get(Url1);
	}
	public void clickOnNavigationBar() 
	{			
		//NavigationBar.click();
		Utils.webClick(NavigationBar);

	}
	public void getResponsetime()
	{
		final JavascriptExecutor js = (JavascriptExecutor) driver;
	    // time of the process of navigation and page load
	    double loadTime = (Double) js.executeScript(
	        "return (window.performance.timing.loadEventEnd - window.performance.timing.navigationStart) / 1000");
	    System.out.print(loadTime + " seconds");
	}
	public void clickOnAssignmentBtn()
	{
		//AssignmentBtn.click();
		Utils.webClick(AssignmentBtn);

	}
	public String getPageHeader() 
	{			
		 return Header.getText();
	}
	public boolean DeleteIconDisabled()
	{
		boolean isdisplayed = DeleteIcon.isDisplayed();
		boolean isenabled =DeleteIcon.isEnabled();

		if(isdisplayed==true)
		{
			if(isenabled==false)
			{
			   return true;	
		    }
	    }
		return false;
	}
	public boolean searchBar()
	{
		return SearchBar.isDisplayed();
	}
	public boolean seeNewAssgBtn()
	{
		return NewAssgnBtn.isDisplayed();
	}
	public List ValidateColumnHeader()
	{
		List<WebElement> elements = new WebDriverWait(driver,Duration.ofSeconds
				(10)).until(ExpectedConditions.visibilityOfAllElements(columnheaders));
		for(WebElement element : elements)
		{
			System.out.println(element.getText());
		}
		return elements;
	}

	public String validateStuField() {
		String text = student.getText();
		return text;
	}
	public String validateProgramField() {
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
	public boolean validateEditIcon() {
		if(rowData.isDisplayed()) {
			EditIcon.isEnabled();
		}
		else {
			System.out.println("Edit icon  is not present");
			return false;
		}
		return true;
	}
	public boolean validateDeleteIcon() {
		if(rowData.isDisplayed()) {
			DeleteIcon.isEnabled();
		}
		else {
			System.out.println("Delete icon  is not present");
			return false;
		}
		return true;
	}
public boolean validateSortIcon() {
		
		List<WebElement> elements =  new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/table/tbody/tr[1]/th")));
		for(WebElement element : elements) 
		{
			if(element.getText()!= "Edit/Delete") 
			{
		       return sortIcon.isDisplayed();
	         }
		}	
		return false;
	}
	public boolean validatePagination() 
	{
		List<WebElement> pagination =(List<WebElement>) driver.findElement(By.xpath("//div[@class='nav-pages']//a")); 
		if(pagination .size()>0)
		{	 
			System.out.println("pagination exists"); 

			for(int i=0; i<pagination .size(); i++)
			{ 
				pagination.get(i).isDisplayed();
			} 
		return true;
		}
		else 
		{ 
			System.out.println("pagination not exists"); 
			return false;
		} 

	}
	public String validateTotalAttendances() {
		String text = totalAssignments.getText();
		return text;
	}
	public String TotalAssgInDataTable() 
	{
		List<WebElement> row =  new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/table/tbody/tr")));
		int number = row.size();
		String text = totalAssignments.getText();
		return text;
	    //String actualText = mp.validateTotalAttendances();
	}
	public void EnterAssignName() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"AssignmentName");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterWrongAssignName() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Wrong AssignmentName");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterAssignDescription() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Assignment Description");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterWrongAssignDescription() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Assignment Description");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterDueDate() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Assignment DueDate");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterWrongDueDate() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Wrong Assignment DueDate");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterGradeValue() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Assignment GradeValue");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
	public void EnterWrongGradeValue() throws IOException
	{
		excelUtils.setExcelFile(excelFilePath,"Wrong Assignment GradeValue");

		SearchBox.sendKeys(excelUtils.getCellData(1, 0));
		SearchBox.click();
	}
}
