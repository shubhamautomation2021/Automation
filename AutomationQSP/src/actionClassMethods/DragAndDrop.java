 package actionClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/drag&drop.html");
		Thread.sleep(4000);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable-2']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable-2']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		

	}

}