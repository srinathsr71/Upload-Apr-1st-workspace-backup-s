package com.assign.ele;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assign.base.Parent;

public class demo extends Parent {
	
	public demo(WebDriver driver) {
		Parent.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement unam;
	@FindBy(name="password")
	private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement logn;
	
	
	
	public void logininfo(String uname,String pasword) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		unam.sendKeys(uname);
		pwd.sendKeys(pasword);
		logn.click();
		
	}
	
	
	
}
