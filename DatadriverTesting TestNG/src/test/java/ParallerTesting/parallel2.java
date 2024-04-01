package ParallerTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel2 {
String url2="https://practicetestautomation.com/practice-test-login/";
WebDriver driver;	
@Parameters("mybrowser")

@BeforeTest()
public void test1(String mybrowser) {
if(mybrowser.equalsIgnoreCase("firefox"))
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}else if(mybrowser.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);

}
}
@Test
public void test2() throws InterruptedException
{
	driver.get(url);
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.id("username")).sendKeys("");
	driver.findElement(By.id("password")).sendKeys("");
	driver.findElement(By.xpath("//button[@class='btn']")).click();
					
	
}
	
}
