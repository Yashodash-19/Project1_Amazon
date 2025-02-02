package amazon_Project1.Project1_Amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTests implements IRetryAnalyzer
{
	int count=0;
	int retrycount=1;
	

	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<retrycount)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
