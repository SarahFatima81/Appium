package appium;
import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TouchAction2 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		TouchAction t = new TouchAction(driver);
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		t.press(driver.findElementByXPath("//*[@content-desc = '12']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc = '9']")).release().perform();

	}

}
