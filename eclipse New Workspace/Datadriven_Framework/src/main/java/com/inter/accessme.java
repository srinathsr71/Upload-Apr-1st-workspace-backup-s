package com.inter;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface accessme {
	
	public void scrollByVisibity(WebDriver driver,WebElement ele);
	public void clicksele(WebElement ele);
	public void selectByIndex(WebElement ele,int index);
	public void selectByvalue(WebElement ele,String val);
	public void selectBytext(WebElement ele,String te);
	public boolean radiobuttons(WebElement ele,WebDriver driver);
	public boolean switchtoNewwindow(WebDriver driver);
	public boolean switchtoOldwindow(WebDriver driver);
	public int getalllinks(WebDriver siz);
	public void alerts(WebDriver driver);
	public String gettitle(WebDriver driver);
	public String getcurrenturl(WebDriver driver);
	public void screenshot(WebDriver driver,String filename) throws IOException;
	public String getcurrenttime();
	


}
