package com.PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.Utils.ConfigReader;
import com.Utils.ExcelReader;
import com.Utils.Helper;

import io.cucumber.java.it.Date;

public class Assgn_AddNewAssignmentPage 
{
	@FindBy(xpath = "//a[@href='programname']") WebElement programnameicon;
	@FindBy(xpath = "//a[@href='Batchnumber']") WebElement BatchNumIcon;
	@FindBy(xpath = "//a[@href='AssignmentName']") WebElement AssgnNameIcon;
	@FindBy(xpath = "//a[@href='AssignmentDueDate']") WebElement AssignDueDateIcon;
	@FindBy(xpath = "//a[@href='GradeBy']") WebElement GradeBYIcon;
	@FindBy(xpath = "//a[@href='DatePicker']") WebElement DatePicker;
	@FindBy(xpath = "//a[@href='DatePickerRighttArrow']") WebElement DatePickerRtArrow;
	@FindBy(xpath = "//a[@href='DatePickerLeftArrow']") WebElement DatePickerLtArrow;
	//@FindBy(xpath="//table[@id='DataTable']//tr") WebElement DataTableRow;
	//@FindBy(xpath="//table[@id='DataTable']//th") WebElement DataTableCol;
	@FindBy(xpath = ("//a[@id ='btn-current-date'][@color='highlighted']"))
	@CacheLookup WebElement HighlightedDate;
	@FindBy(xpath = "//a[@href='Popupframe']") WebElement PopupFrame;
	@FindBy(xpath = "//a[@href='save']") WebElement savebtn;

	static String excelFilePath = "./src/test/resources/ExcelSheetData/Assignment.xlsx";
	static ExcelReader excelUtils = new ExcelReader();

	private WebDriver driver = Helper.getDriver();
	int rowcount=driver.findElements(By.xpath("//table[@id='DataTable']//tr")).size();
	int colcount=driver.findElements(By.xpath("//table[@id='DataTable']//th")).size();

	public void AssDetailsPopupWnw()
	{
		AssgnNameIcon.click();
		driver.switchTo().frame(PopupFrame);
	}
    public void ClickDatePicker()
    {
    	DatePicker.click();
    }
    public void ClickRightArrowDatePicker()
    {
    	DatePickerRtArrow.click();
    }
    public void ClickLeftArrowDatePicker()
    {
    	DatePickerLtArrow.click();
    }
    public void EnterBatchnumber() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void EnterProgramname() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }public void EnterAssignName() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void EnterGradeBy() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void EnterAssgnDueDate() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void FieldValuesindatatable()
    {
    	for(int i=1;i<rowcount;i++)
    	{
        	for(int j=1;j<=colcount;i++)
        	{
        		String datatablelist = driver.findElement(By.xpath("/table[@id=\\Datatable\\\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();   
        		System.out.println(datatablelist);
        	}

    	}
    }
    public String AlertMessage()
    {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
    }
    public void WrongEnterBatchnumber() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void WrongEnterProgramname() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }public void WrongEnterAssignName() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void WrongEnterGradeBy() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void WrongEnterAssgnDueDate() throws IOException
    {
    	excelUtils.setExcelFile(excelFilePath,"Field Values");
    	savebtn.sendKeys(excelUtils.getCellData(1, 0));
    	savebtn.click();
    }
    public void MissingAssgnNameMsg() 
    {
		WebElement MissingAssgnName = driver.findElement(By.xpath("//div[text()='Assignment Name is missing']"));
		MissingAssgnName.getText();
    }
    public void MissingGradeByMsg() 
    {
		WebElement MissingGradeBy = driver.findElement(By.xpath("//div[text()='GradeBy is missing']"));
		MissingGradeBy.getText();
    } 
    public void MissingDueDateMsg() 
    {
		WebElement MissingDueDate = driver.findElement(By.xpath("//div[text()='Assignment Due Date is missing']"));
		MissingDueDate.getText();
    } 
    public void MissingPgmNameMsg() 
    {
		WebElement MissingPgmName = driver.findElement(By.xpath("//div[text()='Program Name is missing']"));
		MissingPgmName.getText();
    } 
    public void MissingBatchNumberMsg() 
    {
		WebElement MissingBatchNumber = driver.findElement(By.xpath("//div[text()='Batch Number is missing']"));
		MissingBatchNumber.getText();
    }
    
    public String validateHighlightedDate() {
		 HighlightedDate.isSelected();
	String date = HighlightedDate.getText();
	return date;
	}
	
	public void ValidateSelecteddateHighlighted()
	{
		HighlightedDate.isSelected();
	}	
}
