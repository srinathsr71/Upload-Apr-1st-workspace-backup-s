package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver.Options;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class test6 {

	AndroidDriver driver;

	@Test
	public void camera() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("demo");
		options.setAppPackage("com.android.camera2");
		options.setAppActivity("com.android.camera.CameraActivity");
		String appiumServerURL = "http://127.0.0.1:4723";
		driver = new AndroidDriver(new URL(appiumServerURL), options);
		System.out.println("camera is openig");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		options.setAppActivity("com.android.camera.CActivity");
		System.out.println("capturing photo");
		
	}
	
	
}
