package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.waitsutility;

public class elementsrepo {
	
	WebDriver driver;
	public waitsutility hs=new waitsutility();
	public elementsrepo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username")
	private WebElement usnames;
	@FindBy(name="password")
	private WebElement passw;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn;
	
	
	
	
	public void intializing(String uname,String paswd) {
//		hs.implicitWait(driver);
		usnames.sendKeys(uname);
		passw.sendKeys(paswd);
		btn.click();
	}
	
	
	
	
	
	
	
	

}
