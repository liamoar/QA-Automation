package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelUtillity.Xls_Reader;

public class DataDrivenTest {
    
	 static WebDriver mdriver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
		mdriver = new ChromeDriver();
		mdriver.manage().window().maximize();
		mdriver.manage().deleteAllCookies();
		Thread.sleep(2000);
		mdriver.get("https://qa.ordering-ko.ekbana.info/system/login");
		Thread.sleep(5000);
		System.out.println("successfull");
		
		 Xls_Reader reader = new Xls_Reader("Excel/Data.xlsx");
		
		// String username=  reader.getCellData("Sheet1", "username", 2);
	    //System.out.println(username);
			
		// String password = reader.getCellData("Sheet1", "password", 2);
		//System.out.println(password);
		 
		// String id = reader.getCellData("Sheet1", "id", 2);
		// System.out.println(id);
		 	
		 
		
	}

}

