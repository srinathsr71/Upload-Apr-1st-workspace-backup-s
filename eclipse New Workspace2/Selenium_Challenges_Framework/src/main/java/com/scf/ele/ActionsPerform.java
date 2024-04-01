package com.scf.ele;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.operationmethods.GenericStaticMethods;

public class ActionsPerform {
WebDriver driver;
public ActionsPerform() {
	this.driver=GenericStaticMethods.driver;
	PageFactory.initElements(driver,this);
}

@FindBy(name="username")
private WebElement clicking;
	
	
	
	public void rightclick() {
		GenericStaticMethods.implicitWait(driver);		
	}
	
	
			
	
}
