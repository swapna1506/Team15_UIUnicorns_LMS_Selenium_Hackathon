package com.PageObjects;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;

public class Batch_BatchPageValidation_PageObj extends BaseClass{
	
	public Batch_BatchPageValidation_PageObj(WebDriver driver) {
	super(driver);
		
	}
	WebDriver driver;
	@FindBy(xpath="//a[text()='batch']")WebElement batch;
	
	 @FindBy(xpath = "//header[@id='header-id']") WebElement Header;
	 @FindBy(xpath = "//button[@id='Pagination']") public WebElement pagination; 
	 @FindBy(xpath = "//button[@id='checkbox']")WebElement checkbox;
	 @FindBy(xpath = "//header[text()='Batch name']") WebElement Batchname;
	 @FindBy(xpath = "//header[text()='Batch Description']") WebElement BatchDescription;
	 @FindBy(xpath = "//header[text()='Batch status']]")WebElement Batchstatus;
	 @FindBy(xpath = "//header[text()='Noofclasses']]")WebElement Noofclasses;
	 @FindBy(xpath = "//header[text()='Edit delete']]")WebElement editdel;
	 @FindBy(xpath = "//header[text()='programname']]")WebElement progname;
	 @FindBy(xpath = "//header[text()='deleteico']]")WebElement deleteicon;
	 @FindBy(xpath = "//header[text()='newbatch']]")WebElement newbatch;
	 @FindBy(xpath="(//td[@name='table']")WebElement checkcheckbox;
	 @FindBy(xpath="(//td[@name='table']")WebElement popupheading;
	 
	 @FindBy(xpath = "//table[@id='data-table']/tbody")WebElement Datatable;
	 @FindBy(xpath="tagname'tbody'") WebElement table;
	 @FindBy(xpath="tagname'tr'") WebElement allRows;
	 @FindBy(xpath="tagname'td'") WebElement intersectitem;
	 @FindBy(xpath="(//td[@name='name']")WebElement popName;
	 
	 @FindBy(xpath="(//td[@name='des']")WebElement popDes;
	 @FindBy(xpath="(//td[@name='proname']")WebElement popProName;
	 @FindBy(xpath="(//td[@name='active']")WebElement popactive;
	 @FindBy(xpath="(//td[@name='inactive']")WebElement popinactive;
	 @FindBy(id="send")WebElement sendbutton;
	 @FindBy(xpath="//table[@name='batchtable']")WebElement batchtable;
	 @FindBy(xpath="//td[@name='editicon']")WebElement editicon;
	
	 @FindBy(id="del")WebElement del_manageprogram;
	 List<WebElement> rowsAfter;
	 List<WebElement> rowsBefore;
	 
	
	
	 public void batchClick()
		{
			batch.click();
		}
	 
	 public String manageBatch()
		{
			String mabatch=Header.getText();
			return mabatch;
		}
	 
	 public void verifypageheaders() 
	 {
	        WebElement[] elementstoassert = {Batchname,BatchDescription,Batchstatus,Noofclasses, progname,editdel };
	        for(WebElement element: elementstoassert)
	        {
	            //String elementname= element.getAttribute("name");
	            Assert.assertEquals(element.isDisplayed(),"True");
	        }
	 }
	        
	        public void deleteIconDisplayed()
			 {
				 //String icon=deleteicon.getAttribute("name");
				 Assert.assertEquals(deleteicon.isDisplayed(),"True");
			 }
	        
	        public void newBatchButton()
			 {
				 //String newb=newbatch.getAttribute("name");
				 Assert.assertEquals(newbatch.isDisplayed(),"True");
			 }
	        
	        public void checkCheckbox()
			 {
				 
				 
				WebElement table = driver.findElement(By.tagName("tbody"));

			 WebElement allRows = table.findElement(By.tagName("tr"));

			      
			            List<WebElement> cells = allRows.findElements(By.tagName("td"));
			            for(WebElement e1:cells)
			            {
			            	String s=e1.getAttribute("type");
			            	 Assert.assertEquals(s,"checkbox");
			            }

			   }
			 
	        public void isEnable()
			 {
				 
				 WebElement table = driver.findElement(By.tagName("tbody"));

			 WebElement allRows = table.findElement(By.tagName("tr"));

			      
			            List<WebElement> cells = allRows.findElements(By.tagName("td"));
			            for(WebElement e1:cells)
			            {
			            	boolean s=e1.isEnabled();
			            	 Assert.assertEquals(s,"true");
			            }

			   }
	        
	        public void isEnableDelete()
			 {
				 
				 WebElement table = driver.findElement(By.tagName("tbody"));

			 WebElement allRows = table.findElement(By.tagName("tr"));

			      
			            List<WebElement> cells = allRows.findElements(By.tagName("td"));
			            for(WebElement e1:cells)
			            {
			            	boolean s=e1.isEnabled();
			            	 Assert.assertEquals(s,"true");
			            }

			   }

			public void anewbutton() {
				newbatch.click();
				
			}
			
			public void clickDeleteIcon() {
				deleteicon.click();
				
			}
			
			public boolean isAlertPresent()
			
			{
				
				
				try 
			    { 
			        driver.switchTo().alert(); 
			        return true; 
			    }   // try 
			    catch (NoAlertPresentException Ex) 
			    { 
			        return false; 
			    }   // catch 
				
				
			
			}   // isAlertPresent()
				
			
			public void alertAccept()
			{
			
				driver.switchTo().alert().accept();
			}
			public void pop()
			{
			String Mainwindow = driver.getWindowHandle();
		    Set<String> set = driver.getWindowHandles();
		    for(String win: set){
		    if(!Mainwindow.contentEquals(win)) 
		    {
		    driver.switchTo().window(win);
		    String popupheadingText = popupheading.getText();
		    String expectedheading = "Assignment Details";
		    Assert.assertEquals(expectedheading, popupheadingText);
		       // LoggerLoad.info("Popup window is displayed");
		    }
		    }
			}
			
			public void alertDismiss()
			{
			
				driver.switchTo().alert().dismiss();
			}
			public void checkBatchListed()
			{
			 String mytitle = driver.getTitle();
		     String title = "Manage Assignment Page";
		     Assert.assertEquals(title, mytitle);
		     String tableText = Datatable.getText();
		    
		//	Assert.assertEquals("The selected row is not deleted", tableText.contains(rowText));
			
			
			}
			
			public void popupField()
			{
				WebElement[] arr= {popName,popDes,popProName,popactive,popinactive};
				for(int i=0; i<=arr.length; i++)
				{
					boolean ispresent=arr[i].isDisplayed();
					Assert.assertEquals(ispresent, true);
				}
			}
			
			 
			  public void errorMessage() {
			        Alert alert = driver.switchTo().alert();
			        String errorMsg = alert.getText();
			        Assert.assertEquals("Error message is displayed", errorMsg.contains("error message"));
			    }
			 
			  public void editEnable()
			   {
				   Assert.assertEquals("true", editicon.isEnabled());
			   }
				
			  public void eraseDatafields()
			   {
				   popName.clear();
			   }
			  
			  public void isCheckBoxSelected()
			  {
				 List<WebElement> checkbox= batchtable.findElements(By.className("checkbox"));
				 for(WebElement e:checkbox)
				 {
					 
				
						Assert.assertEquals(false,e.isEnabled() );
						}
			  }
				 
				 public void Deleteicon_manageProgram()
				  {
					 
					
						 
					
							Assert.assertEquals("true",del_manageprogram.isDisplayed() );
							
					  
				  }
				 public void selectCheck()
				  {
					  WebElement checkbox= batchtable.findElement(By.xpath("(//td[@class='class'][1])"));
						WebElement checkbox1= batchtable.findElement(By.xpath("(//td[@class='class'][2])"));
					
					  checkbox.click();
					  checkbox1.click();
				  }
				 
				 public void clickDelete_manageProgram()
				  {
					  del_manageprogram.click();
				  }
				   
				  
				  
				   public void checkCheckboxDeleted()
				   {
					   WebElement checkbox= batchtable.findElement(By.xpath("(//td[@class='class'][1])"));
						  Assert.assertEquals("flase",checkbox.isDisplayed());
				   }
				   public void checkenable()
				   {
					   WebElement checkbox= batchtable.findElement(By.xpath("(//td[@class='class'][1])"));
						WebElement checkbox1= batchtable.findElement(By.xpath("(//td[@class='class'][2])"));
						  Assert.assertEquals("true",checkbox.isSelected());
						  Assert.assertEquals("true",checkbox1.isSelected());
				   }
				  
			  }
			
			
		
			 


