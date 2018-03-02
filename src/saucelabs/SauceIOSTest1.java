package saucelabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceIOSTest1 {

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc = DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
		dc.setCapability("platformVersion", "7.1");
		dc.setCapability("appiumVersion", "v1.7.1");
		dc.setCapability("deviceName", "iPhone Simulator");
		dc.setCapability("deviceOrientation", "portrait");
		dc.setCapability("browserName", "safari"); 
		//dc.setCapability("automationName", AutomationName.IOS_XCUI_TEST);

		IOSDriver driver = new IOSDriver(new URL("http://SarahFatima:c098f7cc-167b-4a1c-a4f3-7eec91392120@ondemand.saucelabs.com:80/wd/hub"), dc);
		//driver.get("http://google.com");
		//Thread.sleep(8000L);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://udemy.com");
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys("SoapUI");
		driver.findElement(By.xpath("//*[@id='searchbox']/div/span/span/button")).click();
	}

}
