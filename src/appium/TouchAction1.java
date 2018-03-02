package appium;
import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TouchAction1 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text = 'Expandable Lists']")).perform();
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text = '1. Custom Adapter']")).perform(); 
		new TouchAction((PerformsTouchActions) driver).press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofSeconds(3)).release().perform();
		//t.press(driver.findElementByXPath("//android.widget.TextView[@text = 'People Names']")).waitAction.(release().perform();
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text = 'Sample menu']").getText());
	}

}
