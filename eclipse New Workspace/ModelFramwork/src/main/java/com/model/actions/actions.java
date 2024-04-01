package com.model.actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.model.base.parent;
import com.model.inter.accessmethods;

public class actions extends parent implements accessmethods
{
	
public void scrollByVisibity(WebDriver driver,WebElement ele) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);	
}

public void clicksele(WebElement ele) {
	ele.click();
}

public void selectByIndex(WebElement ele,int index) {
	Select sj=new Select(ele);
	sj.selectByIndex(index);
}

public void selectByvalue(WebElement ele,String val) {
	Select ss=new Select(ele);
	ss.selectByValue(val);
}

public void selectBytext(WebElement ele,String te) {
	Select as=new Select(ele);
	as.selectByVisibleText(te);
}

public boolean radiobuttons(WebElement ele,WebDriver driver) {
	boolean flag=ele.isSelected();
	if(!flag) {
		ele.click();
		System.out.println("the element is selected");
		flag=true;
		
	}else {
		System.out.println("the element is not selected");
	}
	return true;
}

public boolean switchtoNewwindow(WebDriver driver) {
	boolean flag=false;
	try {
		Set<String> s=driver.getWindowHandles();
		Object popup[]=s.toArray();
		driver.switchTo().window(popup[1].toString());
		flag=true;
		return flag;
	}
	catch(Exception e) {
		flag=false;
		return flag;
		
	}
	finally {
		if(flag) {
			System.out.println("window is navigated");
		}else {
			System.out.println("window is not navigated");
		}
	}
}
public boolean switchtoOldwindow(WebDriver driver) {
	boolean flag=false;
	try {
		Set<String> s=driver.getWindowHandles();
		Object popup[]=s.toArray();
		driver.switchTo().window(popup[0].toString());
		flag=true;
		return flag;
	}
	catch(Exception e) {
		flag=false;
		return flag;
		
	}
	finally {
		if(flag) {
			System.out.println("window is navigated to old window");
		}else {
			System.out.println("window is not navigated to old window");
		}
	}
}


public int getalllinks(WebDriver siz) {
	
	List<WebElement> ls=siz.findElements(By.tagName("a"));
	int a=ls.size();
	System.out.println(a);
	for(WebElement column:ls) {
		String h=column.getAttribute("href");
		System.out.println(h);
	}
	return a;
}
public void alerts(WebDriver driver) {
	Alert al=driver.switchTo().alert();
	al.accept();
	Alert als=driver.switchTo().alert();
	als.dismiss();
	Alert alr=driver.switchTo().alert();
	alr.sendKeys("santhosh");
	
}

public String gettitle(WebDriver driver) {
	boolean flag=false;
	String text=driver.getTitle();
	if(flag) {
		System.out.println("Title of the page is:\""+text+"\"");
	}
	return text;
}

public String getcurrenturl(WebDriver driver) {
	boolean flag=false;
	String cur=driver.getCurrentUrl();
	if(flag) {
		System.out.println("the url of the page is:\""+cur+"\"");
	}
	return cur;
}

public void screenshot(WebDriver driver,String filename) throws IOException  {
	String datetime=new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sou=ts.getScreenshotAs(OutputType.FILE);
	//Move image file to new destination
	FileUtils.copyFile(sou, new File("D://seleniumscreenshot//Screen.png"));
	System.out.println("screenshot is captured");
	
}

public String getcurrenttime() {
	String currentdate=new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
	return currentdate;
}
















}



