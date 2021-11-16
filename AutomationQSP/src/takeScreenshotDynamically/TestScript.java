package takeScreenshotDynamically;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(CustomListner.class)
public class TestScript extends BaseTest {
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	}
	
	@Test
	public void testflipkart1()
	{
		Assert.fail();
	}
	
	public void testflipkart2()
	{
		Assert.fail();
		
	}
	
	public void testflipkart3()
	{
		Assert.fail();	
	}
	
	public void testflipkart4()
	{
		Assert.fail();
	}
	
	public void testflipkart5()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
