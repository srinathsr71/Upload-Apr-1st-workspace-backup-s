package com.model.ele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.model.actions.actions;
import com.model.base.parent;
import com.model.utilities.waitsutility;

public class loginele extends parent {
	
	WebDriver driver;
	actions shs=new actions();
	waitsutility sja=new waitsutility();
	public loginele(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	private WebElement usid;
	@FindBy(id="password")
	private WebElement pid;
	@FindBy(id="submit")
	private WebElement btn;
	@FindBy(name="username")
	private WebElement usi;
	@FindBy(name="password")
	private WebElement pids;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btns;
	
	
	
	public void login(String uname,String pasw) {
		usid.sendKeys(uname);
		pid.sendKeys(pasw);
		shs.clicksele(btn);
		
	}
	public void login(String unames,String pasws,String anotherurl) {
		driver.navigate().to(anotherurl);
		sja.implicitWait(driver);
		usi.sendKeys(unames);
		pids.sendKeys(pasws);
		shs.clicksele(btns);
		
		
	}
	
	

}
