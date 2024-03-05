package basicTestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraGetURL 
{
	@Test
	   public void Myntra1() throws InterruptedException
	   {

		  WebDriver d =new ChromeDriver();
		 // d.manage().window().maximize();
		  Thread.sleep(2000);
		  d.get("https://www.myntra.com/");
		  Thread.sleep(2000);
		  String actualUrl = d.getCurrentUrl();
		  String expURl = "https://www.myntra.com/";
		  
		  //call AssertEquals (boolean actual, boolean expected)
		  Assert.assertEquals(actualUrl, expURl);
		  
		  System.out.println(actualUrl);
		  
		  
	   }
		  
	   
}
