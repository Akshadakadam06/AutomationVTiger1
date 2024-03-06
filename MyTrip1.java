package popUp;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyTrip1 
{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException  
	   {
		

			/* WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://www.easemytrip.com/");
			  Thread.sleep(2000);*/
			  
			  //Steps To avoid notification popup by browser option class
			  
			  //1:Create object of chrome options class
			  ChromeOptions op = new ChromeOptions();
			  
			  //2:Call the addArguments() 
			  op.addArguments("--disable-notifications");
			  
			  //3:Create chrome driver object by passing the reference of chrome options class into chrome driver constructor
			  
			  WebDriver b =new ChromeDriver(op);
			  b.get("https://www.easemytrip.com/");
			  
	   }
}
