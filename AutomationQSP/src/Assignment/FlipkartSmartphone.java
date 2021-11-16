package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSmartphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']")).click();
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();	
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String handle:allHandles)
		{
			if(parentHandle.equals(handle))
			{
				
			}
			
			else
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
			}
		}
	}

}

