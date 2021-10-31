package webBasedPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SHUBHAM%20ANAND/Desktop/WORKSHOP/Alert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(5000);
		
		Alert al = driver.switchTo().alert();
		String textOfAlertPopup = al.getText();
		System.out.println(textOfAlertPopup);//text Of The Popup
		al.accept();
	}

}