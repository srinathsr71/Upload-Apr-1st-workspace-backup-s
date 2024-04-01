import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script5 {
	@Test
	public void test2() throws InterruptedException, IOException {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.moolya.com/");
		driver.manage().window().maximize();
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
        File sourceFile = scrshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\Admin\\Desktop\\screen\\mine.png");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot taken");

	}

}
