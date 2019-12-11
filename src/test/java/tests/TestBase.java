package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import utilities.Helper;

public class TestBase {
	
	public static WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void Setup(@Optional("chrome")String browserName)
	{
		if (browserName.equalsIgnoreCase("firefox")) 
		{

			String FirefoxPath=System.getProperty("user.dir")+"\\Drive\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",FirefoxPath);
			driver =new FirefoxDriver();

		}
		else if (browserName.equalsIgnoreCase("chrome")) {

			String chromePath=System.getProperty("user.dir")+"\\Drive\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver",chromePath);

			driver = new ChromeDriver();


		}
		else if (browserName.equalsIgnoreCase("IE")) {

			String IEPath = System.getProperty("user.dir")+"\\Drive\\IEDriverServer.exe";

			System.setProperty("webdriver.ie.driver", IEPath);

			driver =new InternetExplorerDriver();

		}
		
		driver.manage().window().maximize();
		//Open URL of my AUT application
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closedriver() 

	{
		//driver.close();

	}
	
	@AfterMethod
	public void screenshotOnFail(ITestResult results)
	{
		
		if (results.getStatus()==ITestResult.FAILURE) {
			
			System.out.println("Failed");
			System.out.println("Taking ScreenShot..............");
			Helper.captureScreenshot(driver, results.getName());
				
		}
		
	}

}
