package com.Utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import driverFactoryPkg.DriverFactory;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/Config//config.properties";
	private static String browserType = null;


	public static Properties loadConfig() throws Throwable {


	private static Properties prop=null;
	
	public static Properties init_properties()

	{
		  prop = new Properties();
		  try 
		  {
		   FileInputStream ip = new FileInputStream("C:\\Users\\preet\\OneDrive\\Documents\\SeleniumProjects\\DSAlgoProject_new\\src\\test\\resources\\config\\config.properties");
		   try 
		   {
		    prop.load(ip);
		    ip.close();
		   } 
		   catch (IOException e) 
		   {
		    e.printStackTrace();
		   }
		  } 
		  catch (FileNotFoundException e)
		  {
		   e.printStackTrace();
		  }

		  return prop;
		 }
	
	public static void loadConfig() throws Throwable {


  public static void loadConfig() throws Throwable {


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

	
	public static String geturl(String pagename) {
		String url = properties.getProperty(pagename);
		if (url != null)
			return url;
		else
			throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
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

	
	 public static String getInvocationMode() 
	 {
	 	if(prop==null)	
	 	init_properties();
	 		
	 	  String invocation_mode = prop.getProperty("invocation_mode");//System.out.println(invocation_mode);
	 	  if (invocation_mode != null)
	 	   return invocation_mode;
	 	  else
	 	   throw new RuntimeException("Browser is  not specified in the config.properties file.");
	 	 }
	 
	 public static String getUserName() 
	 {
		 if(prop==null)	
				init_properties();
	  String username = prop.getProperty("username");
	  if (username != null)
	   return username;
	  else
	   throw new RuntimeException("username not specified in the config.properties file.");
	 }
	 
	 public static String getPassword() 
	 {
		 if(prop==null)	
				init_properties();
	  String password = prop.getProperty("password");
	  if (password != null)
	   return password;
	  else
	   throw new RuntimeException("password not specified in the config.properties file.");
	 }

	public static void setBrowserType(String browser) {
		browserType = browser;
	}


}
