package com.taf.elepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.taf.main.TestBase;
import com.taf.utils.DriverWaits;

public class SignUpPage extends TestBase{
	public static DriverWaits dw=new DriverWaits();

	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement btnsf;
	@FindBy(id="user_title")
	private WebElement dropdownss;
	@FindBy(id="user_firstname")
	private WebElement textnames;
	@FindBy(id="user_surname")
	private WebElement tsurnames;
	@FindBy(id="user_phone")
	private WebElement tphones;
	@FindBy(id="user_dateofbirth_1i")
	private WebElement tdates;
	@FindBy(id="user_dateofbirth_2i")
	private WebElement tmonths;
	@FindBy(id="user_dateofbirth_3i")
	private WebElement tyears;
	@FindBy(id="licencetype_f")
	private WebElement tradios;
	@FindBy(id="user_licenceperiod")
	private WebElement tdropdowns;
	@FindBy(id="user_occupation_id")
	private WebElement tdrops;
	@FindBy(id="user_address_attributes_street")
	private WebElement taddresss;
	@FindBy(id="user_address_attributes_city")
	private WebElement tcitys;
	@FindBy(id="user_address_attributes_county")
	private WebElement tcountrys;
	@FindBy(id="user_address_attributes_postcode")
	private WebElement tpostalcodes;
	@FindBy(id="user_user_detail_attributes_email")
	private WebElement temails;
	@FindBy(id="user_user_detail_attributes_password")
	private WebElement tpwds;
	@FindBy(id="user_user_detail_attributes_password_confirmation")
	private WebElement tcpwds;
	@FindBy(name="submit")
	private WebElement tbtns;
	//Intializing the page objects
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	//all this above page objects elements intialize to driver  using this keyword
	
	
	//Actions
	public String validatepagetitle() {
		return driver.getTitle();
	}
	public LoginPage Registration(String tname,String tsname,String phoneno,String address,String city,String country,
			String postalcode,String email,String pwds,String cpwds) {
		dw.implicitWait(driver);
		btnsf.click();
		textnames.sendKeys(tname);
		tsurnames.sendKeys(tsname);
		tphones.sendKeys(phoneno);
		taddresss.sendKeys(address);
		tcitys.sendKeys(city);
		tcountrys.sendKeys(country);
		tpostalcodes.sendKeys(postalcode);
		temails.sendKeys(email);
		tpwds.sendKeys(pwds);
		tcpwds.sendKeys(cpwds);
		tradios.click();
		dw.implicitWait(driver);
		
		return new LoginPage(driver);
			
	}
	
	public void dropdowns() {
		dw.implicitWait(driver);
		dropdownss.click();
		Select s=new Select(dropdownss);
		s.selectByValue("Doctor");
		tdates.click();
		Select s1=new Select(tdates);
		s1.selectByValue("1938");
		tmonths.click();
		Select s2=new Select(tmonths);
		s2.selectByValue("4");
		tyears.click();
		Select s3=new Select(tyears);
		s3.selectByValue("25");
		tdropdowns.click();
		Select s4=new Select(tdropdowns);
		s4.selectByValue("16");
		tdrops.click();
		Select s5=new Select(tdrops);
		s5.selectByValue("12");
	}
	
	public String validateregpagetitle() {
		return driver.getTitle();
	}
	
	public String validatehometitle() {
		return driver.getTitle();
	}
	
	public void clicks() {
		tbtns.click();
	}

}
