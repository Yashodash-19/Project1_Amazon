package amazon_Project1.Project1_Amazon;
//Verify that searching with filters (e.g., category, price range) yields accurate results

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase6_searchwithfilters  extends LoginQuit
{
	@Test(retryAnalyzer=RetryTests.class)
	public void search_product() throws InterruptedException, EncryptedDocumentException, IOException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		LoginPage loginpage=new LoginPage(driver);
		Thread.sleep(1000);
		loginpage.un();
		loginpage.continue_button();
		loginpage.pwd();
		loginpage.sigin();
		homepage.search();
		FilterPage filter=new FilterPage(driver);
		filter.selectfilter(driver);
				
	}

}
