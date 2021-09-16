package QSP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DelayCloseFirefox {
	
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();//opening the browser
		Thread.sleep(10000);
		driver.close();
	}

}