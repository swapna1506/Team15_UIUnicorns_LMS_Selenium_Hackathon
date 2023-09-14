package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",
					glue ={"com.StepDefinitions","com.Utils", "appHooks"},
							plugin = {"pretty"} )
                 	//monochrome=true,
//            plugin= {"pretty","html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//    "json:target/json-report/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 	
//dryRun = false)

@CucumberOptions(features="./src/test/resources/Features",
					glue ={"com.StepDefinitions","com.Utils.Helper", "appHooks"},
                 	monochrome=true,
                 			plugin = {"pretty",
                 					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                 					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                 					"html:target/cucmberreport",
                 					"html:target/JUNITHtmlReports/report.html",
                 					"junit:target/JUNITReports/reports.xml"},

dryRun = false)


public class TestRunner {

}
