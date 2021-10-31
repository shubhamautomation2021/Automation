package handlingTheExcelFile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidActitimeWithPassingValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=17auf35iuhq09");

		Flib flib = new Flib();
		int rc = flib.rowcount("./data/Testdata.xlsx", "Invalid");
		
		for(int i=1;i<rc;i++) {
			String username = flib.readExcelData("./data/Testdata.xlsx", "Invalid", i, 0);
			String password = flib.readExcelData("./data/Testdata.xlsx", "Invalid", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			Flib fli = new Flib();
			WebElement errorMessage = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
			if(errorMessage.isEnabled())
			{
				fli.writeExcelData("./data/Testdata.xlsx", "Invalid", i, 2,"fail");
			}
			else
			{}
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
	}

}
