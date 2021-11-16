package operationalMethodsOfSelectClass;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethodInMultiselectDropdown {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/multiselectdropdown.html");
		Thread.sleep(8000);
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		
		for(int i=3;i<=7;i++)
		{
			sel.selectByIndex(i);
		}
		
		
		WebElement firstOption = sel.getFirstSelectedOption();
		String firstOptionText = firstOption.getText();
		System.out.println(firstOptionText);
		
	
	}

}