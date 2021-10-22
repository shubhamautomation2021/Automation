package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameUsingFrameByWebELement {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/username.html");
		driver.findElement(By.id("un")).sendKeys("shubham");
		Thread.sleep(5000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frid']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("pwd")).sendKeys("anand");



	}
}