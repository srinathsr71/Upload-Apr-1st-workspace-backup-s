package mobile_automation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class test4 {
	AndroidDriver driver;
	AppiumDriverLocalService service;
	@BeforeTest
	public void bt() throws MalformedURLException {
		 service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				 .withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(40)).build();
		
		service.start();
		
		
	}
	
	@Test
	public void launchappium() throws MalformedURLException {
		UiAutomator2Options options= new UiAutomator2Options();
	     options.setDeviceName("demo");
	     options.setApp("D:\\veera project\\Eclipse Workspace\\mobile_automation\\src\\test\\resources\\ApiDemos-debug.apk");
	     String appiumServerURL="http://127.0.0.1:4723";
	      driver = new AndroidDriver(new URL(appiumServerURL), options);
	      service.stop();
	}
}
