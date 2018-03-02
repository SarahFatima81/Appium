package ios;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Webapp extends Base{

	
	public static void main(String[] args) throws MalformedURLException {
		
		IOSDriver<IOSElement>driver=capabilities();
		
		driver.get("http://gmail.com");

		driver.findElementByName("Email").sendKeys("rahul");

		driver.findElementByName("Passwd").sendKeys("rahul");

		driver.findElementByName("signIn").click();

		 

	}

}
