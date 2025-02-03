package amazon_Project1.Project1_Amazon;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener
{
	
	public void captureScreenshot(ITestResult result) 
	{
		try {
			SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd_HH-mm_ss-SSS");
			String fileName = dt1.format(new Date());

			File Destination = new File("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Screenshot\\Test-" + result.getName() + "_" + fileName + ".png");

			// WebDriver driver = (WebDriver)
			result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(result.getInstance());
			// WebDriver driver = LoginandQuit.driver; //
		//LoginQuit.getDriver();
			TakesScreenshot ts = (TakesScreenshot) LoginQuit.driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);

			FileHandler.copy(Source, Destination);
			System.out.println("ScreenCaptured");
			System.out.println("Source:" + Source);
			System.out.println("Destination:" + Destination);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
    
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("result is failed for test=" + result.getName());
		System.out.println("result is failed for test=" + result.getName());
		captureScreenshot(result);
	}
	

}
