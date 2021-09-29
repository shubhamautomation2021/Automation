package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///D:/WCSM5/link.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google")).click();
	}

}
