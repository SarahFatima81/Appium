package webappsmob;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id= 'm_login_email']").sendKeys("safa79us@hotmail.com");
		driver.findElementByName("pass").sendKeys("2345");
		driver.findElementByName("login").click();

	}

}
