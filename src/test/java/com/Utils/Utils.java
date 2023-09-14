package com.Utils;


import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils 
{

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Random;
import java.util.Map;
import java.util.Random;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	

static String Excelpath = ConfigReader.getexcelfilepath(); //getexcelpath method in configreader
	
	public static int getRandomNum() {
		Random random = new Random();
		 return random.nextInt(100000);
				
	}
	//initialized in hooks
	public static WebDriver driver = Helper.getDriver(); //getting driver which is already initialized in helper class

	public static boolean webClick(WebElement element) {
		//to avoid no such element found exception
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			//to check if an element is visible on a page
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						ele.click();					
						return true;
					}
					catch(Exception e) {
						//to avoid undefined element exception
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean webSendKeys(WebElement element, String text) {
		//to avoid no such element found exception
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
		
		//to check if the element is displayed to locate
		if(ele.isDisplayed()) {
			if(ele.isEnabled()) {
				try {
					ele.clear();
					ele.sendKeys(text);
					return true;
				}
				catch(Exception e) {
					//to avoid element not found exception
					((JavascriptExecutor) driver).executeScript("arguments[0].value='"+text+"';", ele);
				}	
			}
			else {
				throw new Exception("Element is not enabled");
			}
		}
		else {
			throw new Exception("Element is not displayed");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
	}
}



