package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class test3 {

	AndroidDriver driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		 UiAutomator2Options options= new UiAutomator2Options();
	     options.setDeviceName("demo");
	     options.setApp("D:\\veera project\\Eclipse Workspace\\mobile_automation\\src\\test\\resources\\ApiDemos-debug.apk");
	     String appiumServerURL="http://127.0.0.1:4723";
	      driver = new AndroidDriver(new URL(appiumServerURL), options);
	}
	
	@Test
	public void swipe() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
        WebElement text=driver.findElement(AppiumBy.accessibilityId("Normal"));
        String textt=text.getText();
        System.out.println(textt);
	}
}
