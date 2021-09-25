package webDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}

