package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;
//Downcasting the WebDriver Reference to RemoteWebDriver
public class Program3 {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/myntra-2.jpeg");
		Files.copy(src, dest);







	}
}