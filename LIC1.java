package popUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC1 
{
	public static void main(String[] args) throws InterruptedException, IOException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://licindia.in/");
			  Thread.sleep(2000);
			  d.findElement(By.xpath("//button[text()='Close']")).click();
			  Thread.sleep(2000);
			  d.findElement(By.xpath("//span[text()=' Pay Premium ']")).click();
			  
			  String a = d.switchTo().alert().getText();
			  System.out.println(a);
			  
			  
			 
	   }
}
