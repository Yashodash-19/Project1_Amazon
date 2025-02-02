package amazon_Project1.Project1_Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener implements ITestListener
{
	
     WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Failed Testcaes");
		ITestListener.super.onTestFailure(result);
	/*	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\\\Users\\\\yasho\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\\\Fail"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}*/
	}
	

}
