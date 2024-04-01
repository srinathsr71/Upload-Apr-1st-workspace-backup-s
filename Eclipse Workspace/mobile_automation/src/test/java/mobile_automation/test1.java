package mobile_automation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class test1 {
	AndroidDriver driver;
	    @Test
	    public void mobiletest() throws MalformedURLException {
	    	 
	        UiAutomator2Options options= new UiAutomator2Options();
	        options.setDeviceName("Pixel");
	        options.setApp("D:\\veera project\\Eclipse Workspace\\mobile_automation\\src\\test\\resources\\ApiDemos-debug.apk");
	        String appiumServerURL="http://127.0.0.1:4723/";
	        driver = new AndroidDriver(new URL(appiumServerURL), options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(AppiumBy.accessibilityId("Views")).click();
	        driver.findElement(AppiumBy.accessibilityId("Buttons")).click();
	        WebElement text=driver.findElement(AppiumBy.accessibilityId("Normal"));
	        String textt=text.getText();
	        System.out.println(textt);     
	    }

	}	
	
	
