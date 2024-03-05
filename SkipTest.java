package basicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTest 
{
	@Test
	   public void Zomato() throws InterruptedException
	   {

		  WebDriver d =new ChromeDriver();
		  Thread.sleep(2000);
		  d.get("https://www.zomato.com/");
		  Thread.sleep(2000);
	   }
	@Test 
	public void Facebook() throws InterruptedException
	{
		 WebDriver d =new ChromeDriver();
		  Thread.sleep(2000);
		  d.get("https://www.facebook.com/");
		  Thread.sleep(2000);
		 String acURL = d.getCurrentUrl();
		 String exURL = "https://www.facebook.com/ak";
		 Assert.assertEquals(acURL, exURL);
	}
   
	@Test(dependsOnMethods ="Facebook")
	public void Swiggy() throws InterruptedException
	{
		 WebDriver d =new ChromeDriver();
		  Thread.sleep(2000);
		  d.get("https://www.swiggy.com/");
		  Thread.sleep(2000);
	}
 	
}
