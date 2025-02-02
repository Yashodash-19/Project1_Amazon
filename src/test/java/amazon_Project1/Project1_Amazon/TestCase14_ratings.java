package amazon_Project1.Project1_Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase14_ratings extends LoginQuit
{
	@Test(retryAnalyzer=RetryTests.class)
	public void orderandreturn() throws InterruptedException, EncryptedDocumentException, IOException
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
		OrderPage order=new OrderPage(driver);
		order.ratings();
				
	}
}
