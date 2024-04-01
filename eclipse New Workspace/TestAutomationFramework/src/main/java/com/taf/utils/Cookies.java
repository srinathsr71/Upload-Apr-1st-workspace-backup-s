package com.taf.utils;

import org.openqa.selenium.WebDriver;

public class Cookies {
	
	
	
	public void delcookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}

}
