package popUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoId
{
	public static void main(String[] args) throws InterruptedException, IOException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://demo.guru99.com/test/upload/");
			  Thread.sleep(2000);
			  
			  //Click on the choose file
			  d.findElement(By.id("file_wraper0")).click();
			  Thread.sleep(2000);
			  Thread.sleep(2000);
			  //To Upload the file in RunTime
			  Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\practiceSelenium.exe");
	   }
}
