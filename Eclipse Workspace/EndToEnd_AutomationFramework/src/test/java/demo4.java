import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo4 {
	
	static WebDriver driver;
	
	@Test
	public static void test2() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mob");
		List<WebElement> data=driver.findElements(By.xpath("//ul[@role='listbox']/li/span[1]"));
		//int si=data.size();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++) {
			if(data.get(i).getText().equals("MobyMax")) {
				data.get(i).click();
				break;
			}
		}
		//Thread.sleep(5000);
		Set<String> id=driver.getWindowHandles();
		int sg=id.size();
		System.out.println(sg);
		waitForTotalWindows(sg,15);
		Iterator<String> it=id.iterator();
		while(it.hasNext()) {
			String first=it.next();
			driver.switchTo().window(first);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		}
	}
	
	public static boolean waitForTotalWindows(int totalwindows,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalwindows));
	}	

}


