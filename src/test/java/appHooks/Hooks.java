package appHooks;



	import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Utils.ConfigReader;
import com.Utils.Helper;
import com.Utils.Loggerload;

import driverFactoryPkg.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

	public class Hooks 
	{
//		private static WebDriver driver=Helper.getDriver();
//
//		static Scenario scenario;
//   
//		@BeforeAll
//		public static void before() throws Throwable {
//			//Get browser Type from config file
//			Loggerload.info("Loading Config file");
//			ConfigReader.loadConfig();
//			String browser = ConfigReader.getBrowserType();
//			
//			//Initialize driver
//			//driver = Helper.getDriver();
//			Loggerload.info("Initializing driver for : "+browser);
//		}
//		
//		@Before
//		public void scenario(Scenario scenario) {
//			Loggerload.info("===============================================================================================");
//			Loggerload.info(scenario.getSourceTagNames() +" : "+scenario.getName());
//			Loggerload.info("-----------------------------------------------------------------------------------------------");
//			Helper.setUpDriver();
//		}
//		@AfterStep
//		public void afterstep(Scenario scenario) {
//			if (scenario.isFailed()) {
//				//driver = Helper.getDriver();
//				Loggerload.error("Steps Failed , Taking Screenshot");
//				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", "My screenshot");
//				Allure.addAttachment("Myscreenshot",
//						new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//			
//			}
//		}
//
//		@AfterAll
//		public static void after() {
//			Loggerload.info("Closing Driver");
//			Helper.tearDown();
//		}
		
//		private DriverFactory driverFactory;
//		//private WebDriver driver;
//		private ConfigReader configReader;
//		Properties prop;
//		private static WebDriver driver = Helper.getDriver();
//
//		@Before(order=0)
//		public void getProperty()
//		{
//			System.out.println("________Hooksruns before scenario________:");
//
//			configReader = new ConfigReader();
//			prop = configReader.loadConfig();
//		}
//		
//		@Before(order=1)
//		public void launchBrowser()
//		{
//			
//			String browserName = prop.getProperty("browser");
//			//System.out.println("browserNameruns before scenario:"+ browserName);
//			driverFactory = new DriverFactory();
//			driver = Helper..initilization(browserName);
//		}
//		
//		@After(order=0)
//		public void quitBrowser()
//		{
//			System.out.println("hooks runs after scenario:");
//
//			driver.quit();
//		}
//		
//		@After(order=1)
//		public void tearDown(Scenario scenario)
//		{
//			if(scenario.isFailed())
//			{
//				String screenshotName = scenario.getName().replaceAll("", "_");
//				byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(sourcePath, "img/png", screenshotName);
//			}	
//		}
}
