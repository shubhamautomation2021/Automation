package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameUsingFrameByIndex {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/username.html");
		driver.findElement(By.id("un")).sendKeys("shubham");
		Thread.sleep(5000);
		
		driver.switchTo().frame(7);
		driver.findElement(By.id("pwd")).sendKeys("anand");



	}
}

