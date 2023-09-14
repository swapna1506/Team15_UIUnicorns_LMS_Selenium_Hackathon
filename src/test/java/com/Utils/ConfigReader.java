package com.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import driverFactoryPkg.DriverFactory;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/Config/config.properties";
	private static String browserType = null;

	public static Properties loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
		return properties;
	}

	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		Loggerload.info("Get property BrowserType");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}


	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	public static String getPageurl() 
	{
		String url = Helper.getDriver().getCurrentUrl();
		System.out.println("\\n****URL**"+ url);
		return url;
		
	}
	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelfilepath");
		if (excelfilelpath != null)
			return excelfilelpath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}
	public static String getManageAssignPageurl()
	{
		String url = properties.getProperty("MngAssgnUrl");
		return url;
	}
	public static String getEditAssignPageurl()
	{
		String url = properties.getProperty("EditAssgnUrl");
		return url;
	}

}
