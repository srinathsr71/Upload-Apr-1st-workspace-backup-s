package com.assign.ele;

import java.time.Duration;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assign.base.Parent;


public class LoginPage extends Parent{
	
	public LoginPage(WebDriver driver) {
		Parent.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "loginbtn0")
	private WebElement login;
	
	@FindBy(id="txtLoginid")
	private WebElement un;
	
	@FindBy(id="txtpassword")
	private WebElement pd;
	
	@FindBy(name="btnLogin")
	private WebElement ln;
	
	public void loginCredentials(String uname,String pwd) throws InterruptedException {
		
		login.click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		int s=tabs.size();
		System.out.println(s);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().window(tabs.get(1));
		un.sendKeys(uname);
		Thread.sleep(7000);
		pd.sendKeys(pwd);
		Thread.sleep(4000);
		ln.click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		Stream<String> se=a.getText().lines();
		System.out.println(se);
		a.accept();
		Thread.sleep(5000);		
	}
	
	

}
