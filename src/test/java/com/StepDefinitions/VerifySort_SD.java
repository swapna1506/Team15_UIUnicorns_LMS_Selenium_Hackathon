package com.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PageObjects.VerifySort_obj;
import com.Utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySort_SD {
	
	WebDriver driver = Helper.getDriver();
	
	VerifySort_obj objvd = new VerifySort_obj(driver);
	


	@When("Admin click on Batch id column header to sort")
	public void admin_click_on_batch_id_column_header_to_sort() {
		objvd.clickbatchid();
	}
	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {
		//user first clicks the sorting error and sorting happens
		objvd.clickbatchid();
		objvd.Sortingmethod();
	}
	@When("Admin double click on Batch id column header to sort")
	public void admin_double_click_on_batch_id_column_header_to_sort() {
		//assumption - double clicks and sorting happens in ascending order
				objvd.clickbatchid();
				objvd.Sortingmethod();
	}
	@Then("Admin should see data table sorted in ascending  order")
	public void admin_should_see_data_table_sorted_in_ascending_order() {
		objvd.Sortingmethod();
	}
}
