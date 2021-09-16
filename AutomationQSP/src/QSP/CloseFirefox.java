package QSP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseFirefox {
	
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) {
		
		
		new FirefoxDriver().close();
	}

}