package com.taf.elepages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.taf.main.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(name="email")
	private WebElement bv;
	@FindBy(name="password")
	private WebElement bd;
	@FindBy(name="submit")
	private WebElement btnss;
	

	
public String valiatelogintitle() {
	return driver.getTitle();
}
	
public void logininfo(String emaa,String pasa) throws IOException {
	bv.sendKeys(pda.PropInfo(emaa));
	bd.sendKeys(pda.PropInfo(pasa));
	btnss.click();

}





}
