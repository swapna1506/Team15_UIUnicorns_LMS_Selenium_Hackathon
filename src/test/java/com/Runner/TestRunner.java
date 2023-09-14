package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
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