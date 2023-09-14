package com.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.PageObjects.*;
import com.Utils.Helper;
import com.Utils.Utils;

public class PaginationAttendance {
	
WebDriver driver = Helper.getDriver();
	
	public PaginationAttendance(WebDriver webDriver) {
		PageFactory.initElements(webDriver,this);
	}

	
	@FindBy(xpath = "//button[text() = 'Attendence']")
	@CacheLookup WebElement AttendenceBtn;
	
	@FindBy(xpath = "//*[@id = \'pager'\']li[1]/a")
	@CacheLookup WebElement FirstPage;
	
	@FindBy(xpath = "//*[@id = \'pager'\']li[2]/a")
	@CacheLookup WebElement SecondPage;
	
	
	@FindBy(xpath = "//*[@aria-label='>'")
	@CacheLookup WebElement Rightarrow;
	
	@FindBy(xpath = "//*[@aria-label='<'")
	@CacheLookup WebElement Leftarrow;
	
	@FindBy(xpath = ("//div[@class ='pagination-container']//a"))
	@CacheLookup WebElement Pagination;
	
	List<WebElement> rows =driver.findElements(By.xpath(".//8[@id ='leftcontainer']/table/tbody/tr/td[1]"));
	
	@FindBy(xpath = "//a[text() = '+ Add New Attendance']")
	@CacheLookup WebElement NewAttendance;
	
	@FindBy (xpath = "//a[text() = 'Attendance Details']")
     @CacheLookup WebElement DetailsPopup;
	
	public void ClickAttendance() {
		Utils.webClick(AttendenceBtn);
	}
	
	public void DisplayfirstPage() {
		FirstPage.isDisplayed();
	}

	public void EnableRightarrow() {
		List<WebElement> rows =driver.findElements(By.xpath(".//8[@id ='leftcontainer']/table/tbody/tr/td[1]"));
		
		if(rows.size()>5) {
			Rightarrow.isEnabled();
			
		}
	}
	
	public void DisableLeftArrow() {
		boolean fpage= FirstPage.isDisplayed();
		boolean larrow= Leftarrow.isEnabled();
		while(fpage==true) {
			List<WebElement> rows =driver.findElements(By.xpath(".//8[@id ='leftcontainer']/table/tbody/tr/td[1]"));
			
			if(rows.size()>5) {
			larrow= false;
		}
		}
	}
	
	public void RightLeftArrowsPage2() {
		
List<WebElement> rows =driver.findElements(By.xpath(".//8[@id ='leftcontainer']/table/tbody/tr/td[1]"));
		
		if(rows.size()>10) {
			Rightarrow.isEnabled();
			Leftarrow.isEnabled();
		}
		
	}
	public void DisableRightArrow() {
		
				boolean page2 = SecondPage.isDisplayed();
				boolean rarrow= Rightarrow.isEnabled();
				while(page2==true) {
		             if(rows.size()<10) {
		            	 rarrow = false;
		             }
			}
		
	}
	public void EnableDisablePagination() {
		
		boolean pagination = Pagination.isEnabled();
		if(rows.size()>5) {
			pagination=true;
		}
		else {
			pagination = false;
		}
	}
	
	public void newattendance() {
		NewAttendance.click();
		DetailsPopup.isDisplayed();
	}
	
	public void create6attendences(){
		for(int i =0;i<=6;i++){
			
		}
	}
	public void NextPageEnable() {
		
		if(rows.size()>5) {
			Rightarrow.isEnabled();
		}
	}
	public void disablerightarrow() {
		boolean rarrow= Rightarrow.isEnabled();
		if(rows.size()<5) {
		rarrow = false;	
		}
	}
}
