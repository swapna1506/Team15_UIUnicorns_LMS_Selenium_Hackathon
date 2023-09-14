package com.PageObjects;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Utils.BaseClass;
import com.Utils.Helper;
import com.Utils.Loggerload;

public class VerifySort_obj extends BaseClass {

	 public VerifySort_obj(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	boolean status;
	  
	 WebDriver driver = Helper.getDriver();
	 
	   @FindBy(xpath = "//button[contains(text(),'Sort')]]")
		WebElement batchidTab;
	 
	//   driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
	   @FindBy(xpath = "//table[@id='myTable']/tbody/tr/td[1]")
	   WebElement tablsrt;
	   
	   public void clickbatchid()
	   {
		   batchidTab.click();
	   }
	   
	   public void Sortingmethod()
	   {
	   
		  
	  // driver.findElement(By.xpath("//button[contains(text(),'Sort')]")).click();
		List<WebElement> tdList = (List<WebElement>) tablsrt;
		String strArry [] = new String[tdList.size()];
		for(int i=0;i < tdList.size();i++)
		{
			strArry[i]=tdList.get(i).getText();
		}
		/*
		 * Compare the values
		 */
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < strArry.length;i++)
		{
			for(int j=i+1;j < i;j++)
			{
				int result = strArry[j].compareTo(strArry[i]);
				if(!(result > 0))
				{
					  Loggerload.info("Data in the Table is not SORTED");
//	System.out.println("Data in the Table is not SORTED::" +strArry[j]+":::"+ strArry[i]);
						sortFunctionality=false;
						break outer;
				}
				else
				{
					 Loggerload.info("Data in the Table is SORTED");
					// System.out.println("Data in the Table is SORTED::" +strArry[j]+":::"+ strArry[i]);
				}
			}
		}
		
		
		if(sortFunctionality)
		{
			 Loggerload.info("SORT Functionality is working");
			//System.out.println("SORT Functionality is working");
		}
		else
		{
			 Loggerload.info("SORT Functionality is not working");
			//System.out.println("SORT Functionality is not working");
		}
		
	}
	
	   
	   
	
}
