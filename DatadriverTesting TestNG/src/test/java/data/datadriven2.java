package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven2 {

	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";	
	WebDriver driver;
	
	@BeforeTest()
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		
	}
	@Test()
	public void test2() throws IOException, InterruptedException {
		File e=new File("H://datadriven.xlsx");//location of the data file 
		FileInputStream fl=new FileInputStream(e);//it will read the excel file.
		XSSFWorkbook wb=new XSSFWorkbook(fl);//the workbook contain sheets.
		XSSFSheet sh=wb.getSheet("sheet1");//read a particular sheet
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);
		//int rowcount=sh.getFirstRowNum();
		for(int i=0;i<=rowcount;i++)//i=1
		{
			String user=sh.getRow(i).getCell(0).getStringCellValue();//admin
			String pass=sh.getRow(i).getCell(1).getStringCellValue();//admin345
			//System.out.println(user);
				System.out.println(user);
				System.out.println(pass);
			//String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys(user);//Admin//admin
			driver.findElement(By.name("password")).sendKeys(pass);//admin123//admin345
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			String str1=driver.getCurrentUrl();
			System.out.println(str1);
			if(str1.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
				
			}else{
				System.out.println(str1);
				for(int j=i+1;j<=i;j++)//j=2
				{
					String user1=sh.getRow(j).getCell(0).getStringCellValue();//
					String pass2=sh.getRow(j).getCell(1).getStringCellValue();
					System.out.println(user);
					System.out.println(pass);
					Thread.sleep(5000);
					driver.findElement(By.name("username")).sendKeys(user1);
					driver.findElement(By.name("password")).sendKeys(pass2);
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@type='submit']")).click();
					break;	
					
				}
				
				
			}
			
			
		}
		driver.close();
		
		
	}
	
	
	
	
}













