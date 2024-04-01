package com.demo.pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.base.parent;

public class loginpage extends parent{
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement usid;
	@FindBy(name="password")
	private WebElement pid;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	
	
	public void login(String uname,String pasw) throws InterruptedException {
		Thread.sleep(6000);
		usid.sendKeys(uname);
		pid.sendKeys(pasw);
		btn.click();
		
	}

}
