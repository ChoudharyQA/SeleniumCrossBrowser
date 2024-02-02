package CrossBrowserTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowserTestDemo2 {

	

	@Test
	public  void  titleCheckGoogle() throws MalformedURLException {
		
		MutableCapabilities caps = new MutableCapabilities();
		
		
		@SuppressWarnings("deprecation")
		WebDriver driver = new RemoteWebDriver(new URL ("https://hub.browserstack.com/wd/hub"),caps);
		driver.get("https://Google.com/");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
