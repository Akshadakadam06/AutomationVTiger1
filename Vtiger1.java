package popUp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger1
{
	public static void main(String[] args) throws InterruptedException, IOException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://demo.vtiger.com/vtigercrm/");
			  Thread.sleep(2000);
	   }
}
