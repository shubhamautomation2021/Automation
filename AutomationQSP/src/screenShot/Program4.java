package screenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
//ScreenShot using Explicitly Typecasting 
public class Program4 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		//explicit type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/selenium.jpeg");
		Files.copy(src, dest);
		








	}
}