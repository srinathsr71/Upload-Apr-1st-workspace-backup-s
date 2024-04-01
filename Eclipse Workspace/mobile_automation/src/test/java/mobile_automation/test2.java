package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class test2 {
	AndroidDriver driver;
	
@BeforeTest
public void bt() throws MalformedURLException {
	 UiAutomator2Options options= new UiAutomator2Options();
     options.setDeviceName("Pixel");
     options.setApp("D:\\veera project\\Eclipse Workspace\\mobile_automation\\src\\test\\resources\\ApiDemos-debug.apk");
     String appiumServerURL="http://127.0.0.1:4723";
      driver = new AndroidDriver(new URL(appiumServerURL), options);
}

@Test
public void Scrolling() {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	String uiAutomatorText = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"WebView\"));";
	WebElement webViewElement = driver.findElement(AppiumBy.androidUIAutomator(uiAutomatorText));
	webViewElement.click();

}







}
