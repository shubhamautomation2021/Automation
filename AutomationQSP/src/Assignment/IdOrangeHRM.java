package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdOrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("googlesas");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("wcsm5");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
	}

}
