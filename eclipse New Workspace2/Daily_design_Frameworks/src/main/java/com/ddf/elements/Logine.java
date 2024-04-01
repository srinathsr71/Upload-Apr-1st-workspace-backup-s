package com.ddf.elements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assign.base.Parent;

public class Logine {
	WebDriver driver;
	public Logine(WebDriver driver) {
		Parent.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "username")
	private WebElement un;
	@FindBy(name = "password")
	private WebElement ps;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ln;
	
	
	@FindBy(id = "user_firstname")
	private WebElement una;
	@FindBy(id = "user_surname")
	private WebElement pwds;
	
	@FindBy(id="user_phone")
	private WebElement mn;
	
	@FindBy(id="resetform")
	private WebElement rf;
	
	public void loginCredentials(String uname,String pwd) throws InterruptedException {
		Thread.sleep(7000);
		un.sendKeys(uname);
		ps.sendKeys(pwd);
		ln.click();
		
			
	}

	public void loginCredentials(String uname,String pwd,String mobileno) throws InterruptedException {
		Thread.sleep(7000);
		una.sendKeys(uname);
		pwds.sendKeys(pwd);
		mn.sendKeys(mobileno);
		rf.click();
		
			
	}

	
	

}
