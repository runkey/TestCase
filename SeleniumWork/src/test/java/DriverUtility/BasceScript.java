package DriverUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasceScript 

{

	public static WebDriver driver;

	@BeforeClass
	public static void launnchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setHeadless(false);
		driver=new ChromeDriver(options);
    }

	@AfterClass

	public static void closeBrowser()
	{

		driver.quit();
	}

}
