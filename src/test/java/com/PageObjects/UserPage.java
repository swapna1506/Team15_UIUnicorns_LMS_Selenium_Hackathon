package com.PageObjects;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

public void clickEditUser() {
	userDetailsRows.get(0).findElement(By.className("editIcon")).click();
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

public boolean isTextBoxNotDisplayedInPopup(String textBoxId) {
	 WebElement textBox = driver.findElement(By.id(textBoxId));
    	 return (textBox == null || !textBox.isDisplayed());
}

public boolean isDropdownNotDisplayedInPopup(String selectId) {
	WebElement dropDown = driver.findElement(By.id(selectId));
   	 return (dropDown == null || !dropDown.isDisplayed());
}

@FindBy(linkText = "User details")
WebElement txtUserDetailsHeader;

@FindBy(id = "idFName")
WebElement txtFName;

public void addFirstName(String fName) {
	txtFName.sendKeys(fName);
}

public void clearFirstName() {
	txtFName.clear();
}

@FindBy(id = "idMName")
WebElement txtMName;

public void addMiddleName(String mName) {
	txtMName.sendKeys(mName);
}

public void clearMiddleName() {
		txtMName.clear();
	}


@FindBy(id = "idLName")
WebElement txtLName;

public void addLastName(String lName) {
	txtLName.sendKeys(lName);
}

public void clearLastName() {
	txtLName.clear();
}

@FindBy(id = "idLocation")
WebElement txtLocation;

public void addLocation(String value) {
	txtLocation.sendKeys(value);
}

@FindBy(id = "idPhone")
WebElement txtPhone;

public void addtxtPhone(String value) {
	txtPhone.sendKeys(value);
}

@FindBy(id = "idLinkedInURL")
WebElement txtLinkedInURL;

public void addtxtLinkedInURL(String value) {
	txtLinkedInURL.sendKeys(value);
}

@FindBy(id = "idUserRole")
WebElement selUserRole;

public void addUserRole() {
	Select userRoleDropdown = new Select(selUserRole);
	userRoleDropdown.deselectByIndex(1);
}

@FindBy(id = "error")
WebElement txtError;

public boolean isErrorDisplayed() {
	return txtError.isDisplayed();
}

@FindBy(id = "idRoleStatus")
WebElement selRoleStatus;

public void addRoleStatus() {
	Select roleStatusDropdown = new Select(selRoleStatus);
	roleStatusDropdown.deselectByIndex(1);
}

@FindBy(id = "idVisaStatus")
WebElement selVisaStatus;

public void addselVisaStatus() {
	Select visaStatusDropdown = new Select(selVisaStatus);
	visaStatusDropdown.deselectByIndex(1);
}

@FindBy(id = "idEmail")
WebElement txtEmail;

public void addtxtEmail(String value) {
	txtEmail.sendKeys(value);
}

public void clearEmail() {
	txtEmail.clear();
}

@FindBy(id = "idUnderGrad")
WebElement txtUnderGrad;

public void addtxtUnderGrad(String value) {
	txtUnderGrad.sendKeys(value);
}

@FindBy(id = "idPostGrad")
WebElement txtPostGrad;

public void addtxtPostGrad(String value) {
	txtPostGrad.sendKeys(value);
}

@FindBy(id = "idTimezone")
WebElement txtTimeZone;

public void addtxtTimeZone(String value) {
	txtTimeZone.sendKeys(value);
}

@FindBy(id = "idUserComments")
WebElement txtUserComments;

public void addtxtUserComments(String value) {
	txtUserComments.sendKeys(value);
}

@FindBy(id = "btnCancel")
WebElement btnCancel;

public void clickCancelBtn() {
	btnCancel.click();
}

@FindBy(id = "btnDelYes")
WebElement btnDelYes;

public void clickYesBtn() {
	btnCancel.click();
}

@FindBy(id = "btnDelNo")
WebElement btnDelNo;

public void clickDelBtn() {
	btnDelNo.click();
}

@FindBy(id = "btnSubmit")
WebElement btnSubmit;

public void clickSubmitBtn() {
	btnSubmit.click();
}

}