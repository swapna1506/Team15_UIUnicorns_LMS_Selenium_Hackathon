package com.PageObjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;
import lombok.var;

public class ManageClassPage_obj extends BaseClass {
	 
	WebDriver driver = Helper.getDriver();
	
	public  ManageClassPage_obj(WebDriver driver) {
		
		 super(driver);
	}
	
	boolean status;
    
	 @FindBy(xpath = "//button[@class='btn']") WebElement X1_WE;
	 
	 @FindBy(xpath = "//button[@hrf='wwww.dcshdguy']") WebElement url_WE;
	
	 @FindBy(xpath = "//button[@id=\"btn\"]") WebElement manageclass_WE;
	 
	 @FindBy(xpath = "//a[@id ='Edit class']")
		WebElement editBtnclk;
		@FindBy(xpath = "//a[Text() ='class details']")
		WebElement editpopupchk;
		@FindBy(xpath = "//a[@id ='batchid']")
		WebElement Batchidval;
		@FindBy(xpath = "//a[@id ='noofclasses']")
		WebElement noclassval;
		@FindBy(xpath = "//a[@id ='classdate']")
		WebElement clasdtval;
		@FindBy(xpath = "//a[@id ='staffid']")
		WebElement staffval;

	 
	 @FindBy(xpath = "//button[@class=\"btn\"]") WebElement manageclassdisplay_WE;
	 
	 @FindBy(xpath = "//button[@id=\"btn\"]") WebElement DeleteIcon_WE;
		
	 @FindBy(xpath = "//button[@class=\"btn\"]") WebElement DeleteIconDisplay_WE;
	 
	 @FindBy(xpath = "//button[@class=\"btn\"]") WebElement AddNewClass_WE;
	 
	 @FindBy(xpath = "//button[@id=\"btn\"]") WebElement AddNewClassDisplay_WE;
	 
	 @FindBy(xpath = "//button[@id=\"btn\"]") WebElement SearchBar_WE;
	 
	 @FindBy(xpath = "//button[@class=\"btn\"]") WebElement SearchBarDisplay_WE;
	 
	 @FindBy(xpath = "//button[@classname=\"btn\"]") WebElement IconHeaderDisplay_WE;
	 
	 @FindBy(xpath = "//input[@type='checkbox' and starts-with(@id,'ex1-check')]")
	  WebElement multichkbox_WE;
	 
	 @FindBy(xpath = "//button[@class='btn']") WebElement paginationcontrols_WE;
	 
	 @FindBy(xpath = "//td[count(//th[text()='phone']/preceding-sibling::th)]") WebElement Table_WE;
	 // var table= WebElement Table_WE;
	  
	 @FindBy(xpath = "//button[@class='btn']") WebElement EditIcon_WE;
	 
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement NoOfClassesColom_WE;
	 
	
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement BatchIDColom_WE;
	 
	  
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement ClassNoColom_WE;
	 
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement ClassTopicColom_WE;
	 
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement StaffIdColom_WE;
	 
	 @FindBy(xpath = " \"//div//strong//p[@class=\\\"bg-secondary text-white\\\"]\"") WebElement ClassDate_WE;
	 
	 
		
		List<WebElement> tableHeaders = (List<WebElement>) Table_WE;
	 
	 
	
	 public void Classbutton(){
		 
		 X1_WE.click();
	 }
	 
     public void verifyGetUrl(){
    	 String actualUrl = url_WE.getText();
    	 String expectedUrl = "https://www.urlManageClass";
    	 Assert.assertEquals(actualUrl,expectedUrl);
		 }
     
     public void responseTimeChk()
 	{
 			long starttime = System.currentTimeMillis();
 			X1_WE.click();
 			long endtime = System.currentTimeMillis();
 			long responsetime = endtime-starttime;
 	Loggerload.info("student name dropdown is displayed" + responsetime + "milliseconds");
 	
 	
 	}
     
     public void IconHeaderDisplay() {
    	   	try {
    	           status = IconHeaderDisplay_WE.isDisplayed();
    	           assertTrue(status);
    	           Loggerload.info("Assert True in try editor block");

    	       } catch (AssertionError e) {
    	           Loggerload.error("Assert false in try editor block");
    	           System.out.println(e.getMessage());
    	       }
    	   }
	 
	 
   public void ManageClassbutton(){
		 
   	manageclass_WE.click();
   	
  	 }
   
	public void ManageClassDetail()
{
	
		Batchidval.getAttribute("value");
		noclassval.getText();
		clasdtval.getText();
		staffval.getText();
	
	try {
		status = editpopupchk.isDisplayed();
		assertTrue(status);
		Loggerload.info("edit page is displayed");
	} catch (AssertionError e) {
		Loggerload.error("edit page is not displayed");
		System.out.println(e.getMessage());
	}
}
   
   public void ManageClassDisplay() {
   	
   	try {
           status = manageclassdisplay_WE.isDisplayed();
           assertTrue(status);
           Loggerload.info("Assert True in try editor block");

       } catch (AssertionError e) {
           Loggerload.error("Assert false in try editor block");
           System.out.println(e.getMessage());
       }
   	
   }
   
   public void DeleteIcon(){
		 
   	DeleteIcon_WE.click();
	 }
	 
   public void DeleteIconDisplay() {
   	try {
           status = DeleteIconDisplay_WE.isDisplayed();
           assertTrue(status);
           Loggerload.info("Assert True in try editor block");

       } catch (AssertionError e) {
           Loggerload.error("Assert false in try editor block");
           System.out.println(e.getMessage());
       }
   	
   }
   
   public void SearchBar(){
		 
   	SearchBar_WE.click();
   	
	 }
   
   public void SearchBarDisplay() {
   	try {
           status = SearchBarDisplay_WE.isDisplayed();
           assertTrue(status);
           Loggerload.info("Assert True in try editor block");

       } catch (AssertionError e) {
           Loggerload.error("Assert false in try editor block");
           System.out.println(e.getMessage());
       }
   	//boolean status = SearchBarDisplay_WE.isDisplayed();;
   	//assertTrue(status);
   }
   
   public void AddNewClass(){
		 
   	AddNewClass_WE.click();
   	
	 }
	 
   public void AddNewClassDisplay() {
   	try {
           status = AddNewClassDisplay_WE.isDisplayed();
           assertTrue(status);
           Loggerload.info("Assert True in try editor block");

       } catch (AssertionError e) {
           Loggerload.error("Assert false in try editor block");
           System.out.println(e.getMessage());
       }
   	//boolean status = AddNewClassDisplay_WE.isDisplayed();;
   	//assertTrue(status);
   }
   
  
   
   public void MultipleCkeckBoxDisplay() {
   	try {
           status = multichkbox_WE.isDisplayed();
           assertTrue(status);
           Loggerload.info("Assert True in try editor block");

       } catch (AssertionError e) {
           Loggerload.error("Assert false in try editor block");
           System.out.println(e.getMessage());
       }
   }
   
       public void paginationcontrols() {
	   boolean status = paginationcontrols_WE.isDisplayed();
	   assertTrue(status);
	   
	  
   }
       public void EditIconchk()
   	{
           for (int i = 0; i < tableHeaders.size(); i++) {
               Object colName = null;
   			if (tableHeaders.get(i).getText().equals(colName)) {
                   break;
               }
           }
           if(tableHeaders.isEmpty())
           { Loggerload.info("Edit Icon not displayed");
        	             }
           else {
        	   Loggerload.error("Edit Icon displayed");
           }
   	}
       
       public void DeleteIconchk()
      	{
              for (int i = 0; i < tableHeaders.size(); i++) {
                  Object colName = null;
      			if (tableHeaders.get(i).getText().equals(colName)) {
                      break;
                  }
              }
              if(tableHeaders.isEmpty())
              { Loggerload.info("Delete Icon not displayed");
           	             }
              else {
           	   Loggerload.error("Delete Icon displayed");
              }
      	}


	   public void NoOfClass(){
		   boolean status = NoOfClassesColom_WE.isDisplayed();
		   assertTrue(status);
			 
		  }
	   
	   public void PopUpBatchIDField() 
	   {
		   List<WebElement> batchIdElements = (List<WebElement>) BatchIDColom_WE;
				   
		   List<String> batchId = new ArrayList<>();
		  
		   for (WebElement BatchIDColom_WE: batchIdElements ){
				 
			   batchId.add(BatchIDColom_WE.getText());
			  }
			  
			  String search = "abcd";
			  
			  for (String id : batchId){
			  Assert.assertTrue(id.contains(search));
			  }
	   }
	   
	   public void PopUpBatchIDField1() 
	   {
		   List<WebElement> batchIdElements = (List<WebElement>) BatchIDColom_WE;
				   
		   List<String> batchId = new ArrayList<>();
		  
		   for (WebElement BatchIDColom_WE: batchIdElements ){
				 
			   batchId.add(BatchIDColom_WE.getText());
			  }
			  
			  String search = "null";
			  
			  for (String id : batchId){
			  Assert.assertTrue(id.contains(search));
			  }
	   }
	   
	   
	  
	   
	   public void PopUpClassNumField1() 
	   {
		   List<WebElement> classNumElements = (List<WebElement>) ClassNoColom_WE;
				   
		   List<String> ClassNo = new ArrayList<>();
		  
		   for (WebElement ClassNoColom_WE: classNumElements ){
				 
			   ClassNo.add(ClassNoColom_WE.getText());
			  }
			  
			  String search = "Null";
			  
			  for (String id : ClassNo){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   
	   
		   
	   public void PopUpClassNumField() 
	   {
		   List<WebElement> classNumElements = (List<WebElement>) ClassNoColom_WE;
				   
		   List<String> ClassNo = new ArrayList<>();
		  
		   for (WebElement ClassNoColom_WE: classNumElements ){
				 
			   ClassNo.add(ClassNoColom_WE.getText());
			  }
			  
			  String search = "8";
			  
			  for (String id : ClassNo){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   public void PopUpClassTopicFeild() 
	   {
		   List<WebElement> classTopicElement = (List<WebElement>) ClassTopicColom_WE;
				   
		   List<String> ClassTopic = new ArrayList<>();
		  
		   for (WebElement ClassTopicColom_WE:  classTopicElement){
				 
			   ClassTopic.add(ClassTopicColom_WE.getText());
			  }
			  
			  String search = "SDET";
			  
			  for (String id : ClassTopic){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   
	   public void PopUpClassTopic1() 
	   {
		   List<WebElement> classTopicElements = (List<WebElement>) ClassNoColom_WE;
				   
		   List<String> ClassTopic = new ArrayList<>();
		  
		   for (WebElement ClassNoColom_WE:  classTopicElements){
				 
			   ClassTopic.add(ClassNoColom_WE.getText());
			  }
			  
			  String search = "Null";
			  
			  for (String id : ClassTopic){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   
	   public void PopUpStaffIdField() 
	   {
		   List<WebElement> StaffIdElement = (List<WebElement>) StaffIdColom_WE;
				   
		   List<String> staffid = new ArrayList<>();
		  
		   for (WebElement StaffIdColom_WE:  StaffIdElement){
				 
			   staffid.add(StaffIdColom_WE.getText());
			  }
			  
			  String search = "a1";
			  
			  for (String id : staffid){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   
	   public void PopUpStaffIdField1() 
	   {
		   List<WebElement> StaffIdElement = (List<WebElement>) StaffIdColom_WE;
				   
		   List<String> staffid = new ArrayList<>();
		  
		   for (WebElement StaffIdColom_WE:  StaffIdElement){
				 
			   staffid.add(StaffIdColom_WE.getText());
			  }
			  
			  String search = "null";
			  
			  for (String id : staffid){
			  
				  Assert.assertTrue(id.contains(search));
			  
			  }
	   }
	   
	   
	   
	
}
   
   
    
 

