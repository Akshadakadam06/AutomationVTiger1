package basicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyntraGetTitle
{
	@Test
	   public void Myntra1() throws InterruptedException
	   {

		  WebDriver d =new ChromeDriver();
		 // d.manage().window().maximize();
		  Thread.sleep(2000);
		  d.get("https://www.myntra.com/");
		  Thread.sleep(2000);
		  String actualTi = d.getTitle();
		  String expTi = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		  
		  //call AssertEquals (boolean actual, boolean expected)
		  Assert.assertEquals(actualTi,expTi );
		  
		  System.out.println(actualTi);
		  
		  
	   }
}
