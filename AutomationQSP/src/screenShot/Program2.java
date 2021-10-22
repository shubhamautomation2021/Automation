package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Program2 {
	//way no 3
	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/myntra.jpeg");
		Files.copy(src, dest);







	}
}
