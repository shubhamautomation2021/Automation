package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdHubSpot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login&_conv_v=vi:1*sc:1*cs:1632898293*fs:1632898293*pv:2*seg:{10031564.1}*exp:{}&_conv_s=si:1*sh:1632898293358-0.9001885678386812*pv:2&_ga=2.14070974.885473470.1632898295-1822031545.1632898295");
		Thread.sleep(10000);
		driver.findElement(By.id("username")).sendKeys("googlesas@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("wcsm5");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		
	}

}
