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


import com.PageObjects.AttendanceDetails;
import com.PageObjects.ManageAttendence;
import com.PageObjects.*;
public class BaseClass {
	
	public static ManageAttendence mp;
	public static AttendanceDetails adp;
	public static AttendanceDetails1 adp1;
	public static DeleteAttendance dp;
	public static DeleteMultipleAttendance dmp;
	public static EditAttendance eap;
	public static AddNewAttendance nap;
	public static NavigationAttendance na;
	public static PaginationAttendance pa;




}
}
