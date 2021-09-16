package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class DelayCloseChrome {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();//opening the browser
		Thread.sleep(10000);
		driver.close();
	}

}