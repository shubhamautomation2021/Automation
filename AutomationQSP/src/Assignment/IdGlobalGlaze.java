package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdGlobalGlaze {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("id=\"ctl00_ContentPlaceHolder1_usernm\"")).sendKeys("google");
		driver.findElement(By.id("adminpassword")).sendKeys("wcsm5");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go")).click();
		
	}

}
