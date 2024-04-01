package mobile_automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class test5 {
	AndroidDriver driver;

	@BeforeTest
	public void bt() throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("demo");
		options.setAppPackage("com.google.android.dialer");
		options.setAppActivity(".DialtactsActivity");
		String appiumServerURL = "http://127.0.0.1:4723";
		driver = new AndroidDriver(new URL(appiumServerURL), options);
	}

	@Test
	public void swipe() throws InterruptedException {

		WebElement Panel = driver.findElement(AppiumBy.accessibilityId("lists_pager"));
		SwipeScreen(Panel, driver);
		SwipeScreen(Panel, driver);

	}

	public static void SwipeScreen(WebElement el, AndroidDriver driver) throws InterruptedException {
		WebElement Panel = el;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Dimension dimension = Panel.getSize();
		int Anchor = Panel.getSize().getHeight() / 2;
		Double ScreenWidthStart = dimension.getWidth() * 0.8;
		int scrollStart = ScreenWidthStart.intValue();
		Double ScreenWidthEnd = dimension.getWidth() * 0.2;
		int scrollEnd = ScreenWidthEnd.intValue();
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(scrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(scrollEnd, Anchor))
				.release().perform();

		Thread.sleep(6000);
	}

}
