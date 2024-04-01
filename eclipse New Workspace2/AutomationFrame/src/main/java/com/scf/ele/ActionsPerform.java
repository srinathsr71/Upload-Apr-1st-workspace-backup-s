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
	@FindBy(tagName = "body")
	private WebElement clicking;
	
	@FindBy(xpath="//div[@class='menu-content']/ul/li")
	private List<WebElement> list;
	
	@FindBy(xpath="//ul[@class='share-menu']/li")
	private List<WebElement> list1;
	
	
	public void rightclick() {
		GenericStaticMethods.implicitWait(driver);
		GenericStaticMethods.contextClickElement(clicking);
		
	}
	
	public void lists() {
		int s=list.size();
		System.out.println(s);
		for(WebElement sg:list) {
			String sh=sg.getText();
			System.out.println(sh);
			if(sh.equals("Share")) {
				sg.click();
			}
		}
	}
	public void lists1() {
		int j=list1.size();
		System.out.println(j);
		for(WebElement sw:list1) {
			String ts=sw.getText();
			System.out.println(ts);
			if(ts.equals("Twitter")) {
				sw.click();
				System.out.println("Menu item Twitter is clicked");
			}
			GenericStaticMethods.implicitWait(driver);
			if(ts.equals("Instagram")) {
				sw.click();
				System.out.println("Menu item Instagram is clicked");
			}
			if(ts.equals("Dribble")) {
				sw.click();
				System.out.println("Menu item Dribble is clicked");
			}
			GenericStaticMethods.implicitWait(driver);
			if(ts.equals("Telegram")) {
				sw.click();
				System.out.println("Menu item Telegram is clicked");
			}
			
			
			
		}
		
		
	}

}
