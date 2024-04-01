package com.day1.utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitsutility {

	
public void imwait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
public void exwait(WebDriver driver,WebElement ele,datainfo da,String data) throws IOException {
	WebDriverWait wa=new WebDriverWait(driver, Duration.ofSeconds(10));
	wa.until(ExpectedConditions.visibilityOf(ele)).sendKeys(da.datacess(data));
}
	
	
}
