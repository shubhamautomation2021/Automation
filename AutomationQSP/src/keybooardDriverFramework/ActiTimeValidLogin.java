package keybooardDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH,"username");
		String password = flib.readPropertyData(PROP_PATH,"password");
		bt.setUp();
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		bt.tearDown();
		
	}

}