package vtigerCRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtils.ExcelUtils;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebdriverUtil;

public class Leads {

	WebdriverUtil wutil = new WebdriverUtil();
	ExcelUtils eutil = new ExcelUtils();
	PropertyFileUtil putil = new PropertyFileUtil();
	
	@Test
	public void LeadsTest() throws IOException, InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitwait(driver);
		
		// get data from property file
		String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME = putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("Password");
		
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		
		// get data from excel file
		String fname = eutil.getDataFromExcel("Contacts", 0, 1);
		String lname = eutil.getDataFromExcel("Contacts", 1, 1);
		String team = eutil.getDataFromExcel("contacts", 2, 1);
		String company = eutil.getDataFromExcel("Contacts", 4, 1);
		String sal = eutil.getDataFromExcel("Contacts", 5, 1);
		
		
		// click on leads
				driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
				
				// click on plus sign
				driver.findElement(By.cssSelector("img[alt='Create Lead...']")).click();
				
				Thread.sleep(2000);
				
				//handle dropdown of salutation
				WebElement salutation = driver.findElement(By.name("salutationtype"));
				wutil.handledropdown(salutation, sal);
				
				Thread.sleep(2000);
				
				//enter first name
				driver.findElement(By.name("firstname")).sendKeys(fname);
				
				// enter last name
				driver.findElement(By.name("lastname")).sendKeys(lname);
				
				//Enter company name
				driver.findElement(By.name("company")).sendKeys(company);
				
				// Click on group
		   driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
				
				
	
				// Handle drop down
		   
		      WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		      
		      wutil.handledropdown(dropdown,team);
				
		
		
		
		
		
		
	}
}