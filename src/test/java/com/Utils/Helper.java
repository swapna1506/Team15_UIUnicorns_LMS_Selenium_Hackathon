package com.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Utils.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	private static Helper Helper;    
	public static WebDriver driver ;

	
	public final static int TIMEOUT = 2;


	private Helper() {
		

		WebDriverManager.chromedriver().setup(); //setting up and initializing webdriver
		
		//Resolving the chrome chrome websocket error

		System.setProperty("webdriver.http.factory","jdk-http-client");
		
			
		
		 driver = new ChromeDriver();


		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}

	public static void openPage(String url) throws InterruptedException {
		
		driver.get(url);
		Thread.sleep(2000);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void NavBack() {
		driver.navigate().back();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (Helper==null) {
			Helper = new Helper();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
		driver.close();
		driver.quit();
		}
		Helper = null;
	}

}
