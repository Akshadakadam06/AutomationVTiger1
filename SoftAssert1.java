package basicTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 
{
	@Test
	   public void Myntra1() throws InterruptedException
	   {

		  WebDriver d =new ChromeDriver();
		 // d.manage().window().maximize();
		  Thread.sleep(2000);
		  d.get("https://www.myntra.com/");
		  Thread.sleep(2000);
		  
		 String acURL = d.getCurrentUrl();
		  String exURL = "https://www.myntra.com/";
		  
		  //Create object of soft assert class
		  SoftAssert sa = new SoftAssert();
		  
		  //call assertEqual(boolean actual ,boolean expected)
		  sa.assertEquals(acURL, exURL);
		  
		  System.out.println("Hii!");
		  
		  sa.assertAll(); //Compulsory call this method
	   }
}
