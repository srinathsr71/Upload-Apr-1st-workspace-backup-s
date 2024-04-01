package com.day1.elerepo;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.day1.utility.datainfo;
import com.day1.utility.waitsutility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logins {
	WebDriver driver;
	public waitsutility sj=new waitsutility();

	public logins(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	private WebElement btn;
	@FindBy(xpath="//button[contains(text(),'Add Customer')]")
	private WebElement btns;
	@FindBy(xpath="//*[@ng-model='fName']")
	private WebElement fname;
	@FindBy(xpath="//*[@ng-model='lName']")
	private WebElement lname;
	@FindBy(xpath="//*[@ng-model='postCd']")
	private WebElement poscode;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement crebtn;
	
	
	
	public void login(String fna,String lna,String pcode) throws IOException {
		
		
		sj.imwait(driver);
		btn.click();
		btns.click();
		fname.sendKeys(fna);
		lname.sendKeys(lna);
		poscode.sendKeys(pcode);
		crebtn.click();
		Alert c=driver.switchTo().alert();
		c.accept();
		
		
		
}
	
	
	
	
	
	
	
	
	

}
