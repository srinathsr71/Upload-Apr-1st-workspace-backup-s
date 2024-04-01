package com.webelerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilitiespages.Waitsutilities;

public class regpage {
	WebDriver driver;
	public Waitsutilities fh=new Waitsutilities();
	
	public regpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement btn;
	@FindBy(id="user_title")
	private WebElement dropdowns;
	@FindBy(id="user_firstname")
	private WebElement textname;
	@FindBy(id="user_surname")
	private WebElement tsurname;
	@FindBy(id="user_phone")
	private WebElement tphone;
	@FindBy(id="user_dateofbirth_1i")
	private WebElement tdate;
	@FindBy(id="user_dateofbirth_2i")
	private WebElement tmonth;
	@FindBy(id="user_dateofbirth_3i")
	private WebElement tyear;
	@FindBy(id="licencetype_f")
	private WebElement tradio;
	@FindBy(id="user_licenceperiod")
	private WebElement tdropdown;
	@FindBy(id="user_occupation_id")
	private WebElement tdrop;
	@FindBy(id="user_address_attributes_street")
	private WebElement taddress;
	@FindBy(id="user_address_attributes_city")
	private WebElement tcity;
	@FindBy(id="user_address_attributes_county")
	private WebElement tcountry;
	@FindBy(id="user_address_attributes_postcode")
	private WebElement tpostalcode;
	@FindBy(id="user_user_detail_attributes_email")
	private WebElement temail;
	@FindBy(id="user_user_detail_attributes_password")
	private WebElement tpwd;
	@FindBy(id="user_user_detail_attributes_password_confirmation")
	private WebElement tcpwd;
	@FindBy(name="submit")
	private WebElement tbtn;
	
	
	public void regdetails(String tname,String tsname,String phoneno,String address,String city,String country,
			String postalcode,String email,String pwds,String cpwds) {
		btn.click();
		textname.sendKeys(tname);
		tsurname.sendKeys(tsname);
		tphone.sendKeys(phoneno);
		taddress.sendKeys(address);
		tcity.sendKeys(city);
		tcountry.sendKeys(country);
		tpostalcode.sendKeys(postalcode);
		temail.sendKeys(email);
		tpwd.sendKeys(pwds);
		tcpwd.sendKeys(cpwds);
		
		
			
	}
	
	public void dropdowns() {
		fh.implicitWait(driver);
		dropdowns.click();
		Select s=new Select(dropdowns);
		s.selectByValue("Doctor");
		tdate.click();
		Select s1=new Select(tdate);
		s1.selectByValue("1938");
		tmonth.click();
		Select s2=new Select(tmonth);
		s2.selectByValue("4");
		tyear.click();
		Select s3=new Select(tyear);
		s3.selectByValue("25");
		tdropdown.click();
		Select s4=new Select(tdropdown);
		s4.selectByValue("16");
		tdrop.click();
		Select s5=new Select(tdrop);
		s5.selectByValue("12");
	}
	
	public void  radiobuton() {
		tradio.click();
		tbtn.click();
	}
	
	
	
	
	/*
	 * public void validate_regpage(String curl) { String
	 * sgd=driver.getCurrentUrl(); System.out.println(sgd);
	 * System.out.println(curl); if(sgd.equals(curl)) {
	 * System.out.println("the current page is login page"); }else {
	 * System.out.println("the current page is not login page"); }
	 * 
	 * 
	 * }
	 */
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
