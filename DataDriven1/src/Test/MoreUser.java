package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUtillity.Xls_Reader;

public class MoreUser {
	 
	static WebDriver mdriver;
	static WebElement element;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
			mdriver = new ChromeDriver();
			mdriver.manage().window().maximize();
			mdriver.manage().deleteAllCookies();
			Thread.sleep(2000);
			mdriver.get("https://qa.ordering-ko.ekbana.info/system/login");
			Thread.sleep(3000);
			System.out.println("successfull");

		 Xls_Reader reader = new Xls_Reader("Excel/Data.xlsx");
		 int rowcount = reader.getRowCount("Sheet1");
		
		for(int rownum=2; rownum <= rowcount; rownum++) {
			String firstname =reader.getCellData("Sheet1", "username", rownum);
			System.out.println(firstname);
			
			 String password = reader.getCellData("Sheet1", "password", rownum);
			 System.out.println(password);
			 
			 		 
			  element= mdriver.findElement(By.xpath("//input[@name='username']"));
			  element.sendKeys(firstname);
			  
			  
			  element= mdriver.findElement(By.xpath("//input[@name='password']"));
			  element.sendKeys(password);
			  
			  element= mdriver.findElement(By.xpath("//button[@type='submit']"));
			  element.click();
			  
			  element= mdriver.findElement(By.xpath("//input[@name='username']"));
			  element.clear();			  
			  Thread.sleep(3000);
			  
			  
		}
	}
	

}
