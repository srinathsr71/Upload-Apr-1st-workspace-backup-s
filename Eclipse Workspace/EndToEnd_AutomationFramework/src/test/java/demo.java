import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	WebDriver driver;
@Test
public void test1() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://demoqa.com/text-box");
	Thread.sleep(5000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://rahulshettyacademy.com/practice-project");
	Thread.sleep(5000);
	//Set<String> tabs=new HashSet<String>(driver.getWindowHandles());
	
	//String[] handlearray=tabs.toArray(new String[0]);
	List<String> handles = new ArrayList<>(driver.getWindowHandles());
	int sis=handles.size();
	System.out.println(sis);
	driver.switchTo().window(handles.get(1));
	Thread.sleep(5000);
	driver.findElement(By.id("userName")).sendKeys("abcde");
	driver.findElement(By.id("userEmail")).sendKeys("abs@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("bangalore");
	driver.findElement(By.id("permanentAddress")).sendKeys("bangalore");
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(2));
	Thread.sleep(5000);
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(3));
	String curl=driver.getCurrentUrl();
	System.out.println(curl);
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(2));
	driver.close();
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(1));
	driver.close();
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(3));
	driver.close();
	Thread.sleep(5000);
	driver.switchTo().window(handles.get(0));
	driver.close();
	Thread.sleep(5000);
	
	
	
	
	
}
	
	
	
	
	
	
}





