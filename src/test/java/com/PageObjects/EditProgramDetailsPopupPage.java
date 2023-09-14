package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditProgramDetailsPopupPage {

	public WebDriver driver;
	
	By getTitleByObj = By.xpath("");
	By clickSaveBtnByObj= By.xpath("");
	By clickCancelBtnByObj = By.xpath("");
	By clickCloseBtnByObj =By.xpath("");
	By pgmNameByObj = By.xpath("");
	By pgmDescriptionByObj = By.xpath("");
	   
	
	public EditProgramDetailsPopupPage (WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.findElement(getTitleByObj).getText();
	}

	public void clickSaveBtn() {
		driver.findElement(clickSaveBtnByObj).click();
	}

	public void clickCancelBtn() {
		driver.findElement(clickCancelBtnByObj).click();
	} 

	public void clickCloseBtn() {
		driver.findElement(clickCloseBtnByObj).click();
	}

	public void enterPgmName(String pgmName) {
		driver.findElement(pgmNameByObj).sendKeys(pgmName);
	}

	public void enterPgmDescription(String pgmDescription) {
		driver.findElement(pgmDescriptionByObj).sendKeys(pgmDescription);
	}

}