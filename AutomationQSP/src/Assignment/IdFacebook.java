package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("googlesas");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("wcsm5");
		Thread.sleep(2000);
		driver.findElement(By.id("royal_login_button")).click();
		
	}

}
