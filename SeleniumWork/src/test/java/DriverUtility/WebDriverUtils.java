package DriverUtility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class WebDriverUtils

{

	public static void captureScreenShot(String name) throws IOException
	{


		File src= ((TakesScreenshot)BasceScript.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\"+name+".png"));

	}
}
