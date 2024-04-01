import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script2 {
	
	
	
	@Test
	public void test2() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement dragg=driver.findElement(By.id("draggable"));
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		ac.dragAndDropBy(dragg, 100, 100).build().perform();
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
	}

}
