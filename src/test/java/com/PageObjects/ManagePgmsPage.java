package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagePgmsPage {

	
	public WebDriver driver;
	
	By getTitleByObj = By.xpath("");
	By editBtnByObj = By.xpath("");
	By deleteBtnByObj = By.xpath("");
	By searchTextBoxByObj = By.xpath("");
	By addNewpgmByObj = By.xpath("");
	By getFooterByObj = By.xpath("");
	
	
	public ManagePgmsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTite() {
		return driver.findElement(getTitleByObj).getText();
	}
	
	public void clickDeleteBtn() {
		driver.findElement(deleteBtnByObj).click();
	}
	
	public void clickEditBtn() {
		driver.findElement(editBtnByObj).click();
	}
	
}


