package com.scf.ele;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.operationmethods.GenericStaticMethods;

public class Challenge2 {
	WebDriver driver;
	
	public Challenge2() {
		this.driver=GenericStaticMethods.driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//ul[@id='draggable-list']/li")
	private List<WebElement> list1; 
	
	public void getlist() {
		int h=list1.size();
		System.out.println(h);
		for(WebElement el:list1) {
			String js=el.getText();
			
		}
		
		
		
	}

}
