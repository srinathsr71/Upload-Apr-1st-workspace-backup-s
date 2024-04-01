package com.scf.testsuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorksTest {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
//			DesiredCapabilities cap=new DesiredCapabilities();
//			cap.setCapability("browserName","chrome");
//			try {
//				driver=new RemoteWebDriver(new URL("http://13.233.212.24:4444/wd/hub"),cap);
//			}catch(MalformedURLException e) {
//				e.printStackTrace();
//			}
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//driver=new FirefoxDriver();
//			DesiredCapabilities cap=new DesiredCapabilities();
//			cap.setCapability("browserName","edge");
//			try {
//				driver=new RemoteWebDriver(new URL("http://13.233.212.24:4444/wd/hub"),cap);
//			}catch(MalformedURLException e) {
//				e.printStackTrace();
//			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshworks.com/");
	}
@Test
public void test1() {
	System.out.println(driver.getTitle());
}
@Test
public void test2() {
	System.out.println(driver.getCurrentUrl());
//	List<WebElement> footerlinks=driver.findElements(By.cssSelector("ul.footer-nav li a"));
//	int s=footerlinks.size();
//	for(int i=0;i<=s;i++) {
//		String text=footerlinks.get(i).getText();
//		System.out.println(text);
//	}
}

}
