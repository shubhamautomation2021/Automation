package basicautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		//set the path of driver executable
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize
		driver.get("http://127.0.0.1/login.do;jsessionid=1mhqac8t50rsr");//launch the web app
		
		driver.findElement(By.name("username")).sendKeys("admin");//sends admin to username textbox
		driver.findElement(By.name("pwd")).sendKeys("manager");//sends manager to password textbox
		driver.findElement(By.id("loginButton")).click();//click on  the login button
		
	}

}