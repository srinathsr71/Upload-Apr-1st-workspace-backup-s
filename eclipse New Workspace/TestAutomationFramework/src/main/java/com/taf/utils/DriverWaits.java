package com.taf.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverWaits {
	public static long page_load_time=10;
	public static long implicit_wait_time=15;
	
	public void pagelodtime(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(page_load_time,TimeUnit.SECONDS);
	}
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(implicit_wait_time,TimeUnit.SECONDS);
	}
	

}
