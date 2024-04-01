package com.cfp.pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountspage {
	private WebDriver driver;
	
	public Accountspage()
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="email")
	private WebElement un;
	
	@FindBy(name="password")
	private WebElement pwd;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btn;

	
	public void logininfo(String username,String password) {
		un.sendKeys(username);
		pwd.sendKeys(password);
		btn.click();
	}
	
	
	
	
	
}
