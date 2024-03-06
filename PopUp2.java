package popUp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp2
{
	public static void main(String[] args) throws InterruptedException, IOException  
	   {
		

			 WebDriver d =new ChromeDriver();
			  d.manage().window().maximize();
			  Thread.sleep(2000);
			  d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			  Thread.sleep(2000);
}
}
