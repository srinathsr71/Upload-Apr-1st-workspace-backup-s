package com.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginform {
	WebDriver driver;
	//constructor 
	public loginform(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="name")
	private WebElement uid;
	@FindBy(xpath = "//div[@class='signup-form']/form/input[3][@name='email']")
	private WebElement pid;
	@FindBy(xpath = "//div[@class='signup-form']/form/button[@type='submit']")
	private WebElement lid;
	
	public void details(String uname,String pwd) {
		uid.sendKeys(uname);
		pid.sendKeys(pwd);
		lid.click();
	}
	
	
	
	
	
	
	
	
	
	

}
