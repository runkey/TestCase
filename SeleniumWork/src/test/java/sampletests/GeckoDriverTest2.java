package sampletests;
import org.testng.Assert;
import org.testng.annotations.Test;
import DriverUtility.BasceScript;

public class GeckoDriverTest2 extends BasceScript

{
 
 @Test
 
 public void testMethod2()
 {
	 
	driver.get("http://www.google.com");
	Assert.assertEquals(driver.getTitle(),"test");
 }

}
