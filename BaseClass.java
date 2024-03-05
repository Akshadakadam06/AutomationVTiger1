package CommonUtils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	public WebDriver driver;
	
	//public static WebDriver sdriver;
	
	 //WebDriver driver = new ChromeDriver();	
	 
	//Object creation
	   WebDriverUtil wutil = new WebDriverUtil();
		PropertyFileUtil putil = new PropertyFileUtil();
		
	@ BeforeSuite
	 public void BS()
	 {
		System.out.println("Connect to Data Base");
	 }
	
	
   @BeforeClass
  //Use to lunch the application
   public void BC() throws IOException
   {   
	     String URL = putil.getDataFromPropertyFile("Url");
	     WebDriver driver = new ChromeDriver();
	  
		//To maximize the window
		wutil.maximize(driver);
		//To apply wait for findelement()
		wutil.implicitwait(driver);	
		
		//sdriver
		//To loaunch the application
		  driver.get(URL);
		
   }
   
   @BeforeMethod
   //Used to login to the application
   public void BM() throws IOException
   {
	  // String URL = putil.getDataFromPropertyFile("Url");
		String USERNAME =putil.getDataFromPropertyFile("Username");
		String PASSWORD = putil.getDataFromPropertyFile("passwoed");
		
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
   }
   
   @AfterMethod
   //Logout from the application
   public void AM() throws InterruptedException
   {
	   Thread.sleep(2000);
	 //Mousehover on image
	 		WebElement image = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
	 		wutil.mousehover(driver, image);
	 		
	 		//Click on Signout
	 		driver.findElement(By.xpath("//a[text()='Sign Out']")).click(); 
   }
   
   @AfterClass
   //Use to close the Browser
   public void AC()
   {
	  driver.quit(); 
   }
   
   @AfterSuite
   public void As()
   {
	   System.out.println("Disconnect from Data Base");
   }
  
   
}
