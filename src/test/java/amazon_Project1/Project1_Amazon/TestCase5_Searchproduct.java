package amazon_Project1.Project1_Amazon;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//Test searching for products using its name like shoe
import org.testng.annotations.Test;


public class TestCase5_Searchproduct  extends LoginQuit
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
	}
	
	

}
