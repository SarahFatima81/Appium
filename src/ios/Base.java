package ios;

import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

	static IOSDriver driver;

	

	public static IOSDriver<IOSElement>capabilities() throws MalformedURLException

	{

		File app = new File("/Users/xcodeclub/Desktop/UICatalog.app.zip");

		DesiredCapabilities capabilities  = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone6");

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

}
}