package appium;
import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollTest extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
          AndroidDriver<AndroidElement> driver = Capabilities("real");
          /*if clickable option is not viewable on screen due to its small size use this code
          Dimension size = driver.manage().window().getSize();
          int x = size.getWidth()/2;
          int starty = (int)(size.getHeight()*0.60);
          int endy = (int)(size.getHeight()*0.10);
          driver.swipe(x,starty,x, endy, 2000);*/  //driver.swipe showing error due to appium version incompatibility (version 1.6 works)
		
		driver.findElementByAndroidUIAutomator("text(\"Graphics\")").click();
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PathEffects\"));");


	}

}
              