package popUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp1 
{
	public static void main(String[] args) throws InterruptedException, IOException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://letcode.in/test");
			  Thread.sleep(2000);
			  
			  d.findElement(By.xpath("//a[text()='Dialog']")).click();
			  Thread.sleep(2000);
			  
			 // d.findElement(By.id("accept")).click();
			//  d.findElement(By.id("confirm")).click();
			  
		    d.findElement(By.id("prompt")).click();
		      Thread.sleep(2000);
		      
		      d.switchTo().alert().sendKeys("Akshada");
		      Thread.sleep(2000);
		      
			  //To Click to OK button
			  d.switchTo().alert().accept();
			  
			  //Click on the Cancel button
			 // d.switchTo().alert().dismiss();
			  
			  //For get text in the popup
			//String text = d.switchTo().alert().getText();
			//System.out.println(text);
	   }

}
