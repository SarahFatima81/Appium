package appium;
import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragandDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		TouchAction t = new TouchAction(driver);
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'Drag and Drop']").click();
		t.longPress(driver.findElementsByClassName("android.view.View").get(0)).moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();
		
		
	}

}
