package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdInstagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.id("_2hvTZ pexuQ zyHYP")).sendKeys("asdfghj@gmail.com");
		driver.findElement(By.id("_2hvTZ pexuQ zyHYP")).sendKeys("asdfg1234");
		driver.findElement(By.id("Log In")).click();
		
	}

}
