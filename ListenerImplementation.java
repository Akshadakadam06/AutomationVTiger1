package CommonUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener
{
	ExtentReports report;
	WebDriverUtil wutil ;

	@Override
	public void onTestStart(ITestResult result)
	{
		// TODO Auto-generated method stub
	//	System.out.println("TestScript Excution is started");
		 String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript Excution is started");
	}

	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
	   String methodName = result.getMethod().getMethodName();
	     // Reporter.log(methodName+"TestScript Excution is Pass",true);
	    // ExtentTest test = new ExtentTest("");
	  
	}

	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
	   String message	= result.getThrowable().toString();
		 String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript Excution is Fail"+message,true);
		
		
		
	}
 
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
		 String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"TestScript Excution is Skipped");
	}

	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		// TODO Auto-generated method stub
		//Reporter.log("TestScript Excution is started");
	}

	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		// TODO Auto-generated method stub
		//Reporter.log("TestScript Excution is started");
	}

	
	@Override
	public void onStart(ITestContext context) 
	{
		// TODO Auto-generated method stub
		//System.out.println("To start the the excution");
		//Reporter.log("TestScript Excution is started");
		
		//Create the object of ExtentSparkReporter class just to configure extent
		JavaUtil jutil = new JavaUtil();
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extentreport/report"+jutil.getRandomNumber()+".html");
		reporter.config().setDocumentTitle("vTigerCRM");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Organization");
		
		//create the object of ExtentReports to genaret ExtentReports
		//ExtentReports report = new ExtentReports();
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("OS", "Window");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("chromeversion", "121");
		report.setSystemInfo("Author", "Akku");
		
		
		
		
	}

	
	@Override
	public void onFinish(ITestContext context) 
	{
		
		// TODO Auto-generated method stub
       
		//System.out.println("To Finish the the excution");
		//Reporter.log("To Finish the Excution");
		
		report.flush();
	}
    
}
