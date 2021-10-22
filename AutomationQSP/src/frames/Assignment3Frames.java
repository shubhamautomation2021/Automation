package frames;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Frames {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.id("name")).sendKeys("Shubham");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("shubhamautomation2021@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("dshzfx1ip5f_146917605549304831")).sendKeys("9876543210");
	}
}
