import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script3 {

	
	
	@Test
	public void test2() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://techcanvass.com/");
		driver.manage().window().maximize();
		WebElement menuitem=driver.findElement(By.linkText("About Us"));
		Actions ac=new Actions(driver);
		ac.moveToElement(menuitem).build().perform();
		Thread.sleep(5000);
		
}
}
