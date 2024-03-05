package basicTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue1 
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
		 
		 //Call AssertTrue boolean Condition
		 //Assert.assertTrue(search.isSelected()); //==>False Condition
		 Assert.assertTrue(search.isDisplayed());//==> True condition
		 
		 System.out.println("Hii!");
		  
	   }
}
