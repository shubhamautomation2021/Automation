package webDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.ui.Window;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		Options man = driver.manage();
		 org.openqa.selenium.WebDriver.Window win = man.window();
		
		 win.maximize();
		
	}

}
