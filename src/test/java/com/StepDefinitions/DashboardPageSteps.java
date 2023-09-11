package com.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.PageObjects.DashboardPage;
import com.Utils.ConfigReader;

import pom.driverFactory.DriverFactory;

public class DashboardPageSteps {

	private static WebDriver driver = DriverFactory.getDriverForChrome_MultipleClasses();
	DashboardPage dashboardPage =new DashboardPage(driver);

	
    @Given("Admin visits the correct URL")
    public void adminVisitsTheCorrectURL() {
    	dashboardPage.visit_LMS_url();  // The URL to the login page is in Config/config.properties file, and can be modified there
        Assert.assertEquals("LMS Main Page", dashboardPage.getCurrentPageTitle()); // Replace "LMS Main Page" with the actual title of the login page
    }

    @And("Admin clicks on login button to navigate to login page")
    public void adminIsOnTheLoginPage() {
    	 dashboardPage.clickMainPageLogin_btn();
         Assert.assertEquals("Login Page Title", dashboardPage.getCurrentPageTitle());  // Replace 'Login Page Title' with the actual title of the login page
    }

    @When("Admin enters valid credentials")
    public void adminEntersValidCredentials() {
    	dashboardPage.enterUsername(ConfigReader.getUserName());
    	dashboardPage.enterPassword(ConfigReader.getPassword());
    }

    @And("Admin clicks the login button")
    public void adminClicksTheLoginButton() {
    	dashboardPage.clickLogin();
    }
    
    @Then("if HTTP response is >= {int} the link is broken")
    public void ifHTTPResponseIsTheLinkIsBroken(int response) throws IOException {
    	URL url = new URL(driver.getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
            int code = connection.getResponseCode();
            Assert.assertTrue("The URL: " + url + " is broken with status code: " + code, code < response); 
        
    }

    @Then("Admin should see {string} as the header")
    public void adminShouldSeeAsTheHeader(String header) {
        Assert.assertEquals(header, dashboardPage.getHeaderElementText());
    }

    @Then("Maximum navigation time in milliseconds should default to {int} seconds")
    public void maxNavigationTimeShouldDefaultTo(int seconds) {
    	try {
            // This is just a generic wait condition for the sake of this example. 
            // You'll need to replace this with the actual condition you're waiting for.
            // For instance, this waits for the dashboard URL to be loaded.
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.urlContains("dashboard"));
            
            // If it gets past the wait without exception, it means the page loaded within the expected time frame
        } catch (TimeoutException e) {
            Assert.fail("Navigation took longer than " + seconds + " seconds");
        }
    }

    @Then("Admin should see {string} as the title")
    public void adminShouldSeeAsTheTitle(String title) {
    	    Assert.assertEquals(title, dashboardPage.getCurrentPageTitle());
    }

    @Then("LMS title should be on the top left corner of the page assuming top left is {int},{int}")
    public void lmsTitleShouldBeOnTheTopLeftCornerOfThePage() {
        Assert.assertTrue("LMS title is not on the top left corner", dashboardPage.getlmsTitleLocation().getX() <= 10 && dashboardPage.getlmsTitleLocation().getY() <= 10);  // Assuming a margin of 10 pixels
    }

    @Then("Admin should see correct spelling in navigation bar text")
    public void adminShouldSeeCorrectSpellingInNavigationBarText() {
    	
        String[] correctSpellings = {"Student","Program","Batch","Class","User","Assignment","Attendance","Logout"};

        for (String spelling : correctSpellings) {
            Assert.assertTrue("Spelling error found in navigation bar", dashboardPage.getNavBarText().contains(spelling));
        }
    }

    @Then("Admin should see correct spelling and space in the LMS title")
    public void adminShouldSeeCorrectSpellingAndSpaceInTheLMSTitle() {
        String expectedLmsTitle = "LMS - Learning Management System";  // Replace with the correct LMS title
        Assert.assertEquals(expectedLmsTitle, dashboardPage.getlmsTitleText());
    }

    @Then("Admin should see the navigation bar text container is on the top right side")
    public void adminShouldSeeTheNavigationBarTextOnTheTopRightSide() {
    	Point location = dashboardPage.getNavBarContainerLocation();
        Dimension screenSize = driver.manage().window().getSize();

        // Check if the navbar text is within 10 pixels from the top right corner
        Assert.assertTrue("Navbar text is not on the top right corner",
            location.getX() + dashboardPage.getNavBarContainerWidth() + 10 >= screenSize.getWidth() && location.getY() <= 10);
    }

    @Then("Admin should see {string} in the {string} place")
    public void adminShouldSeeInThePlace(String menuItem, int expectedIndex) {
    	 
        Assert.assertTrue("Menu item is not in the correct order",
        		dashboardPage.verifyMenuItemOrder(menuItem, expectedIndex));
    }


}

