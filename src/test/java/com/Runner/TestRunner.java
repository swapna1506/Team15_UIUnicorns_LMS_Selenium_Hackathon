package com.Runner;


  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
 

  @RunWith(Cucumber.class)
  
  @CucumberOptions(features=
  "C:\\Users\\Swapna\\git\\Team15_UIUnicorns_LMS_Selenium_Hackathon\\src\\test\\resources\\Features\\1_1_Login_HomePageVerification.feature",
  glue={"com.StepDefinitions","com.Utils", "appHooks"}, 
  //monochrome=true,
  plugin={"pretty","html:target/cucumber.html",
  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
  "json:target/json-report/cucumber.json",
  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  
  dryRun = false)
  
  public class TestRunner {
  
  }
 

/*
 * import io.cucumber.testng.CucumberOptions; import
 * io.cucumber.testng.AbstractTestNGCucumberTests; import
 * io.cucumber.junit.Cucumber; import org.junit.runner.RunWith; import
 * org.testng.annotations.DataProvider;
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features =
 * {"src\\test\\resources\\Features\\Login_HomePageVerification.feature"}, glue
 * = {"com.StepDefinitions","appHooks"}, tags = " ", plugin = {"pretty",
 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 * "timeline:test-output-thread/","html:target/cucumber-reports.html" },
 * monochrome=true )
 * 
 * public class TestRunner extends AbstractTestNGCucumberTests {
 * 
 * 
 * @Override
 * 
 * @DataProvider(parallel = false) public Object[][] scenarios() {
 * 
 * return super.scenarios(); }  
 * 
 * 
 * }
 */