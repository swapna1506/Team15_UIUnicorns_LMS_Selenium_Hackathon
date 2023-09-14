package com.Utils;

import org.openqa.selenium.WebDriver;

import static com.Utils.Helper.getDriver;
import com.PageObjects.*;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ConfigReader cr = new ConfigReader();
	
	public static LoginPage lp;
	public static DashboardPage dp;
	public static DeletePgmConfirmPopupPage dpp;
	public static ManagePgmsPage mpp;
	public static EditProgramDetailsPopupPage epp;
	

	
	static {
		driver = getDriver();
	}

}
