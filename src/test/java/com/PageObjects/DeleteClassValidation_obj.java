package com.PageObjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;

import static org.junit.Assert.assertTrue;


public class DeleteClassValidation_obj extends BaseClass {
	
	WebDriver driver = Helper.getDriver();
	
	//WebDriver driver = com.lms.ui.driver.DriverFactory.getDriver();
	
	
	public DeleteClassValidation_obj(WebDriver driver) {
		super(driver);
		
	}
		
	boolean status;
    
	@FindBy(xpath = "//a[@id ='manageclassmsg']")
    WebElement manageclassmsg;
	 @FindBy(xpath = "//a[@id ='DeleteButton']")
	    WebElement deleteBtnclick;
	  @FindBy(xpath = "//pre[@id='message']")
	    WebElement OutputChk;
	 
	  @FindBy(xpath = "//pre[@id='yesmessage']")
	    WebElement YesbtnChk;
	  @FindBy(xpath = "//pre[@id='nomessage']")
	    WebElement NobtnChk;
	  
	  @FindBy(xpath = "//a[@id ='hobbies-checkbox']")
	  WebElement ChkboxClk;
	  
	  @FindBy(xpath = "//input[@type='checkbox' and starts-with(@id,'ex1-check')]")
	  WebElement multichkbox;
	  
	 public void ManageclassLandingPage() {
		 try {
	            status = manageclassmsg.isDisplayed();
	          assertTrue(status);
	           
	            Loggerload.info("Delete button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Delete button is not displayed");
	            System.out.println(e.getMessage());
	        }
	    }
	 
	  
	  public void DelBtnclick() {
	
	        deleteBtnclick.click();
               	            
	  }       
	  	            
	  	  
	  public void alertmsgyes()
	  { 
		
		
		  Alert alert = driver.switchTo().alert();
          String alertText = alert.getText();
         
          alert.accept();
	  	 
         
	  }
	  
	  public void alertmsgno()
	  {
		  Alert alert = driver.switchTo().alert();
          String alertText = alert.getText();
          alert.dismiss();
	  }
	 
	 public void Messagedisplayed() {
	      
	        try {
	            status = OutputChk.isDisplayed();
	          assertTrue(status);
	           
	            Loggerload.info("Alert is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Alert is not displayed");
	          
	        }
	      
	    }
	 
	 public void YesMessagedisplayed() {
	       
	        try {
	            status = YesbtnChk.isDisplayed();
	          assertTrue(status);
	           
	            Loggerload.info("Yes button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Yes button is not displayed");
	           
	        }
	      
	    }
	 public void NoMessagedisplayed() {
	        
	        try {
	            status = NobtnChk.isDisplayed();
	          assertTrue(status);
	           
	            Loggerload.info("No button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("No button is not displayed");
	            System.out.println(e.getMessage());
	        }
	      
	    }
	 
	 public void deletebtnenabledchk()
	 {
		 try {
	            status = deleteBtnclick.isDisplayed();
	          assertTrue(status);
	           
	            Loggerload.info("Delete button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Delete button is not displayed");
	            System.out.println(e.getMessage());
	        }
	     		 		 
	 }
	 
	 
	 public void checkboxclickmethd()
	 {
		 ChkboxClk.click();
	 }
	 
	 public void chkboxselectCheckmsg()
	 {
		 try {
	            status = ChkboxClk.isSelected();
	          assertTrue(status);
	           
	            Loggerload.info("Delete button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Delete button is not displayed");
	            System.out.println(e.getMessage());
	        }
	 }
	 
	 
	 public void multichkboxclickmethod()
	 {
		 multichkbox.click();
	 }
	 
	 public void multichkboxselectCheckmsg()
	 {
		 try {
	            status = multichkbox.isSelected();
	          assertTrue(status);
	           
	            Loggerload.info("Delete button is displayed");

	        } catch (AssertionError e) {
	            Loggerload.error("Delete button is not displayed");
	            System.out.println(e.getMessage());
	        }
	 }
}
