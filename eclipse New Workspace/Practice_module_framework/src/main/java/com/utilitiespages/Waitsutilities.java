package com.utilitiespages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Waitsutilities {
	
	
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}	

}
