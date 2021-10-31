package handlingDisableElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/disabledTextBox.html");
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		if(username.isEnabled())
		{
		  username.sendKeys("admin");
		}
		
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('txtUsername').value='admin'");
		}
		
		
		if(password.isEnabled())
		{
		  password.sendKeys("manager");
		}
		
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('txtPassword').value='manager'");
		}

	}
}