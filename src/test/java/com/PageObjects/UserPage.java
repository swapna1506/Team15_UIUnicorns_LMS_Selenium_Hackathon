package com.PageObjects;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.ConfigReader;
import com.Utils.Sleep;

public class UserPage {
	
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public UserPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }

@FindBy(id = "searchTextBox")
WebElement txtSearchUserPage;

public boolean isSearchBoxDisplayed() {
	return txtSearchUserPage.isDisplayed();
}

public String SendURLText() {
	return driver.getCurrentUrl();
}

public String getCurrentPageTitle() {
	return driver.getTitle().trim();
}

@FindBy(linkText = "+ Add New User")
WebElement addNewUserBtnSuer;

public boolean isAddUserLinkDisplayed() {
	return addNewUserBtnSuer.isDisplayed();
}

@FindBy(linkText = "+ Assign Staff")
WebElement assignStaffBtn;

public boolean isAssignStaffLinkDisplayed() {
	return assignStaffBtn.isDisplayed();
}

@FindBy(id = "deleteAll")
WebElement deleteAllUserBtn;

public boolean isDeleteAllUserBtnDisabled() {
	return  !deleteAllUserBtn.isEnabled();
}

@FindBy(id = "Select All")
WebElement selectAllCheckBox;

public boolean isSelectAllCheckBoxDisplayed() {
	return selectAllCheckBox.isDisplayed();}

@FindBy(className = "Manage User Page")
WebElement pageTitleValidationUserPage;

public boolean isPageTitleDisplayed() {
	return pageTitleValidationUserPage.isDisplayed();
}

@FindBy(xpath = "//a[text()='<<'")
WebElement txtFooterPaginationText;

public boolean isFooterPaginatorDisplayed() {
	return txtFooterPaginationText.isDisplayed();}

@FindBy(xpath = "//table/rows")
List<WebElement> userDetailsRows;

public boolean isDeleteRowButtonEnabledForEachRow() {
	boolean isDeleteRowButtonEnabledForEachRow=true;
	
	for (WebElement userDetailsRow : userDetailsRows) {
		isDeleteRowButtonEnabledForEachRow = isDeleteRowButtonEnabledForEachRow &&
				userDetailsRow.findElement(By.className("deleteIcon")).isEnabled();
	}
	return isDeleteRowButtonEnabledForEachRow;
}

public boolean isDeleteRowButtonEnabled() {
	return userDetailsRows.get(0).findElement(By.className("deleteIcon")).isEnabled();
}

public void clickFirstRowDeleteButton(String name) {
	for (WebElement userDetailsRow : userDetailsRows) {
		if(userDetailsRow.findElement(By.className("name")).getText().equalsIgnoreCase(name))
			userDetailsRow.findElement(By.className("deleteIcon")).click();
	}
}

public boolean CheckUserExistInTable(String name) {
	for (WebElement userDetailsRow : userDetailsRows) {
		if(userDetailsRow.findElement(By.className("name")).getText().equalsIgnoreCase(name))
			return true;
	}
	return false;
}

public boolean alertAppearsWithYesAndNo(String yes, String no) {
	 // Switch to the alert
    Alert alert = driver.switchTo().alert();
    // Validate that the alert has "yes" and "no" options
    String alertText = alert.getText();
    if (alertText.contains(yes) && alertText.contains(no)) {
    	alert.dismiss();
        return true;
    } else {
    	alert.dismiss();
        return false;
    }

}

public boolean alertAppearsWithUserDeletedMessage(String message) {
	 // Switch to the alert
   Alert alert = driver.switchTo().alert();
   // Validate that the alert has "yes" and "no" options
   String alertText = alert.getText();
   if (alertText.contains(message)) {
   	alert.dismiss();
       return true;
   } else {
   	alert.dismiss();
       return false;
   }

}



public void ClickYes_NoOnAlert(String yes_no) {
	 // Switch to the alert
   driver.switchTo().alert();
   if (yes_no.equalsIgnoreCase("Yes")) 
	   btnDelYes.click();
   if (yes_no.equalsIgnoreCase("No")) 
	   btnDelNo.click();

}

public boolean isEditRowButtonEnabled() {
	return userDetailsRows.get(0).findElement(By.className("editIcon")).isEnabled();
}

@FindBy(xpath = "//table/rowHeaders")
WebElement userHeaderRow;

public boolean isUserPageRowHeadingsDisplayed() {
	return userHeaderRow.findElement(By.name("id")).isDisplayed()
			&& userHeaderRow.findElement(By.name("phoneNumber")).isDisplayed()
			&& userHeaderRow.findElement(By.name("name")).isDisplayed()
			&& userHeaderRow.findElement(By.name("location")).isDisplayed()
			&& userHeaderRow.findElement(By.name("edit_delete")).isDisplayed()
			;
	 
}

public void clickAddNewUser() {
	addNewUserBtnSuer.click();
}

public boolean isUserDetailPopupDisplayed() {
	// Store the main window handle
    String mainWindow = driver.getWindowHandle();
    
    // Switch to the new window (popup)
    for (String windowHandle : driver.getWindowHandles()) {
        if (!windowHandle.equals(mainWindow)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }
    
    // Check if you are now on the popup window
    if (driver.getTitle().equals("Add / Edit User Page")) {
        return true;
    } else {
        return false;
    }
}

@FindBy(linkText = "User details")
WebElement txtUserDetailsHeader;

@FindBy(id = "idFName")
WebElement txtFName;

@FindBy(id = "idMName")
WebElement txtMName;

@FindBy(id = "idLName")
WebElement txtLName;

@FindBy(id = "idLocation")
WebElement txtLocation;

@FindBy(id = "idPhone")
WebElement txtPhone;

@FindBy(id = "idLinkedInURL")
WebElement txtLinkedInURL;

@FindBy(id = "idUserRole")
WebElement selUserRole;

@FindBy(id = "error")
WebElement txtError;

@FindBy(id = "idRoleStatus")
WebElement selRoleStatus;

@FindBy(id = "idVisaStatus")
WebElement selVisaStatus;

@FindBy(id = "idEmail")
WebElement txtEmail;

@FindBy(id = "idUnderGrad")
WebElement txtUnderGrad;

@FindBy(id = "idPostGrad")
WebElement txtPostGrad;

@FindBy(id = "idTimezone")
WebElement txtTimeZone;

@FindBy(id = "idUserComments")
WebElement txtUserComments;

@FindBy(id = "btnCancel")
WebElement btnCancel;

@FindBy(id = "btnDelYes")
WebElement btnDelYes;

@FindBy(id = "btnDelNo")
WebElement btnDelNo;

}