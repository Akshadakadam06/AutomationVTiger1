package vTigerCRM;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.ExcelUtil;
import CommonUtils.JavaUtil;
import CommonUtils.ListenerImplementation;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

@Listeners(ListenerImplementation.class) 

public class Contacts1
{
	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	ExcelUtil eutil = new ExcelUtil();
	JavaUtil  jutil = new  JavaUtil();
	
	

	@Test
	public void OrganizationTest() throws IOException, InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
    
   
	//To read data from Property File
	String URL = putil.getDataFromPropertyFile("Url");
	String USERNAME =putil.getDataFromPropertyFile("Username");
	String PASSWORD = putil.getDataFromPropertyFile("passwoed");
	
	//To read data from excel file
        String fname = eutil.getDataFromExcel("Contact", 0, 1);
         String lname = eutil.getDataFromExcel("Contact", 1, 1);
         String group = eutil.getDataFromExcel("Contact",2, 1);
         String orgname = eutil.getDataFromExcel("Contact", 3, 1);
          
	//String fname = eutil.getDataFromExcel("Contact",0,1);
//	String lname = eutil.getDataFromExcel("Contact", 1, 1)

	//To launch the application
	driver.get(URL);
	
	//Login
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	//click on contact
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	
	//Click on create contact-->(+)
	driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
	
	//To enter the first name
	driver.findElement(By.name("firstname")).sendKeys(fname);
	
	//To enter the last name
	driver.findElement(By.name("lastname")).sendKeys(lname);
	
	
	
	
	//Click on group radio button
	driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
	
	//In drop down select Tem selling
	WebElement drop = driver.findElement(By.name("assigned_group_id"));
	//Select s = new Select(drop);
	//s.selectByVisibleText("Team Selling");
	wutil.handledropdown(drop,group);
	
	//Click on select-->(+)
	driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
	
	//Transfer the control from parent window to child window
	  wutil.switchwindow(driver, "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
	 
	//To Enter organization name in search field
		driver.findElement(By.id("search_txt")).sendKeys(orgname);
		
		//Click on search now button
		driver.findElement(By.name("search")).click();
		
		driver.findElement(By.xpath("//a[text()='Qspiders174']")).click();
	  
		//Parent Window
	  wutil.switchwindow(driver,"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
	  
	  //Click on save
	    driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	    Thread.sleep(2000); 
	    //Take ScreenShot
	    wutil.screenshot(driver,"Contact");
	    
	    Thread.sleep(2000); 
	  
	//Mousehover on image
		WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		wutil.mousehover(driver, image);
		
		//Click on Signout
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
	
	
	
	
	
	
	}
}
