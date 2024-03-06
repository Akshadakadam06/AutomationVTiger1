package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTrip 
{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://www.easemytrip.com/");
			  Thread.sleep(2000);
			  
			  
			  //Steps to handel notification on popup
			  
			  //Create the object of Robot Class and handle the AWTException
			  Robot r = new Robot();
			  
			  //Press the key on  keyBord 
			  r.keyPress(KeyEvent.VK_TAB);
			  Thread.sleep(2000);
			  
			  //Release the key on keyboard
			  r.keyRelease(KeyEvent.VK_TAB);
			  
			  Thread.sleep(4000);
			  	
			  //Press the key on  keyBord 
			  r.keyPress(KeyEvent.VK_ENTER);
			  Thread.sleep(2000);
			  
			  //Release the key on keyboard
			  r.keyRelease(KeyEvent.VK_ENTER);
			  
	   }
}
