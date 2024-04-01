package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genricutility.waitsutility;


public class Openurl {
WebDriver driver;
public waitsutility f=new waitsutility();	
	public Openurl(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement name;
	@FindBy(name="password")
	private WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	public void enterdetails(String usname,String pasword) {
		f.implicitWait(driver);
		name.sendKeys(usname);
		pwd.sendKeys(pasword);
		btn.click();
		
	}
	
}
