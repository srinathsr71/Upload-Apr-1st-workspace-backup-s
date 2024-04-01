import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
@BeforeTest
public void bt() {
	htmlReporter = new ExtentHtmlReporter("extent.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.get("https://www.techcanvass.com/");
	driver.manage().window().maximize();
}


@Test
public void test1() {
	test = extent.createTest("HomePageTitle");
	test.pass("Opening website");
	String sj=driver.getTitle();
	test.pass("Printing the HomePage Title in console");
	System.out.println("The title of the home page is"+sj);
}

@Test
public void test2() {
	test = extent.createTest("CourseList");
	test.pass("Mouseover the dropdown");
	WebElement ele=driver.findElement(By.xpath("//span[@id='dropdownMenuButton']"));
	test.pass("Displaying the List of BA Courses");
	WebElement ele6=driver.findElement(By.tagName("body"));
	Actions ac=new Actions(driver);
	ac.moveToElement(ele).build().perform();
	test.pass("Printing the List of BA Courses only");
	List<WebElement> ele1=driver.findElements(By.xpath("//ul[@class='BA']/div/div/div/li"));
	for(WebElement sg:ele1) {
		String sa=sg.getText().trim();
		if(sa.isEmpty()) {
			break;
		}
		System.out.println(sa);
	}
	ac.moveToElement(ele6).build().perform();
}
	
@Test
public void test3() throws InterruptedException, IOException {
	Thread.sleep(6000);
	test = extent.createTest("LoginPage");
	test.pass("Clicking the login button");
	driver.findElement(By.id("loginbtn0")).click();
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	int s=tabs.size();
	System.out.println(s);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().window(tabs.get(1));
	test.pass("switching to login window");
	File e=new File("C://Users//Admin//Documents//datainfo.xlsx");//location of the data file 
	FileInputStream fl=new FileInputStream(e);//it will read the excel file.
	XSSFWorkbook wb=new XSSFWorkbook(fl);//the workbook contain sheets.
	XSSFSheet sh=wb.getSheet("login_credentials");//read a particular sheet
	int rowcount=sh.getLastRowNum();
	System.out.println(rowcount);
	//int rowcount=sh.getFirstRowNum();
	for(int i=0;i<=rowcount;i++)//i=1
	{
		String user=sh.getRow(i).getCell(0).getStringCellValue();//Admin//admin//
		String pass=sh.getRow(i).getCell(1).getStringCellValue();//admin123//admin345
		//System.out.println(user);
			System.out.println(user);
			System.out.println(pass);
		//String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("txtLoginid")).sendKeys(user);
		test.pass("Enter the username");
		driver.findElement(By.id("txtpassword")).sendKeys(pass);
		test.pass("Enter the password");
		Thread.sleep(5000);
		driver.findElement(By.name("btnLogin")).click();
		test.pass("click on login button");
		Alert a=driver.switchTo().alert();
		test.pass("switch to alert");
		String se=a.getText();
		test.pass("capturing text from the alert and printing in the console");
		System.out.println(se);
		a.accept();
		Thread.sleep(5000);	
	
}
	
}


@AfterTest
public void at() {
	extent.flush();
	driver.quit();
}

}




