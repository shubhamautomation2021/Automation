package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/create%20form.html");
		Thread.sleep(9000);
		String SourceCodeofWebpage = driver.getPageSource();
		System.out.println(SourceCodeofWebpage);
	}
}
