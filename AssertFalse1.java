package basicTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse1 
{
	@Test
	   public void Myntra1() throws InterruptedException
	   {

		  WebDriver d =new ChromeDriver();
		 // d.manage().window().maximize();
		  Thread.sleep(2000);
		  d.get("https://www.myntra.com/");
		  Thread.sleep(2000);
		  
		  WebElement search = d.findElement(By.className("desktop-searchBar"));
		 
		// Assert.assertFalse(search.isEnabled()); //==>True condition-->Fail
		  Assert.assertFalse(search.isSelected());  //==>False Condition-->Pass
		 System.out.println("Hii!");
	   }
}
