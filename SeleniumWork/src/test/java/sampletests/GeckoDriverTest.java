package sampletests;
import org.testng.Assert;
import org.testng.annotations.Test;
import DriverUtility.BasceScript;

public class GeckoDriverTest extends BasceScript

{
 
 @Test
 
 public void testMethod1()
 {
	 
	driver.get("http://www.google.com");
	Assert.assertEquals(driver.getTitle(),"test");
 }

}
