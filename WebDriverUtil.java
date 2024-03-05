package CommonUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class WebDriverUtil 
{
	
	
	
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void implicitwait(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	}
	
	public void handledropdown(WebElement element,String targetedelement)
	{
		
		Select s = new Select(element);
		s.selectByVisibleText(targetedelement);
	}
	
	public void mousehover(WebDriver driver,WebElement element) 
	{
		
		Actions a = new Actions(driver);
		a.moveToElement(element);
		a.perform();
	}
	
	public void switchwindow(WebDriver driver,String expectedUrl)
	{
		Set<String> ids = driver.getWindowHandles();
		for(String e: ids)
		{
			String acUrl = driver.switchTo().window(e).getCurrentUrl();
			
			if(acUrl.contains(expectedUrl))
			{
			    break;	
			}
		}
	}
	
	public File screenshot(WebDriver driver,String ScreenshotFileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
	   File temFile =	ts.getScreenshotAs(OutputType.FILE);
	   File destinationFile = new File("./Screenshot/"+ScreenshotFileName+".png");
	   
	   FileUtils.copyFile(temFile, destinationFile);
	   
	   return destinationFile;
		
		
	}
}












